import java.util.Scanner;
public class InitArray{
	public static void main(String[] args){

	int[] array = new int[10];

	System.out.print("%s%8s%n", "Index", "Value");

		for(int counter = 0; counter < array.length; counter++){
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}

	}

}