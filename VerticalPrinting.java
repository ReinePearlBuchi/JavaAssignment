import java.util.*;
public class Task1{
	public static void main(String[] args){	

		int[] scores = {23, 49, 22, 99,17,44,77,54,28,95};
	
		verticalPrinting(scores);
		//horizontalPrinting(scores);

	}


	public static void verticalPrinting(int[] array){

		//System.out.println(Arrays.toString(array));

		for(int score : array){
			System.out.println(score );
		}
		
	}

	public static void horizontalPrinting(int[] array){

		System.out.print(Arrays.toString(array));

		//for(int score : array){
			//System.out.print(score);
		//}

	}


}