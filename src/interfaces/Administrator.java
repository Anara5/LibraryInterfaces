package interfaces;

import java.awt.print.Book;

public interface Administrator {

    Book findAndIssueBook(String bookTitle, Reader reader); // admin finds and issues a book to people

    void overdueNotification(Reader reader); // admin notifies people
}
