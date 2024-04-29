import java.util.Scanner;
	public class Studentname{
		public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);


		System.out.print("Enter Student first score: ");
		studentFirstScore = scanner.nextInt();
	
		System.out.print("Enter Student second score: ");
		int studentSecondScore = scanner.nextInt();
		
		System.out.print("Enter Student third score: ");
		int studentThirdScore = scanner.nextInt();
		
		
		int totalOfStudentScore = StudentFirstScore + StudentSecondScore + StudentThirdScore;
		System.out.println("The total of the score is: "  + totalOfStudentScore);

			



}


} 