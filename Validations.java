import java.util.Scanner;
	public class Validations{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter name");
	String userName = scanner.nextLine();

	if(userName.length() > 10){
		System.out.print("Invalid Input");
	}else{
		System.out.print("Enter password");
		int password = scanner.nextInt();
	
	System.out.print("Confirm Password");
	int confirmPassword = scanner.nextInt();


	if(password == confirmPassword && password > 6){
		System.out.print("userName: "+ userName + "password: " + password);

	}else{
		System.out.print("User name and password does not match");
	}
			
	}

	}
}