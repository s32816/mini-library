public class Main {
    public static void main(String[] args){
        Library myLibrary = new Library(5);

        Book book1 = new Book("Title1", "Author1", 100, true);
        Book book2 = new Book("Title2", "Author2", 200, false);
        Book book3 = new Book("Title3", "Author3", 300, true);

        Reader reader1 = new Reader("Name1", "LastName1", 1, 5);
        Reader reader2 = new Reader("Name2", "LastName2", 2, 10);

        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.addBook(book3);

//        Book foundbook = myLibrary.findBookByTitle("Title1");
//        foundbook.printInfo();

        myLibrary.printAvailableBooks();
        System.out.println("Total available books: " + myLibrary.countAvailableBooks());

        myLibrary.borrowBook("Title1", reader1);

        myLibrary.printAvailableBooks();
        System.out.println("Total available books: " + myLibrary.countAvailableBooks());

        myLibrary.returnBook("Title1", reader1);

        myLibrary.printAvailableBooks();
        System.out.println("Total available books: " + myLibrary.countAvailableBooks());

//        book1.printInfo();
//        book2.printInfo();
//        book3.printInfo();
//
//        book1.borrow();
//        book2.returnBook();
//        book3.borrow();


//        reader1.printData();
//        reader2.printData();
//
//        reader1.increaseBorrowCount(5);
//        reader1.printData();
//
//        reader2.decreaseBorrowCount(2);
//        reader2.printData();

    }
}