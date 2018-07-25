package com.pranabchakma.googlebooklist;

import android.text.TextUtils;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pranab on 7/17/2018.
 */

public final class QueryUtils {
    private QueryUtils(){}


    public static List<Book> fetchBooksData(String requestUrl) throws IOException {
        URL url = createUrl(requestUrl);
        String jsonResponse = null;
        jsonResponse= makeHttpRequest(url);
        List<Book> books = getBooksList(jsonResponse);
        return books;
    }
    private static URL createUrl(String stringUrl){
        URL url =null;
        try {
            url=new URL(stringUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    }

    private static String makeHttpRequest(URL url) throws IOException {
        String jsonResponse = "";
        if (url == null){
            return jsonResponse;
        }
        HttpURLConnection connection = null;
        InputStream inputStream = null;
        try{
            connection= (HttpURLConnection)url.openConnection();
            connection.setReadTimeout(10000);
            connection.setConnectTimeout(15000);
            connection.setRequestMethod("GET");
            connection.connect();
            if (connection.getResponseCode() == 200){
                inputStream = connection.getInputStream();
                jsonResponse = readFromStream(inputStream);
            }
            else {
                Log.e("","Error response code"+connection.getResponseCode());
            }
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (connection!=null){
                connection.disconnect();
            }
            if (inputStream !=null){
                inputStream.close();
            }
        }
        return jsonResponse;
    }

    private static String readFromStream(InputStream inputStream) throws IOException {
        StringBuilder string = new StringBuilder();
        if (inputStream!=null){
            InputStreamReader reader = new InputStreamReader(inputStream, Charset.forName("UTF-8"));
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = bufferedReader.readLine();
            while (line!=null)
            {
                string.append(line);
                line=bufferedReader.readLine();
            }
        }
        return string.toString();
    }

    public static List<Book> getBooksList(String bookJson){
        if (TextUtils.isEmpty(bookJson)) return null;
        List<Book> books = new ArrayList<Book>();
        try {
            JSONObject root = new JSONObject(bookJson);
            JSONArray booksArray = root.getJSONArray("items");
            for (int i=0;i<booksArray.length();i++){
                JSONObject currentBook = booksArray.getJSONObject(i);
                JSONObject volumeInfo = currentBook.getJSONObject("volumeInfo");
                String title = volumeInfo.has("title")?volumeInfo.getString("title"):"Title not Avilable";
                String publisher = volumeInfo.has("publisher")?volumeInfo.getString("publisher"):"Publisher not found";
                String publishDate = volumeInfo.has("publishedDate")?volumeInfo.getString("publishedDate"):"No published Date";
                String description= volumeInfo.has("description")? volumeInfo.getString("description"):"No description";
                String pagecount = volumeInfo.has("pageCount")?volumeInfo.getString("pageCount"):" information not avilable";
                String categories = volumeInfo.has("categories")? volumeInfo.getJSONArray("categories").get(0).toString():"Categories not avilable";
                JSONArray authors = volumeInfo.has("authors")? volumeInfo.getJSONArray("authors"):new JSONArray();
                String authorList = (authors.length()<0)? authors.getString(0).toString():"Author informations no avilable";
                Book book = new Book(title,authorList,publisher,publishDate,description,pagecount,categories);
                books.add(book);
            }
        } catch (JSONException e) {
            Log.e("QueryUtils","error",e);
        }
        return books;
    }
}
