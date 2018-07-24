package com.pranabchakma.googlebooklist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Pranab on 7/17/2018.
 */

public class BooksAdapter extends ArrayAdapter<Book> {

    public BooksAdapter( Context context, List<Book> books) {
        super(context,0 ,books);
    }
    public View getView(int position, View convertView , ViewGroup parents){
        View listItemView = convertView;

        if (listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.book_list_item,parents,false);
        }
        Book book = getItem(position);
        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText("Title "+book.getTitle());
        TextView authors = (TextView)listItemView.findViewById(R.id.authors);
        authors.setText("Authors:"+book.getAuthors());
        TextView description = (TextView) listItemView.findViewById(R.id.description);
        description.setText("Description:"+book.getDescription());
        TextView publisher = (TextView) listItemView.findViewById(R.id.publisher);
        publisher.setText("Publisher:"+book.getPublisher());
        TextView publishDate = (TextView) listItemView.findViewById(R.id.publishDate);
        publishDate.setText("Publish Date"+book.getPublishDate());
        TextView pagecount = (TextView) listItemView.findViewById(R.id.pagecount);
        pagecount.setText("Page count:"+book.getPageCount());
        TextView categories = (TextView) listItemView.findViewById(R.id.categories);
        categories.setText("Categories: "+book.getCategories());

        return listItemView;
    }
}
