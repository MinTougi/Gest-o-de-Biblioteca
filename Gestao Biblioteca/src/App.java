import java.util.Scanner;
import Author.Author;
import book.Book;

import java.time.LocalDate;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        UserInterface userInterface = new UserInterface();
        Book.Library library = new Book.Library();
        Book.Library checkAvailability = new Book.Library();

        // Data save
        LocalDate localDate1 = LocalDate.of(1903, 07, 22);;
        LocalDate localDate2 = LocalDate.of(1984, 12, 03);;
        LocalDate localDate3 = LocalDate.of(1700, 03, 18);;
        Author author1 = new Author ("Claudio", "Brasil", localDate1);
        Author author2 = new Author ("Pedro", "Brasil", localDate2);
        Author author3 = new Author ("Robert", "França", localDate3);
        library.addBook(new Book("Book Title 1", author1, "1234327890112", true));
        library.addBook(new Book("Book Title 2", author2, "1234567895512", false));
        library.addBook(new Book("Book Title 3", author3, "4234567815512", true));


        // Case check -> Menu
    while(true){
        int option = userInterface.showMenu(scanner);
        if (option == 0) 
            break;
        switch (option) {
            //case 1 -> //show the method witch will list the books
            case 1:
                Book.Library.listBook();
                System.out.println("Press enter to Return to menu");
                break;
            //case 2 -> //use the method witch will borrow a book
            case 2:

                break;
            //case 3 -> //use the method witch will return a book
            case 3:
                break;
            //case 4 -> //use the method witch will check the availability of a book
            case 4:
                System.out.println("Enter the title of the book you want to check:");
                String titleToCheck = scanner.nextLine();
                Book availableBook = Book.Library.checkAvailability(titleToCheck);
                if (availableBook != null) {
                    System.out.println("Book found!");
                    System.out.println("Title: " + availableBook.getTitle());
                    System.out.println("Author: " + availableBook.getAuthor());
                    System.out.println("Available: " + availableBook.getAvailability());
                } else {
                    System.out.println("Book not found or unavailable.");
                }
                break;
            //case 5 -> //Finish the running code
            case 5:
                break;
            //Default option to give a feedback to the user about the wrong number they put
            default: System.out.println("Plese, select a valid option");
        }

    }

    }
}
