import interfaces.Administrator;
import interfaces.Librarian;
import interfaces.Reader;
import interfaces.Supplier;

import java.awt.print.Book;

public class AdministratorLibrarian extends User implements Administrator, Librarian {

    public AdministratorLibrarian(String name) {
        super(name);
    }

    @Override
    public Book findAndIssueBook(String bookTitle, Reader reader) {
        System.out.println(name + " finds and issues a book " + '\'' + bookTitle + '\'' + " to " + reader);
        return null;
    }

    @Override
    public String toString() {
        return "Admin " + name;
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println(this + " notifying " + reader + " about a book return");
    }

    @Override
    public void orderBook(Supplier supplier, String bookTitle) {
        System.out.println(this + " orders book " + '\'' + bookTitle + '\'' + " from " + supplier);
    }
}
