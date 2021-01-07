public class Book {
    private String title;
    private String author;
    private String Genre;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        Genre = genre;
    }
}
