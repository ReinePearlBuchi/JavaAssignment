import java.util.Scanner;
	public class Studentscore{
		public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Enter name ");
		String name = scanner.nextLine();

		System.out.print("Enter first score: ");
		int firstScore = scanner.nextInt();
	
		System.out.print("Enter second score: ");
		int secondScore = scanner.nextInt();
		
		System.out.print("Enter third score: ");
		int thirdScore = scanner.nextInt();
		
		
		int totalOfScore = firstScore + secondScore + thirdScore;
		System.out.println("The Student failed by: "  + totalOfScore);

			


			
				



}


} 
 
