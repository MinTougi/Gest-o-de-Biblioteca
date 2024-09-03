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

}

