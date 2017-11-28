package Probability;

public class SimpleCombinatorics {
	public static final int SMALL_FACTORIAL_UPPER_BOUND = 20;
	
	public static long combinations(int n, int r){
		if(n < 0 || r < 0)
			throw new ArithmeticException("n and r must be non-negative!");
		else if(n < r)
			throw new ArithmeticException("n must be greater than or equal to r!");
		else
			return factorial(n)/(factorial(r)*factorial(n-r));
	}
	
	public static long permutations(int n, int r){
		if(n < 0 || r < 0)
			throw new ArithmeticException("n and r must be non-negative!");
		else if(n < r)
			throw new ArithmeticException("n must be greater than or equal to r!");
		else
			return factorial(n)/factorial(n-r);	}
	
	public static long factorial(int n){
		if (n < 0)
			throw new ArithmeticException("Factorial input must be a non-negative integer!");
		else if (n > SMALL_FACTORIAL_UPPER_BOUND)
			throw new FactorialOverflowException(n);
		else{
			long factorial = 1;
			
			for(int i = n; i >=0; i--){
				if(i > 0)
					factorial *= i;
			}
			return factorial;
		}
	}
	
	public static int maxFactorialLong(){
		long factorial = Long.MAX_VALUE;
		
		int divisor = 0;
		while(factorial > 0){
			divisor ++;
			factorial /= divisor;
			
		}
		return divisor - 1;
	}
		
}
