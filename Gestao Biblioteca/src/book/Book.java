package book;

import Author.Author;

import java.time.LocalDate;

public class Book extends Author {
    Author author = new Author();

    private String title;
    private String ISBN;
    private Boolean available;

    public Book(String title, Author author, String ISBN, Boolean available) {
        this.title = title;
        this.author = author;

        // Validate ISBN format (assuming a specific format)
        if (ISBN.length() != 13 || !ISBN.matches("[0-9]+")) {
            throw new IllegalArgumentException("Invalid ISBN format");
        }
        this.ISBN = ISBN;

        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}

