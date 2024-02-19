import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        System.out.print("Enter the third number: ");
        int c = input.nextInt();

        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) {
                System.out.print("It is an Equilateral triangle.");
            } else if (a == b && b != c || b == c && c != a || a == c && c != b) {
                System.out.print("It is an Isosceles triangle.");
            } else if (a != b && b != c && a != c) {
                System.out.print("It is a Scalene triangle.");
            }

            if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b) {
                System.out.print(" ,Rectangular");
            }
        }
        else {
                System.out.println("It is not a triangle.");
        }
    }
}

