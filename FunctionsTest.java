import java.util.Scanner;
public class FunctionsTest{
	public static int evenNumber(int num, int numero){

	int nombre =  num + numero;
	
	return  nombre;
	}
	





	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);

		int a = 1;
		int b = 2;

		int result = evenNumber( a, b);

		System.out.print(result );
	}
	

}