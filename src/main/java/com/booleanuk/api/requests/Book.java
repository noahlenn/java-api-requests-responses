package com.booleanuk.api.requests;

public class Book {

    private static int bookId = 0;
    private String title;
    private int numPages;

    private String author;
    private String genre;
    private int id;

    public Book(){
        this.id = bookId++;
    }
    public Book(String title, int numPages, String author, String genre) {
        this.title = title;
        this.numPages = numPages;
        this.author = author;
        this.genre = genre;
        this.id = bookId++;
    }


    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumPages() {
        return numPages;
    }
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getBookID() {
        return id;
    }
}
