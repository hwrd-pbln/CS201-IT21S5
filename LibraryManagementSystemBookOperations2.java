package lab2;

public class LibraryManagementSystemBookOperations2 {

    public static void removeBook() {
        if (LibraryManagementSystem.books.isEmpty()) {
            System.out.println("No books to remove.");
            System.out.println(); // Add a blank line after showing the message
            return;
        }

        LibraryManagementSystem.viewBooks();

        System.out.print("Enter index of book to remove: ");
        int index = LibraryManagementSystem.scanner.nextInt() - 1;
        LibraryManagementSystem.scanner.nextLine(); // Consume newline

        if (index >= 0 && index < LibraryManagementSystem.books.size()) {
            LibraryManagementSystem.books.remove(index);
            System.out.println("Book removed.");
        } else {
            System.out.println("Invalid index.");
        }

        System.out.println(); // Add a blank line after removing a book
    }
}