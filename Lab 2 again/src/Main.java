public class Main {
    public static void main(String[] args) {
        TradingCenter tc = new TradingCenter();
        tc.addStore("m001", "zara", "men");
        tc.addStore("m001", "zara", "men");
        tc.addStore("m001", "zara", "men");
        tc.addStore("m002", "zara", "women");
        tc.addStore("m002", "zara", "women");
        tc.addStore("m002", "zara", "women");
        tc.addStore("m002", "zara", "women");
        tc.addStore("m002", "zara", "women");
        tc.addStore("m003", "zara", "baby");
        tc.addStore("m003", "zara", "baby");
        tc.addStore("m003", "zara", "baby");
        tc.addStore("m003", "zara", "baby");
        tc.addStore("m003", "zara", "baby");

        tc.addStore("m004", "zara", "baby", 9);

        tc.print();

        tc.search("m006");


    }
}