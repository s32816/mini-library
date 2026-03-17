public class Reader {
    private String firstName;
    private String lastName;
    private int cardNumber;
    private int borrowCount;

    public Reader(String firstName, String lastName, int cardNumber, int borrowCount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.borrowCount = borrowCount;
    }

    void printData(){
        System.out.println("Reader info: ");
        System.out.println("Name: " + firstName + ", last name: " + lastName + ", card number: " + cardNumber + ", borrowed books: " + borrowCount);
    }

    void increaseBorrowCount(int plus){
        borrowCount = borrowCount + plus;
        System.out.println("You've increased borrowed books for reader " + firstName);
    }

    void decreaseBorrowCount(int minus){
        borrowCount = borrowCount - minus;
        System.out.println("You've decreased borrowed books for reader " + firstName);
    }
}