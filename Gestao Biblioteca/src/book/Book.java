package book;
import java.util.Scanner;
import Author.Author;
import Member.Member;
import java.util.ArrayList;
import java.util.List;

import static Member.Member.findMemberById;

public class Book extends Author {
    Author author = new Author();
    String title;
    String ISBN;
    Boolean available;

    // getters and setters
    public String getTitle() {
        return title;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
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
        public static final List<Book> books = new ArrayList<>();
        public void addBook(Book book) {
            books.add(book); // Method to add books to the list
        }

        // list the books
        public static void listBook() {
            for (Book book : books) {
                System.out.println("Book Title: " + book.title);
                System.out.println("Author: " + book.author);
                System.out.println("ISBN: " + book.ISBN);
                System.out.println("Available: " + book.getAvailability());
                System.out.println("\n--------\n");
            }
        }

        // Find books by the name of the Author
        public static Book findBooksByAuthor(String authorName) {
            for (Book book : books) {
                if (book.getAuthor().getAuthor_name().equalsIgnoreCase(authorName)) {
                    return book;
                }
            }
            return null;
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
        // Method to return the borrowed book
        public static void returnBook(Scanner scanner, List<Book> books) {
            System.out.println("Book Title you want to return: ");
            String titleName = scanner.nextLine();

            for (Book book : books) {
                if (book != null && book.getTitle().equalsIgnoreCase(titleName)) {
                    if (book.getAvailability().equalsIgnoreCase("unavailable")) {
                        book.setAvailable(true);
                        System.out.println("Book returned successfully.");
                    } else {
                        System.out.println("Book is already available.");
                    }
                    return;
                }
            }
            System.out.println("Book not found.");
        }

        // Method to borrow a book
        public static void borrowBook(Scanner scanner) {
            System.out.println("Enter your ID: ");
            String memberId = scanner.nextLine(); // scan the id
            Member borrower = findMemberById(memberId); //
            if (borrower == null) {
                System.out.println("Invalid ID. User not found.");
                return;
            }
            System.out.println("Enter your name (Professor/Student): ");
            String studentProfessorCheck = scanner.nextLine();
            if (!studentProfessorCheck.equalsIgnoreCase(borrower.getMember_name())) {
                System.out.println("Name mismatch. Please enter your correct name.");
                return;
            }
            System.out.println("Enter the title of the book you want to borrow: ");
            String titleToCheck = scanner.nextLine();
            Book book = checkAvailability(titleToCheck);
            if (book == null) {
                System.out.println("Book not found or unavailable.");
                return;
            }
            book.available = false;
            System.out.println("Successfully borrowed " + book.title + " by " + book.author.getAuthor_name());
            System.out.println("Borrowed by: " + studentProfessorCheck);
        }
    }
}