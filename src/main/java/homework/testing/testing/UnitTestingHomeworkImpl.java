package homework.testing.testing;

public class UnitTestingHomeworkImpl implements UnitTestingHomework{

	/**
	 * Sqrt function returns square root of the radicand
	 *
	 * @param n the radicand
	 * @return the square root of the radicant
	 */
	public double sqrt(int n) {

		return Math.sqrt(n);
	}


	/**
	 * Sqr function returns the product of the factor times itself
	 *
	 * @param n the factor 
	 * @return the product of the factor times itself
	 */
	public int sqr(int n) {
		
		return n*n;

	}

	/**
	 * Factorial function returns number!
	 *
	 * @param n the largest factor to consider
	 * @return n!
	 */
	public int factorial(int n) {

		 int i;
		 int factorial=1;  
		  
		 for(i=1;i<=n;i++)
		  {    
			  factorial=factorial*i;    
		  } 
		  
		  return factorial;
		
	}

	 /**
 	 * Produces the sum from 0 to n.
 	 *
 	 * @param n the largest addend
 	 * @return the sum
 	 */
	public int sumUp(int n) {
        
		int sum = 0;
		int i = 1;
		
		while(i <= n)
        {
           sum = sum +i;
           i++;
        }
		
		return sum;
	}

	/**
	  * Simple function that adds two numbers together.
	  *
	  * @param x the first addend
	  * @param y the second addend
	  * @return the sum of x and y
	  */
	public int simpleFunctionXplusY(int x, int y) {
		return x+y;
	}

	/**
 	 * Despacer function Replaces multiple contiguous spaces with a single space
 	 *
 	 * @param inputText the input text
 	 * @return the string with only single spaces in it
 	 */
	public String despacer(String inputText) {

		return inputText.replaceAll("[ ]+", " ");
	}

	
	
}
