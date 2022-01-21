import interfaces.Reader;

public class ReaderImpl extends User implements Reader {

    public ReaderImpl(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Reader " + name;
    }

    // reader borrows a book from the library
    @Override
    public void takeBook(Object book) {
        System.out.println(this + " takes " + book);
    }

    // reader returns a book to the library
    @Override
    public void returnBook(Object book) {
        System.out.println(this + " returns " + book + " to the library");
    }
}
