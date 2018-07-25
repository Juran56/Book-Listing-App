package com.pranabchakma.googlebooklist;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Templates;

public class MainActivity extends AppCompatActivity {
    String queryTerm;
    String basicUrl=" https://www.googleapis.com/books/v1/volumes?q=";
    String searchTerm="android";

    public String BOOK_JSON_URL = basicUrl+searchTerm+"&maxResults=10";

    Button search;
    EditText term;
    BooksAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        search = (Button)findViewById(R.id.searchButton);
        term = (EditText)findViewById(R.id.getSearchTerm);
        term.setText(searchTerm);
        ListView bookListView = (ListView) findViewById(R.id.list);
        //books = QueryUtils.fetchBooksData(); this line goes to in the BookAsyncTask inner classes doInbackground method
        adapter = new BooksAdapter(this,new ArrayList<Book>());
        bookListView.setAdapter(adapter);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                searchTerm=term.getText().toString();
                String url = basicUrl+searchTerm+"&maxResults=10";
                new BookAsyncTask().execute(url);
                Toast.makeText(MainActivity.this," Hello "+searchTerm,Toast.LENGTH_LONG).show();
                Log.i("info","search for "+searchTerm);
            }
        });

        final BookAsyncTask task = new BookAsyncTask();
        task.execute(BOOK_JSON_URL);
    }

    @Override
    protected void onResume() {
        Log.i("onResume",searchTerm);
        super.onResume();
    }
    protected void onPause() {
        Log.i("onPause",searchTerm);
        super.onPause();
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
            List<Book> books= new ArrayList<>();
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
