import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
    Scanner scanner = new Scanner (System.in);
    UserInterface userInterface = new UserInterface();

    while(true){
        int option = userInterface.showMenu(scanner);
        if (option == 0)
            break;

        switch (option) {
            //case 1 -> //show the method witch will list the books
                
            default -> System.out.println("Plese, select a valid option");
        }
    }

    }
}
