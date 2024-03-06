public class Shelves {
    Rows[] rows = new Rows[3];

    public Shelves() {
        for (int i = 0; i < rows.length; i++) {
            rows[i] = new Rows();
        }
    }

    public boolean addBook(String isbn, String name, String author, int shelfId) {
        for (int i = 0; i < rows.length; i++) {
            if(rows[i].addBook(isbn, name, author, shelfId, i)) {
                return true;
            }
        }
        return false;
    }

    public void addBook(String isbn, String name, String author, int shelfId, int rowId, int bookId) {
        rows[rowId].addBook(isbn, name, author, shelfId, rowId, bookId);
    }

    public void print() {
        for (int i = 0; i < rows.length; i++) {
            rows[i].print();
        }
    }

    public void searchBookByIsbn(String isbn) {
        for (int i = 0; i < rows.length; i++) {
            rows[i].searchBookByIsbn(isbn);

        }
    }
}





















