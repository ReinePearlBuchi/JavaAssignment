import java.util.Scanner;
	public class Score{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	double pay = 0.03;
	
	System.out.print("Enter an Integer: ");
	int score = scanner.nextInt();


	if(score >= 90){
		System.out.print("increase pay by " + pay);
	}

	}
}