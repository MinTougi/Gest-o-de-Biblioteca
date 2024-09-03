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
            4 - Check the book avaliability
            0 - Quit
            
            Choose a Option:\n
            """;
// show the menu itens
    public int showMenu (Scanner scanner){
        System.out.println(MENU);
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;

    }
    public void returnToMenu() {
        System.out.println("\nPress enter to Return to menu");
        scanner.nextLine();
        System.out.println("Returning to main menu...");
    }
    public void checkBookAvaliability() {
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
}

