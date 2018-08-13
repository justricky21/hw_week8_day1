import models.Author;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AuthorTest {

    Author author1;

    @Before
    public void before(){
        author1 = new Author("Stephen", "Hawking", 1942);
    }

    @Test
    public void authorHasFirstName(){
        assertEquals("Stephen", author1.getFirstName());
    }

    @Test
    public void authorHasLastName(){
        assertEquals("Hawking", author1.getLastName());
    }

    @Test
    public void authorHasYearOfBirth(){
        assertEquals(1942, author1.getYearOfBirth());
    }
}
