package com.pranabchakma.googlebooklist;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    String queryTerm;
    String basicUrl=" https://www.googleapis.com/books/v1/volumes?q=";
    String searchTerm="android";

    public String BOOK_JSON_URL = basicUrl+searchTerm+"&maxResults=10";
    List<Book> books;
    BooksAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView bookListView = (ListView) findViewById(R.id.list);
        //books = QueryUtils.fetchBooksData();
        adapter = new BooksAdapter(this,new ArrayList<Book>());
        bookListView.setAdapter(adapter);

        BookAsyncTask task = new BookAsyncTask();
        task.execute(BOOK_JSON_URL);
    }
    
    public boolean isOnline(Context context){
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(context.CONNECTIVITY_SERVICE);
        NetworkInfo info = cm.getActiveNetworkInfo();
        boolean isConnected = info!= null && info.isConnectedOrConnecting();
        return isConnected;
    }

    private class BookAsyncTask extends AsyncTask<String,Void,List<Book>>{

        @Override
        protected List<Book> doInBackground(String... urls) {
            List<Book> books= new ArrayList<Book>();
            if (urls.length<1 || urls[0]==null){
                return null;
            }
            try {
                books = QueryUtils.fetchBooksData(urls[0]);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return books;
        }

        @Override
        protected void onPostExecute(List<Book> books) {
            adapter.clear();
            if (books !=null && !books.isEmpty()){
                adapter.addAll(books);
            }
        }
    }
}
