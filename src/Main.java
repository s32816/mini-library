public class Main {
    public static void main(String[] args){
        Book book1 = new Book("Title1", "Author1", 100, true);
        Book book2 = new Book("Title2", "Author2", 200, false);
        Book book3 = new Book("Title3", "Author3", 300, true);

        book1.printInfo();
        book2.printInfo();
        book3.printInfo();

        book1.borrow();
        book2.returnBook();
        book3.borrow();

    }
}