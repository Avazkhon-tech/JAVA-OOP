public class Book {
    String isbn, name, author;
    private Position position;

    public Book(String isbn, String name, String author, int shelfId, int rowId, int bookId) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        position = new Position(shelfId, rowId, bookId);

    }


    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn  + '\'' +
                ", name=" + name + '\'' +
                ", author=" + author + '\'' +
                ", positionshelf=" + position.getShelfId() + '\'' +
                ", positionrow=" + position.getRowId() + '\'' +
                ", positionbook=" + position.getBookId() + '\'' +
                '}';
    }
}
