package book;

import Author.Author;

public class Book extends Author {
    Author author = new Author();

    private String title;
    private String ISBN;
    private Boolean available;

    public Book(String title, Author author, String ISBN, Boolean available) {
        this.title = title;
        this.author = author;
        if (ISBN.length() != 13 || !ISBN.matches("[0-9]+")) {
            throw new IllegalArgumentException("Invalid ISBN format");
        }
        this.ISBN = ISBN;
        this.available = available;
    }
}

