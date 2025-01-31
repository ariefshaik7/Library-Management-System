import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        String welcomeMessage = "====================================================\n"
                + "       Welcome to the Library Management System       \n"
                + "====================================================\n";

        System.out.println(welcomeMessage);
        System.out.println("Library");
        System.out.println("===============================================");
        System.out.println("\nOptions available");
        System.out.println("1.ADD BOOKS");
        System.out.println("2.VIEW ALL BOOKS");
        System.out.println("3.SEARCH BOOK BY TITLE");
        System.out.println("4.SEARCH BOOK BY ID");
        System.out.println("5.SEARCH BOOK BY AUTHOR");
        System.out.println("6.CHECK OUT A BOOK");
        System.out.println("7.RETURN A BOOK");
        System.out.println("===============================================");

        System.out.println("Enter the number of operations you want to perform: ");
        int operations = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < operations; i++) {
            System.out.println("===============================================");
            System.out.println("Enter the operation you want to perform");
            int userInput = scanner.nextInt();
            scanner.nextLine();

            switch (userInput) {
                case 1:
                    System.out.println("Enter the number of books you want to add: ");
                    int numOfBooks = scanner.nextInt();
                    scanner.nextLine();

                    for (int j = 0; j < numOfBooks; j++) {
                        System.out.println("Enter the Book ID: ");
                        int bookId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter the Book Title: ");
                        String bookTitle = scanner.nextLine();
                        System.out.println("Enter the Book Author: ");
                        String bookAuthor = scanner.nextLine();

                        Book newBook = new Book(bookId, bookTitle, bookAuthor);
                        library.addBook(newBook);
                        System.out.println("Book is added successfully !");
                    }
                    break;
                case 2:
                    library.viewAllBooks();
                    break;
                case 3:
                    System.out.println("Enter the Title of the book to search: ");
                    String searchTitle = scanner.nextLine();
                    library.searchABookByTitle(searchTitle);
                    break;
                case 4:
                    System.out.println("Enter the Id of the book to search: ");
                    int searchId = scanner.nextInt();
                    scanner.nextLine();
                    library.searchABookById(searchId);
                    break;
                case 5:
                    System.out.println("Enter the Author of the book to search: ");
                    String searchAuthor = scanner.nextLine();
                    library.searchABookByAuthor(searchAuthor);
                    break;
                case 6:
                    System.out.println("Enter the number of books you want to checkout: ");
                    int noOfCheckoutBooks = scanner.nextInt();
                    scanner.nextLine();
                    for (int k = 0; k < noOfCheckoutBooks; k++) {
                        System.out.println("Enter the Title of the book to checkout: ");
                        String checkoutTitle = scanner.nextLine();
                        library.checkoutABook(checkoutTitle);
                    }
                    break;
                case 7:
                    System.out.println("Enter the number of books you want to return: ");
                    int numberOfBooksReturn = scanner.nextInt();
                    scanner.nextLine();
                    for (int l = 0; l < numberOfBooksReturn; l++) {
                        System.out.println("Enter the Title of the book to return: ");
                        String returnTitle = scanner.nextLine();
                        library.returnABook(returnTitle);
                    }
                    break;

                default:
                    System.out.println("INVALID OPTION !");

            }
            System.out.println("\n===============================================");

        }
        String closingMessage = "=========================================================\n"
                + "       Thank you for using the Library Management System       \n"
                + "=========================================================\n";
        System.out.println(closingMessage);

        scanner.close();
    }
}
