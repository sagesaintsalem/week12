import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class TestLibrary {

    private Library library;
    private Book book;

    @Before
    public void setUp(){
        library = new Library();
        book = new Book("Before the Coffee Gets Cold", "Toshikazu Kawaguchi", "supernatural");
    }

    @Test
    public void getBookCount(){
        assertEquals(0, library.theBookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.theBookCount());
    }

    @Test
    public void libraryHasLimit(){
       Book book2 = new Book("Interview With the Vampire", "Anne Rice", "horror");
       Book book3 = new Book("Dracula", "Bram Stoker", "horror");
       Book book4 = new Book("Twilight", "Stephenie Meyers", "comedy");
       library.addBook(book);
       library.addBook(book2);
       library.addBook(book3);
       library.addBook(book4);
       assertEquals(3, library.theBookCount());
    }
}
