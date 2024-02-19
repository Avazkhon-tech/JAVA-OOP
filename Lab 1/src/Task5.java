import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String word = input.next();
        String[] vowels = {"a", "e", "i","o", "u"};
        boolean is_available = false;
        for (String vowel : vowels) {
            if (vowel.equals(word)) {
                is_available = true;
                break;
            }
        }
        if (is_available) {
            System.out.println("It is a vowel");
        }
        else {
            System.out.println("It is a consonant");
        }
    }
}
