package lab2;

public class LibraryManagementSystemUtils2 {

    public static void displayTotalBooks() {
        System.out.println("---------------------------------------------");
        System.out.println("           Total Number of Books");
        System.out.println("---------------------------------------------");

        if (LibraryManagementSystem.books.isEmpty()) {
            System.out.println("There are currently no books in the library.");
        } else {
            System.out.println("The library currently has " + LibraryManagementSystem.books.size() + (LibraryManagementSystem.books.size() == 1 ? " book." : " books."));
        }

        System.out.println("---------------------------------------------");
        System.out.println(); // Add a blank line for spacing

        System.out.print("Press Enter to return to the main menu...");
        LibraryManagementSystem.scanner.nextLine(); // Wait for user input before returning to the main menu
    }
}