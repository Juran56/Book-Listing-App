package com.pranabchakma.googlebooklist;

import java.util.List;

/**
 * Created by Pranab on 7/17/2018.
 */

public class Book {
    public String title;
    public String authors;
    public String publisher;
    public String publishDate;
    public String description;
    public String pageCount;
    public String categories;

    public Book(String title, String authors, String publisher, String publishDate, String description, String pageCount, String categories) {
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
        this.publishDate = publishDate;
        this.description = description;
        this.pageCount = pageCount;
        this.categories = categories;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthors() {
        return authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public String getDescription() {
        return description;
    }

    public String getPageCount() {
        return pageCount;
    }

    public String getCategories() {
        return categories;
    }
}
