public class Library {
    Shelf[] shelf = new Shelf[10];

    public Library() {
        for (int i = 0; i < shelf.length; i++) {
            shelf[i] = new Shelf();
        }
    }
    public boolean addBook(String isbn, String name, String author) {
        for (int i = 0; i < shelf.length; i++) {
            shelf[i].addBook(isbn, name, author, i);
            return true;
        }
        return false;
    }

    public void addBook(String isbn, String name, String author, int shelfId, int rowId, int bookId) {
        shelf[shelfId].addBook(isbn, name, author, shelfId, rowId, bookId);
        }

    public void print() {
        for (int i = 0; i < shelf.length; i++) {
            shelf[i].print();
        }
    }

    public void searchByIsbn(String isbn) {
        for (int i = 0; i < shelf.length; i++) {
            shelf[i].searchByIsbn(isbn);

        }
    }
}
