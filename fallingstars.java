import java.util.Scanner;
	public class fallingstars{
		public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print( "Enter Number : ");
		int []number = scanner.next(); 
		
		for(int i = 0; i < number.length; i++){
					
			for(int j = 0; j < number.length; j++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
		



}


} 