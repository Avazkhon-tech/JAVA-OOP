import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");

        int number_1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number_2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int number_3 = input.nextInt();

        if (number_1 == number_2  && number_2 == number_3) {
            System.out.println("All three numbers are the same.");
        }
        else if (number_1 == number_2 || number_1 == number_3 || number_2 == number_3) {
            System.out.println("Two of the numbers are the same.");
        }
        else {
            System.out.println("All three are different numbers. ");
        }
    }
}
















