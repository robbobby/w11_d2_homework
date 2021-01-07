import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {
    Library library;
    private Book book;
    private Book book1;

    @Before public void setUp() {
    book = new Book("LOTR", "J. R. R. Tolkien", "Fantasy");
    book1 = new Book("Games of Thrones", "George R. R. Martin", "Fantasy");
    library = new Library((byte)5);
    }
    @Test public void libraryHasCapacity() {
        assertEquals(5, library.getCAPACITY());
    }
    @Test public void checkReturnOnBookInStockFalse() {
        assertFalse(library.hasBooksInStock());
    }
    @Test public void checkReturnOnBookInStockTrue() {
        library.add(book);
        assertTrue(library.hasBooksInStock());
    }
}
