public class Position {
    int shelfId, rowId, bookId;

    public Position(int shelfId, int rowId, int bookId) {
        this.shelfId = shelfId;
        this.rowId = rowId;
        this.bookId = bookId;
    }

    public void setShelfId(int shelfId) {
        this.shelfId = shelfId;
    }

    public int getShelfId() {
        return this.shelfId;
    }

    public void setRowId(int rowId) {
        this.rowId = rowId;
    }

    public int getRowId() {
        return this.rowId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getBookId() {
        return this.bookId;
    }

}
