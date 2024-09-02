
import Author.Author;
import book.Book;

import java.time.LocalDate;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner (System.in);
        UserInterface userInterface = new UserInterface();
        Book.Library library = new Book.Library();
        LocalDate LocalDate = null;
        Author author1 = new Author ("Claudio", "Brasil", LocalDate);
        library.addBook(new Book("Book Title 1", author1, "1234567890112", true));
        library.addBook(new Book("Book Title 1", author1, "1234567890112", true));

    while(true){
        int option = userInterface.showMenu(scanner);
        if (option == 0) 
            break;
        switch (option) {
            //case 1 -> //show the method witch will list the books
            case 1:

                Book.Library.listBook();
                break;
            //case 2 -> //use the method witch will borrow a book
            case 2:
                break;
            //case 3 -> //use the method witch will return a book
            case 3:
                break;
            //case 4 -> //use the method witch will check the avaliability of a book
            case 4:
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
