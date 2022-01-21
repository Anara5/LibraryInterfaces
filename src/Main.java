import interfaces.Reader;

public class Main {

    public static void main(String[] args) {

        // here we can add books to our library collection
        Book b1 = new Book("Brave New World");
        Book b2 = new Book("Post Office");
        Book b3 = new Book("Picnic on Roadside");

        // people at our library
        Reader anya = new ReaderImpl("Anya");
        AdministratorLibrarian elena = new AdministratorLibrarian("Elena");
        SupplierImpl alex = new SupplierImpl("Alex");

        // test the code
        elena.overdueNotification(anya);
        anya.takeBook(b3);
        anya.returnBook(b1);
        elena.orderBook(alex, "Happy New Year");
        alex.deliveryBook("Happy New year");
        elena.findAndIssueBook("DevOps", anya);
        alex.takeBook(b2);

    }
}
