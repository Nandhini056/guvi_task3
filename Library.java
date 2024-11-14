public class Library {
    Book[] books;
    int bookCount;

    public Library(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Book added successfully!");
        } else {
            System.out.println("Library is full!");
        }
    }

    public void removeBook(String bookID) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookID().equals(bookID)) {
                books[i] = books[bookCount - 1];
                bookCount--;
                System.out.println("Book removed successfully!");
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void borrowBook(String bookID) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookID().equals(bookID) && books[i].isAvailable()) {
                books[i].setAvailable(false);
                System.out.println("Book borrowed successfully!");
                return;
            }
        }
        System.out.println("Book not available or not found!");
    }

    public void returnBook(String bookID) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookID().equals(bookID) && !books[i].isAvailable()) {
                books[i].setAvailable(true);
                System.out.println("Book returned successfully!");
                return;
            }
        }
        System.out.println("Book not found or already available!");
    }

    public void printCatalog() {
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i]);
        }
    }
}