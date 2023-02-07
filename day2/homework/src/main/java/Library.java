import java.util.ArrayList;

public class Library {


    private Book book;
    private ArrayList<Book> bookList;


    public Library (){
        this.bookList = new ArrayList<Book>();

    }


    public ArrayList<Book> getBookList() {
        return bookList;
    }


    public int theBookCount() {
        return bookList.size();
    }

    public void addBook(Book book) {
        int maxCapacity = 3;
        if(bookList.size() < 3){
            bookList.add(0, book);
        } else {
            System.out.println("No more space!");
        }
    }

}

