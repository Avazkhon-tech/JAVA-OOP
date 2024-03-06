public class Position {
    private int shelfId, rowId, bookId;

    public Position(int shelfId, int rowId, int bookId) {
        this.shelfId = shelfId;
        this.rowId = rowId;
        this.bookId = bookId;
    }

    public int getShelfId() {
        return shelfId;
    }

    public void setShelfId(int shelfId) {
        this.shelfId = shelfId;
    }

    public int getRowId() {
        return rowId;
    }

    public void setRowId(int rowId) {
        this.rowId = rowId;
    }

    public int getBookId() {
        return bookId;
    }


}
