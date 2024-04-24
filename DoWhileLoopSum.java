
import java.util.Scanner;
public class DoWhileLoopSum {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            char repeat;

            do {
                System.out.print("Enter the first number: ");
                int number1 = scanner.nextInt();

                System.out.print("Enter the second number: ");
                int number2 = scanner.nextInt();

                int sum = number1 + number2;
                System.out.println("Sum: " + sum);

                System.out.print("Do you want to perform the operation again? (Y/N): ");
                repeat = scanner.next().charAt(0);
            } while (repeat == 'Y' || repeat == 'y');

            System.out.println("Thank you!");
        }

}
