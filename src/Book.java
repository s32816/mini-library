public class Book {
    private String title;
    private String author;
    private int pageCount;
    private boolean available;

    public Book(String title, String author, int pageCount, boolean available) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.available = available;
    }

    void printInfo(){
        System.out.println("Book info:");
        if (available){
            System.out.println("Title: " + title + ", author: " + author + ", pages: " + pageCount + ", availability: Yes");
        } else {
            System.out.println("Title: " + title + ", author: " + author + ", pages: " + pageCount + ", availability: No");
        }
    }

    void borrow(){
        if(available){
            available = false;
            System.out.println("You've borrowed a book");
        } else {
            System.out.println("You can't borrow already borrowed book");
        }
    }

    void returnBook(){
        if(!available){
            available = true;
            System.out.println("You've returned a book");
        } else {
            System.out.println("You can't return available book");
        }
    }
}