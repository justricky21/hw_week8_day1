import db.DBAuthor;
import db.DBBook;
import models.Author;
import models.Book;

public class Runner {

    public static void main(String[] args) {
        Book book = new Book("The Lord of Flies", 1954);
        Author author = new Author("William", "Golding", 1911);
        DBBook.save(book);
        DBAuthor.save(author);
    }
}
