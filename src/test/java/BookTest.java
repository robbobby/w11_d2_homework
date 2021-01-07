import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;
    private Book book1;
    @Before public void setUp() {
        book = new Book("LOTR", "J. R. R. Tolkien", "Fantasy");
        book1 = new Book("Games of Thrones", "George R. R. Martin", "Fantasy");
    }
    @Test public void bookHasName() {
        assertEquals("LOTR", book.getTitle());
    }
@Test public void bookHasAuthor() {
        assertEquals("J. R. R. Tolkien", book.getAuthor());
    }
@Test public void bookHasGenre() {
        assertEquals("Fantasy", book.getGenre());
    }
}
