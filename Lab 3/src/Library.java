public class Library {
    Shelves[] shelves = new Shelves[10];

    public Library() {
        for (int i = 0; i < shelves.length; i++) {
            shelves[i] = new Shelves();
        }
    }

    public boolean addBook(String isbn, String name, String author) {
        for (int i = 0; i < shelves.length; i++) {
            if(shelves[i].addBook(isbn, name, author, i)) {
                return true;
            }
        }
        return false;
    }

    public void addBook(String isbn, String name, String author, int shelfId, int rowId, int bookId) {
        shelves[shelfId].addBook(isbn, name, author, shelfId, rowId, bookId);
    }

    public void print() {
        for (int i = 0; i < shelves.length; i++) {
            shelves[i].print();
        }
    }

    public void searchBookByIsbn(String isbn) {
        for (int i = 0; i < shelves.length; i++) {
            shelves[i].searchBookByIsbn(isbn);
        }
    }
}
































