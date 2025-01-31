import java.util.ArrayList;
import java.util.List;

public class Library {


    static List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }


    public void viewAllBooks() {
        for (Book book : books) {
            printBookDetails(book);
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }

    public void searchABookByTitle(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getBookTitle().equalsIgnoreCase(title)) {
                found = true;
                System.out.println("Book is found");
                printBookDetails(book);
                break;
            }
        }
        if (!found) {
            System.out.println("The Book is not available or does not exist.");

        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void searchABookById(int id) {
        boolean found = false;
        for (Book book : books) {
            if (book.getBookId() == id) {
                found = true;
                System.out.println("Book is found");
                printBookDetails(book);
                break;
            }
        }
        if (!found) {
            System.out.println("The Book is not available or does not exist.");

        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void searchABookByAuthor(String author) {
        boolean found = false;
        for (Book book : books) {
            if (book.getBookAuthor().equalsIgnoreCase(author)) {
                found = true;
                System.out.println("Book is found");
                printBookDetails(book);
                break;
            }
        }
        if (!found) {
            System.out.println("The Book is not available or does not exist.");

        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void checkoutABook(String title) {
        for (Book book : books) {
            if (searchABook(title) && book.isAvailable()) {
                book.setAvailable(false);
                System.out.println("You have successfully checked out " + title);
                break;
            } else {
                System.out.println("The Book is either not checked out or does not exist");
            }
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void returnABook(String title) {
        for (Book book : books) {
            if (!book.isAvailable()) {
                book.setAvailable(true);
                System.out.println("You have successfully returned " + title);
                break;
            } else {
                System.out.println("The Book is either not checked out or does not exist");
            }
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }

    private void printBookDetails(Book book) {
        System.out.println(" BOOK ID:" + book.getBookId() + ",\n BOOK TITLE :" + book.getBookTitle() + ",\n BOOK AUTHOR: " + book.getBookAuthor() + ",\n BOOK AVAILABILITY: " + book.isAvailable());

    }

    public boolean searchABook(String title) {
        for (Book book : books) {
            if (book.getBookTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

}
