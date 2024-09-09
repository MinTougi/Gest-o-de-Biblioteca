import java.util.Scanner;

import Author.Author;
import Member.Student;
import Member.Member;
import Member.Professor;
import book.Book;

import java.time.LocalDate;

import static book.Book.Library.books;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        UserInterface userInterface = new UserInterface();
        Book.Library library = new Book.Library();

        // Saving example data
        LocalDate localDate1 = LocalDate.of(1903, 07, 22);
        LocalDate localDate2 = LocalDate.of(1984, 12, 03);
        LocalDate localDate3 = LocalDate.of(1700, 03, 18);
        Author author1 = new Author("Claudio", "Brasil", localDate1);
        Author author2 = new Author("Pedro", "Brasil", localDate2);
        Author author3 = new Author("Robert", "France", localDate3);
        library.addBook(new Book("Book Title 1", author1, "1234327890112", true));
        library.addBook(new Book("Book Title 2", author2, "1234567895512", false));
        library.addBook(new Book("Book Title 3", author3, "4234567815512", true));

        // Creating members
        Member member1 = new Member("Cezinha", "00320");
        Member member2 = new Member("Josimar", "00222");
        Professor professor = new Professor(member1.getMember_name(), member1.getMember_id(), "IT");
        Student student = new Student(member2.getMember_name(), member2.getMember_id(), "IT");

        // Menu loop
        while (true) {
            int option = userInterface.showMenu(scanner);
            if (option == 0) break;
            switch (option) {
                // List books
                case 1:
                    Book.Library.listBook();
                    userInterface.returnToMenu();
                    break;
                // Borrow book
                case 2:
                    Book.Library.borrowBook(scanner);
                    userInterface.returnToMenu();
                    break;
                // Return book
                case 3:
                    Book.Library.returnBook(scanner, books);
                    userInterface.returnToMenu();
                    break;
                // Check book availability
                case 4:
                    userInterface.checkBookAvailability();
                    userInterface.returnToMenu();
                    break;
                // Find books by author
                case 5:
                    userInterface.findBookByAuthor();
                    userInterface.returnToMenu();
                    break;
                // Exit
                case 6:
                    break;
                // Invalid option
                default:
                    System.out.println("Please, select a valid option");
            }
        }
    }
}
