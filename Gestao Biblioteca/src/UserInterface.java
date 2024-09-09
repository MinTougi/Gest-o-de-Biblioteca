import book.Book;
import java.util.Scanner;

public class UserInterface {

    Scanner scanner = new Scanner(System.in);
    // Menu
    final String MENU = """
            \n========== Menu ===========
            1 - List books
            2 - Borrow a book
            3 - Return a book
            4 - Check the book availability
            5 - Find books by author name
            0 - Quit
            \nChoose a Option:\n
            """;

    // show the menu itens
    public int showMenu(Scanner scanner) {
        System.out.println(MENU);
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;

    }

    // method to return to menu
    public void returnToMenu() {
        System.out.println("\nPress enter to Return to menu");
        scanner.nextLine();
        System.out.println("Returning to main menu...");
    }

    // checks the book availability
    public void checkBookAvailability() {
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
    }
    public void findBookByAuthor(){
        System.out.println("Enter the author's name: ");
        String authorName = scanner.nextLine();
        boolean found = false;

        for (Book book : Book.Library.books) {
            if (book.getAuthor().getAuthor_name().equalsIgnoreCase(authorName)) {
                System.out.println(" - " + book.getTitle());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books found for this author.");
        }
    }
}

