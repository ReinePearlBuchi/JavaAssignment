import java.util.Scanner;
public class LagbajaSchool{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	
		System.out.println("How many Student do you have: ");
		int numberOfStudent = scanner.nextInt();
	
		System.out.println("How many subject do you offer: ");
		int subjectOffered = scanner.nextInt();

		System.out.println("Saving" + ">".repeat(20) + "\nSaved Successfully");
		
		int [][] scores = new int[numberOfStudent][subjectOffered];
	

		for(int i = 0; i < numberOfStudent; i++){
		System.out.println("Entering score for Student" + i + ":" );

		for(int j = 0; j < numberOfStudent; j++){
		System.out.print("Entering score for subject: " + j +":");
		int subjectScore = scanner.nextInt();

			}

			System.out.println("Saving" + ">".repeat(20));
			System.out.println("Saved Successfully");
	



	
		
		}
		
		
		

		

	}




}