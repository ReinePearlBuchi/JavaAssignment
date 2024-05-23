import java.util.Scanner;
public class Return{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

	
		int maxValue  = 0;
	
		for(int count = 1; count <= 10; count++){
		
			System.out.print("Enter a number " + count + " :  " );
			int number = scanner.nextInt();
	
		if (number > maxValue ) {
			maxValue = number ;
			
		}

		}

		System.out.print("The maximum value is : "+ maxValue);

}
}