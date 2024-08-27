package lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {
    protected static ArrayList<Book> books = new ArrayList<>();
    protected static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            LibraryManagementSystemUtils.printHeader();
            LibraryManagementSystemUtils.printMenu();

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    LibraryManagementSystemBookOperations.addBook();
                    break;
                case 2:
                    LibraryManagementSystemBookOperations2.removeBook();
                    break;
                case 3:
                    LibraryManagementSystemSearch.searchBookByIndexOrTitleOrAuthor();
                    break;
                case 4:
                    viewBooks();
                    break;
                case 5:
                    LibraryManagementSystemUtils2.displayTotalBooks();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }

            System.out.println(); // Add a blank line between operations
        }
    }

    public static void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            System.out.println(); // Add a blank line after showing the message
            return;
        }

        int maxIndexLength = "Index".length();
        int maxTitleLength = "Title".length();
        int maxAuthorLength = "Author".length();
        int maxCategoryLength = "Category".length();

        for (int i = 0; i < books.size(); i++) {
            maxIndexLength = Math.max(maxIndexLength, Integer.toString(i + 1).length());
            Book book = books.get(i);
            maxTitleLength = Math.max(maxTitleLength, book.getTitle().length());
            maxAuthorLength = Math.max(maxAuthorLength, book.getAuthor().length());
            maxCategoryLength = Math.max(maxCategoryLength, book.getCategory().length());
        }

        maxIndexLength += 2;
        maxTitleLength += 2;
        maxAuthorLength += 2;
        maxCategoryLength += 2;

        printLine(maxIndexLength + maxTitleLength + maxAuthorLength + maxCategoryLength + 13, '-');
        System.out.printf("| %-"+ maxIndexLength + "s | %-"+ maxTitleLength + "s | %-"+ maxAuthorLength + "s | %-"+ maxCategoryLength + "s |\n", "Index", "Title", "Author", "Category");
        printLine(maxIndexLength + maxTitleLength + maxAuthorLength + maxCategoryLength + 13, '-');

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.printf("| %-"+ maxIndexLength + "d | %-"+ maxTitleLength + "s | %-"+ maxAuthorLength + "s | %-"+ maxCategoryLength + "s |\n", i + 1, book.getTitle(), book.getAuthor(), book.getCategory());
        }

        printLine(maxIndexLength + maxTitleLength + maxAuthorLength + maxCategoryLength + 13, '-');
        System.out.println(); // Add a blank line after viewing books
    }

    private static void printLine(int length, char ch) {
        for (int i = 0; i < length; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
