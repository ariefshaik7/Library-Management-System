public class Book {

    private int bookId;
    private String bookTitle;
    private String bookAuthor;
    private boolean isAvailable;

    public Book(int bookId, String bookTitle, String bookAuthor) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.isAvailable = true;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
