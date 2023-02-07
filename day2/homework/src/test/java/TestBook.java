import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBook {
    Book book;

    @Before
    public void setUp(){
        book = new Book("Before the Coffee Gets Cold", "Toshikazu Kawaguchi", "supernatural");

    }

    @Test
    public void bookHasTitle(){
        assertEquals("Before the Coffee Gets Cold", book.hasTitle(book));
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Toshikazu Kawaguchi", book.hasAuthor(book));
    }

    @Test
    public void bookHasGenre(){
        assertEquals("supernatural", book.hasGenre(book));
    }

}
