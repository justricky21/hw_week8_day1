import models.Book;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book1;

    @Before
    public void before(){
        book1 = new Book("A Brief History of Time", 1988);
    }

    @Test
    public void bookHasTitle(){
        assertEquals("A Brief History of Time", book1.getTitle());
    }

    @Test
    public void bookHasYearOfRelease(){
        assertEquals(1988, book1.getYearOfRelease());
    }
}
