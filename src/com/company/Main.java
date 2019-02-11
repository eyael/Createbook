package com.company;

public class Main {


    public static void main(String[] args) {

        // Default constructor
        Book book = new Book();
        book.setAuthor("Book title");
        book.setDescription("Book decription");

        // Overloaded constructor
        Book book1 = new Book("Book1 Title", "Book1 description", "Book1 Author", 20.1, true);

        System.out.println(book1.toString());





    }
}
