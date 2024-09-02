package book;

import Author.Author;

import java.util.ArrayList;
import java.util.List;




public class Book extends Author {
    Author author = new Author();
     String title;
     String ISBN;
     Boolean available;


    public Book(String title, Author author, String ISBN, Boolean available) {
        this.title = title;
        this.author = author;
        if (ISBN.length() != 13 || !ISBN.matches("[0-9]+")) {
            throw new IllegalArgumentException("Invalid ISBN format");
        }
        this.ISBN = ISBN;
        this.available = available;
    }
    public static class Library {
        private static List<Book> books = new ArrayList<>();
        public void addBook(Book book) {
            books.add(book); // Method to add books to the list (optional)
        }
        public static void listBook(){
            for (Book book : books) {
                System.out.println("Book Title: " + book.title);
                System.out.println("Author: " + book.author);
                System.out.println("ISBN: " + book.ISBN);
                System.out.println("Available: " + book.available);
                System.out.println("\n--------\n");
            }
        }
        }

}


