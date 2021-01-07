import java.util.ArrayList;

public class Library {
    private final byte CAPACITY;
    private final ArrayList<Book> BOOK_COLLECTION;

    public Library(byte capacity) {
        this.CAPACITY = capacity;
        this.BOOK_COLLECTION = new ArrayList<Book>();
    }

    public boolean add(Book book) {
        return BOOK_COLLECTION.add(book);
    }

    public int bookCollectionSize() {
        return BOOK_COLLECTION.size();
    }

    public byte getCAPACITY() {
        return CAPACITY;
    }
    public boolean hasBooksInStock(){
        return this.bookCollectionSize() > 0;
    }
}

