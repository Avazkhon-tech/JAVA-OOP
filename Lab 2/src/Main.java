public class Main {
    public static void main(String[] args) {
        TradingCenter tc = new TradingCenter();
        tc.addStore("m001", "Men's Store 1", "men");
        tc.addStore("m002", "Men's Store 2", "men");
        tc.addStore("m010", "Men's Store 10", "men");
        tc.addStore("w001", "Women's Store 1", "women");
        tc.addStore("w010", "Women's Store 10", "women");
        tc.addStore("b001", "Baby Store 1", "baby");

    }
}
