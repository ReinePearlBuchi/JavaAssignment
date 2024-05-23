import java.util.Scanner;
public class AtMachine {
    private static int balance = 0; // Initialize balance to zero

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        menu();
        System.out.println("Choose an option ");
        int option = scanner.nextInt();

        switch (option) {
            case 0:
                openAccount(scanner);
                break;

            case 1:
                closeAccount(scanner);
                break;

            case 2:
                deposit(scanner);
                break;

            case 3:
                withdraw(scanner);
                break;

            case 4:
                checkBalance();
                break;

            case 5:
                changePin(scanner);
                break;

            default:
                System.out.println("Invalid input, exiting now!!!");
                return;
        }
    }

    public static void menu() {
        String options = """
                Press
            0 -> Open Account
            1 -> Close Account
            2 -> Deposit Money
            3 -> Withdraw Money
            4 -> Check Account Balance
            5 -> Change Pin
            """;
        System.out.println(options);
    }

    public static void openAccount(Scanner scanner) {
        scanner.nextLine(); // Consume newline
        System.out.print("Enter your First Name:  ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your Last Name:  ");
        String lastName = scanner.nextLine();

        System.out.println("Insert Pin: ");
        int pinInsert = scanner.nextInt();

        System.out.println("Your Account has been Successfully Created!\nYour Name is " + firstName + " " + lastName);
        System.out.println("Saving" + ">".repeat(20));
    }

    public static void closeAccount(Scanner scanner) {
        scanner.nextLine(); // Consume newline
        System.out.println("Would you like to close Your Account?  yes/no");
        String closeAccount = scanner.nextLine();

        System.out.println("What are your reasons for closure? ");
        String reasonForClosure = scanner.nextLine();

        System.out.print("Account Closed! Successfully!");
        System.out.println("Saving" + ">".repeat(20));
    }

    public static void deposit(Scanner scanner) {
        System.out.print("How much would you like to deposit? Enter Amount: ");
        int amountDeposit = scanner.nextInt();
        balance += amountDeposit;

        System.out.println("Transaction Successful");
        System.out.println("Saving" + ">".repeat(20));
    }

    public static void withdraw(Scanner scanner) {
        System.out.print("How much would you like to withdraw? Enter Amount: ");
        int amountToWithdraw = scanner.nextInt();
        if (amountToWithdraw > balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance -= amountToWithdraw;
            System.out.println("Transaction Successful");
        }
        System.out.println("Saving" + ">".repeat(20));
    }

    public static void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }

    public static void changePin(Scanner scanner) {
        System.out.print("Would you like to change Your pin? ");
        int changePin = scanner.nextInt();
    }
}
