package com.company;

public class Book {
    private String booktitle;
    private String description;
    private String author;
    private double price;
    private boolean isInStock;

    public Book() {
        System.out.println("the constructor has run");
    }


    public Book(String booktitle, String description, String author, double price, boolean isInStock) {
        this.booktitle = booktitle;
        this.description = description;
        this.author = author;
        this.price = price;
        this.isInStock = isInStock;
    }

    public String getBooktitle() {
        return booktitle;
    }

    public void setBooktitle(String booktitle) {
        this.booktitle = booktitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    @Override
    public String toString() {
        return "Book{" +
                "booktitle='" + booktitle + '\'' +
                ", author='" + author + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}