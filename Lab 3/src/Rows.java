public class Rows {
    Book[] books = new Book[10];

    public boolean addBook(String isbn, String name, String author, int shelfId, int rowId) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = new Book(isbn, name, author, shelfId, rowId, i);
                return true;
            }
        }
        return false;
    }

    public void addBook(String isbn, String name, String author, int shelfId, int rowId, int bookId) {
        books[bookId] = new Book(isbn, name, author, shelfId, rowId, bookId);
    }

    public void print() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i]);
            }

        }
    }

    public void searchBookByIsbn(String isbn) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                if (books[i].isbn == isbn) {
                    System.out.println(books[i]);
                    break;
                }
            }
        }
    }
}
























