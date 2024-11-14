public class Book {
    String bookID;
    String title;
    String author;
    boolean isAvailable;

    public Book(String bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String toString() {
        return "Book ID: " + bookID + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable;
    }
}