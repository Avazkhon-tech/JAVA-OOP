import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.print("Enter the first number: ");
        float first_num = input.nextFloat();
        System.out.print("Enter the second number: ");
        float second_num = input.nextFloat();

        if (operator == '+') {
            System.out.println(first_num + " + " + second_num + " = " + (first_num + second_num));
        }
        else if (operator == '-') {
            System.out.println(first_num + " - " + second_num + " = " + (first_num - second_num));
        }
        else  if (operator == '*') {
            System.out.println(first_num + " * " + second_num + " = " + (first_num * second_num));
        }
        else if (operator == '/') {
            System.out.println(first_num + " / " + second_num + " = " + (first_num / second_num));
        }
        else {
            System.out.println("Invalid operand! ");
        }
    }
}
