public class Main {
    public static void main(String[] args) {
        Library library = new Library(5);

        Book book1 = new Book("B001", "Book Title 1", "Author 1");
        Book book2 = new Book("B002", "Book Title 2", "Author 2");
        Book book3 = new Book("B003", "Book Title 3", "Author 3");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("Library Catalog:");
        library.printCatalog();

        library.borrowBook("B001");
        library.returnBook("B001");

        library.removeBook("B002");

        System.out.println("Updated Library Catalog:");
        library.printCatalog();
    }
}