
public class Book {
    String isbn, name, author;
    private Position position;

    public Book(String isbn, String name, String author, int shelfId, int rowId, int bookId) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.position = new Position(shelfId, rowId, bookId);
    }


    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", name=" + name + '\'' +
                ", author=" + author + '\'' +
                ", shelfId=" + position.getShelfId() + '\'' +
                ", rowId=" + position.getRowId() + '\'' +
                ", bookId=" + position.getBookId() + '\'' +
                '}';
    }
}