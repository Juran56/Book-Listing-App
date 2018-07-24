package com.pranabchakma.googlebooklist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView bookListView = (ListView) findViewById(R.id.list);
        List<Book> books = QueryUtils.getBooksList();
        BooksAdapter adapter = new BooksAdapter(this,books);
        bookListView.setAdapter(adapter);
    }
}
