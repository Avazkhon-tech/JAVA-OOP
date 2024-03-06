public class Shelf {
    Row[] row = new Row[3];

    public Shelf() {
        for (int i = 0; i < row.length; i++) {
            row[i] = new Row();

        }
    }


    public boolean addBook(String isbn, String name, String author, int shelfId) {
        for (int i = 0; i < row.length; i++) {
            row[i].addBook(isbn, name, author, shelfId, i);
            return true;
        }
        return false;
    }

    public void addBook(String isbn, String name, String author, int shelfId, int rowId, int bookId) {
        row[rowId].addBook(isbn, name, author, shelfId, rowId, bookId);
    }

    public void print() {
        for (int i = 0; i < row.length; i++) {
            row[i].print();

        }
    }

    public void searchByIsbn(String isbn) {
        for (int i = 0; i < row.length; i++) {
            row[i].searchByIsbn(isbn);

        }
    }
}
