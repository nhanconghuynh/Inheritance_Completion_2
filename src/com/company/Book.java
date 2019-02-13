package com.company;

public class Book extends Product {

    private String author;
    private int pages;

    public Book(){}

    public Book(String str){

        author = str;

    }

    @Override
    public String toString(){
        return  "Code:               " + this.getCode() + "\n" +
                "Description:        " + this.getDescription() + "\n" +
                "Price:              " + this.getFormattedPrice(this.getPrice()) + "\n" +
                "Author              " + this.getAuthor();

    }


    public String getAuthor() {

        return author;

    }



    public void setAuthor(String author) {

        this.author = author;

    }



    public int getPages() {

        return pages;

    }



    public void setPages(int pages) {

        this.pages = pages;

    }

}



