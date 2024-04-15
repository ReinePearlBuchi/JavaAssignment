import java.util.Scanner;

public class RaiseToPower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int number1 = input.nextInt();

        System.out.print("Enter number2: ");
        int number2 = input.nextInt();

        int result = 1;
        for (int i = 1; i <= number2; i++) {
            result *= number1;
        }

        System.out.println(number1 + " raised to the power of " + number2 + " is " + result);
    }
}
