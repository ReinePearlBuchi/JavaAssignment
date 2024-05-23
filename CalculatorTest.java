import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest{

	@Test
	public void testThatCalculatorCanAddTwoPositiveNumbers(){
		int sum = Calculator.add(2,2);
		int expectedSum = 4;
		assertEquals(expectedSum, sum);

	}

	@Test
	public void testThatCalculatorCanSubtract(){
	int difference = Calculator.subtract(2,4);
	int expectedResult = 2;
	assertEquals(expectedResult, difference);
	
	}

	@Test
	public void testThatCalculatorCanMultiply(){
	int multiply = Calculator.multiply(4,8);
	int expectedResult = 32;
	assertEquals(expectedResult, multiply);

		
	}


}