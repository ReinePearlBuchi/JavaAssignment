public class Fibonacci{
	public static void main(String[] args){

	int num = 10;
	int fib = 0;	
	 int nacci = 1;

	for(int count = 1; count <= num; ++count){
	System.out.print(fib + " ");

	int fibonacci =  fib +  nacci;
	 fib =  nacci;
	nacci = fibonacci;
	}
}
}