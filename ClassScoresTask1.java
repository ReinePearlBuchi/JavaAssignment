import java.util.Scanner;

public class ClassScoresTask2{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

	int [] array = new int [10];
	
	for(int times = 0; times < 10; times++){
		System.out.print("Enter a Score: " );
		array[times] = scanner.nextInt();
		}

	for(int count = 0; count < array.length; count++){
		System.out.printf("%s%n ", array[count]);

		}

}

}