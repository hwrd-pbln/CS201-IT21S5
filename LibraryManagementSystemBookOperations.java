package lab2;

public class LibraryManagementSystemBookOperations {

    public static void addBook() {
        while (true) {
            System.out.println("=========================================");
            System.out.println("Add new book to the library.");
            System.out.println("-----------------------------------------");
            System.out.print("Book title: ");
            String title = LibraryManagementSystem.scanner.nextLine();

            System.out.print("Author: ");
            String author = LibraryManagementSystem.scanner.nextLine();

            System.out.print("Category: ");
            String category = LibraryManagementSystem.scanner.nextLine();

            LibraryManagementSystem.books.add(new Book(title, author, category));
            System.out.println("Book added!");

            System.out.print("Do you want to add another book? (yes/no): ");
            String response = LibraryManagementSystem.scanner.nextLine().toLowerCase();
            if (!response.equals("yes")) {
                break;
            }

            System.out.println(); // Add a blank line after adding a book
        }
    }
}