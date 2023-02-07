

public class Book {
    private String title;
    private String author;
    private String genre;

    public Book(String title, String author, String genre){
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String hasTitle(Book book) {
        return book.title;
    }

    public String hasAuthor(Book book) {
        return book.author;
    }

    public String hasGenre(Book book) {
        return book.genre;
    }
}
