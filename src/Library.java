public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }

    public void addBook(Book book) {
        books[bookCount] = book;
        bookCount++;
    }

    public void printAvailableBooks() {
        System.out.println("Available books:");
        for (int i = 0; i < bookCount; i++) {
            Book book = books[i];
            if (book.isAvailable()) {
                book.printInfo();
            }
        }
        System.out.println();
    }

    public Book findBookByTitle(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equals(title)){
                return books[i];
            }
        }
        return null;
    }

    public int countAvailableBooks() {
        int count = 0;
        for (int i = 0; i < bookCount; i++) {
            Book book = books[i];
            if (book.isAvailable()){
                count++;
            }
        }
        return count;
    }

    public void borrowBook(String title, Reader reader) {
        for (int i = 0; i < bookCount; i++) {
            Book book = books[i];
            if (book.getTitle().equals(title)) {
                if (book.isAvailable()) {
                    book.borrow();
                    reader.increaseBorrowCount(1);
                }
            }
        }
    }

    public void returnBook(String title, Reader reader) {
        for (int i = 0; i < bookCount; i++) {
            Book book = books[i];
            if (book.getTitle().equals(title)) {
                if (!book.isAvailable()) {
                    book.returnBook();
                    reader.decreaseBorrowCount(1);
                }
            }
        }
    }
}