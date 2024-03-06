public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook("isbn1", "Harry potter", "J.K Rowling");

        library.addBook("isbn2", "Harry potter", "J.K Rowling", 1, 1, 9);

//        library.print();

        library.searchByIsbn("isbn2");
    }
}