package book;

import Author.Author;
import java.util.ArrayList;
import java.util.List;

public class Book extends Author {
     Author author = new Author();
     String title;
     String ISBN;
     Boolean available;

// getters
    public String getTitle() {
        return title;
    }

    public Boolean getAvailable() {
        return available;
    }
    public Author getAuthor() {
        return author;
    }
    //Change the false and true to available and unavailable
    public String getAvailability() {
        return available ? "available" : "unavailable";
    }
    public Book(String title, Author author, String ISBN, Boolean available) {
        this.title = title;
        this.author = author;
        if (ISBN.length() != 13 || !ISBN.matches("[0-9]+")) {
            throw new IllegalArgumentException("Invalid ISBN format");
        }
        this.ISBN = ISBN;
        this.available = available;
    }

    // create a class library to set the books on
    public static class Library {
        private static final List<Book> books = new ArrayList<>();
        public void addBook(Book book) {
            books.add(book); // Method to add books to the list
        }
// list the books
        public static void listBook(){
            for (Book book : books) {
                System.out.println("Book Title: " + book.title);
                System.out.println("Author: " + book.author);
                System.out.println("ISBN: " + book.ISBN);
                System.out.println("Available: " + book.getAvailability());
                System.out.println("\n--------\n");
            }
        }
// Checks the availability of the book
        public static Book checkAvailability(String titleToCheck) {
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(titleToCheck)) {
                    if (book.getAvailability().equalsIgnoreCase("available")) {
                        return book;
                    } else {
                        return null; // Book found and available
                    }
                }
            }
            return null;
        }
    public static void borrowBook(){
            for (Book book : books) {
                if (book.getAvailable()) {
                    book.available = false;
                }
            }
            }
        }
    }


