import java.util.Scanner;
	public class TaskOne{
		public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int scores = 0;
		int counter = 1;
		int total = 0;
		int sum = 0;
		

		while(counter <= 10){
			System.out.print("Enter score: ");
			total += scanner.nextInt();
			counter++;

				}
		
		System.out.print("The Sum of score is: " + total);

	}

}