import java.util.Scanner;
public class PrimeNumbers{
	
	public static String prime(int number){
	for(int count = 2; count < number; count++){
	if(number % count == 0) {return "its not prime "; }
	else {return "its prime" ; } 	
	}
	return " ";
	}

	public static void main (String [] args){
	Scanner input = new Scanner (System.in);
	 System.out.print ("Enter a number : ");
	int userInput = input.nextInt();
	
	
	System.out.print (prime(userInput));

	}



}

	 
	