import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positive_total = 0;
        int negative_total = 0;
        int number;
        System.out.print("Enter a number: ");
        number = input.nextInt();
        do {
            if (number > 0) {
                positive_total += number;
            } else {
                negative_total += number;
            }
            System.out.print("Enter another number: ");
            number = input.nextInt();

        } while (number != 0);

        System.out.println("Positive total: " + positive_total);
        System.out.println("Negative total: " + negative_total);

    }
}
