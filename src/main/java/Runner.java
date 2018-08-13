import db.DBAuthor;
import db.DBBook;
import models.Author;
import models.Book;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Book book = new Book("The Lord of Flies", 1954);
        Author author = new Author("William", "Golding", 1911);
        DBBook.save(book);
        DBAuthor.save(author);
        Author foundAuthor = DBAuthor.findById(1);
        Book foundBook  = DBBook.findById(1);
        List<Book> books = DBBook.getAll();
        List<Author> authors = DBAuthor.getAll();
    }
}
