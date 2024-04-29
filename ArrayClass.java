public class ArrayClass{
	public static void main(String[] args){
		int numbers []= {2,5,7,4,9};

		System.out.println(maximum);
		 

	}

	public static int maximum(int[] numbers){
		int maximum = numbers[0];

		for(int i = 1; i < numbers.length; i++ ){
			if (numbers[i] > maximum){
			maximum = numbers[i];
			}

		}
		return maximum;
	
	}

	

}