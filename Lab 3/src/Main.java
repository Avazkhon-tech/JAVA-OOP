public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("isbn1", "harry potter", "Rowling");
        library.addBook("isbn2", "deep work", "Cal Newport");
        library.addBook("isbn3", "rich dad poor dad", "Robert Kiyosaki");
        library.addBook("isbn4", "Jannat vasfi", "Imom Qurtubiy");
        library.addBook("isbn5", "The Secret Garden", "Frances Hodgson Burnett");
        library.addBook("isbn6", "To Kill a Mockingbird", "Harper Lee");

//        library.print();

        library.searchBookByIsbn("isbn24");
    }
}

