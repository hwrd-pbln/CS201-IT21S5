package lab2;

public class LibraryManagementSystemSearch {

    public static void searchBookByIndexOrTitleOrAuthor() {
        if (LibraryManagementSystem.books.isEmpty()) {
            System.out.println("No books available to search.");
            System.out.println(); // Add a blank line after showing the message
            return;
        }

        System.out.println("Search for a Book");
        System.out.println("-------------------");
        System.out.println("1. Search by Index");
        System.out.println("2. Search by Title");
        System.out.println("3. Search by Author");
        System.out.println("4. Cancel");
        System.out.print("Choose an option: ");
        
        int searchChoice = LibraryManagementSystem.scanner.nextInt();
        LibraryManagementSystem.scanner.nextLine(); // Consume newline

        switch (searchChoice) {
            case 1:
                searchBookByIndex();
                break;
            case 2:
                searchBookByTitle();
                break;
            case 3:
                searchBookByAuthor();
                break;
            case 4:
                System.out.println("Search cancelled.");
                System.out.println(); // Add a blank line for spacing
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                System.out.println(); // Add a blank line for spacing
                break;
        }
    }

    private static void searchBookByIndex() {
        LibraryManagementSystem.viewBooks();
        System.out.print("Enter the index of the book to search (or enter 0 to cancel): ");
        
        if (!LibraryManagementSystem.scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            LibraryManagementSystem.scanner.nextLine(); // Clear the invalid input
            System.out.println(); // Add a blank line for spacing
            return;
        }

        int index = LibraryManagementSystem.scanner.nextInt();
        LibraryManagementSystem.scanner.nextLine(); // Consume newline

        if (index == 0) {
            System.out.println("Search cancelled.");
            System.out.println(); // Add a blank line for spacing
            return;
        }

        index -= 1;

        if (index >= 0 && index < LibraryManagementSystem.books.size()) {
            Book book = LibraryManagementSystem.books.get(index);
            System.out.println();
            System.out.println("Book found:");
            System.out.println("-------------");
            System.out.println("Title   : " + book.getTitle());
            System.out.println("Author  : " + book.getAuthor());
            System.out.println("Category: " + book.getCategory());
            System.out.println("-------------");
            System.out.println(); // Add a blank line after displaying the book details
        } else {
            System.out.println("Invalid index. Please enter a number between 1 and " + LibraryManagementSystem.books.size() + ".");
            System.out.println(); // Add a blank line for spacing
        }
    }

    private static void searchBookByTitle() {
        System.out.print("Enter the title of the book to search: ");
        String title = LibraryManagementSystem.scanner.nextLine();
        
        boolean found = false;
        for (Book book : LibraryManagementSystem.books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println();
                System.out.println("Book found:");
                System.out.println("-------------");
                System.out.println("Title   : " + book.getTitle());
                System.out.println("Author  : " + book.getAuthor());
                System.out.println("Category: " + book.getCategory());
                System.out.println("-------------");
                System.out.println(); // Add a blank line after displaying the book details
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("No book found with the title \"" + title + "\".");
            System.out.println(); // Add a blank line for spacing
        }
    }

    private static void searchBookByAuthor() {
        System.out.print("Enter the author of the book to search: ");
        String author = LibraryManagementSystem.scanner.nextLine();
        
        boolean found = false;
        for (Book book : LibraryManagementSystem.books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println();
                System.out.println("Book found:");
                System.out.println("-------------");
                System.out.println("Title   : " + book.getTitle());
                System.out.println("Author  : " + book.getAuthor());
                System.out.println("Category: " + book.getCategory());
                System.out.println("-------------");
                System.out.println(); // Add a blank line after displaying the book details
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("No book found by the author \"" + author + "\".");
            System.out.println(); // Add a blank line for spacing
        }
    }
}