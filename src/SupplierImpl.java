import interfaces.Reader;
import interfaces.Supplier;

public class SupplierImpl extends User implements Supplier, Reader {

    public SupplierImpl(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Supplier " + name;
    }

    // supplier delivers a book to the admin
    @Override
    public void deliveryBook(String bookTitle) {
        System.out.println(this + " delivers book " + '\'' + bookTitle + '\'');
    }

    // supplier can borrow a book from the library for reading
    @Override
    public void takeBook(Object book) {
        System.out.println(this + " takes " + book);
    }

    // supplier can return a book back to the library
    @Override
    public void returnBook(Object book) {
        System.out.println(this + " returns " + book);
    }
}
