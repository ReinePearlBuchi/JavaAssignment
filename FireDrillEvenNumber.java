import java.util.Scanner;
public class FireDrillEvenNumber.java{
	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);
	
	
	int total = 0;
	int input = 10;
	int average = total/input;

		for(int i = 1; i <= input; i++){
	
		System.out.print("Enter Scores: ");
		int scores = scanner.nextInt();
		total += scores;
		
		if(i % 2 == 0){ 
		System.out.print(scores(i));
		}

		}

	

	}



}