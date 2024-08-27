package lab2;

public class LibraryManagementSystemUtils {

    public static void printHeader() {
        System.out.println("***************************************");
        System.out.println("       LIBRARY MANAGEMENT SYSTEM");
        System.out.println("      _____   _____   _____");
        System.out.println("     |       | |       | |       |");
        System.out.println("     | BOOK  | | BOOK  | | BOOK  |");
        System.out.println("     |_______| |_______| |_______|");
        System.out.println("     |_______| |_______| |_______|");
        System.out.println();
        System.out.println("***************************************");
    }

    public static void printMenu() {
        System.out.println(" Menu:");
        System.out.println("***************************************");
        System.out.println("1. Add Book");
        System.out.println("2. Remove Book");
        System.out.println("3. Search Book by Index, Title, or Author");
        System.out.println("4. View Books");
        System.out.println("5. Display Total Number of Books");
        System.out.println("6. Exit");
        System.out.println("***************************************");
        System.out.print("Choose an option: ");
    }
}