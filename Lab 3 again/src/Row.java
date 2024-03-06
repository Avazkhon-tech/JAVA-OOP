
public class Row {
    Book[] book = new Book[10];

    public boolean addBook(String isbn, String name, String author, int shelfId, int rowId) {
        for (int i = 0; i < book.length; i++) {
            if (book[i] == null) {
                book[i] = new Book(isbn, name, author, shelfId, rowId, i);
                return true;
            }
        }
        return false;
    }

    public void addBook(String isbn, String name, String author, int shelfId, int rowId, int bookId) {
        book[bookId] = new Book(isbn, name, author, shelfId, rowId, bookId);
    }

    public void print() {
        for (int i = 0; i < book.length; i++) {
            if (book[i] != null) {
                System.out.println(book[i]);
            }

        }
    }

    public void searchByIsbn(String isbn) {
        for (int i = 0; i < book.length; i++) {
            if (book[i] != null) {
                if (book[i].isbn== isbn) {
                    System.out.println(book[i]);
                }
            }
        }
    }
}
