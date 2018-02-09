package combinatorics;

import arithmetic.SimpleArithmetic;;

public class SimpleCombinatorics {
	public static final int SMALL_FACTORIAL_UPPER_BOUND = 20;
	
	public static long combinations(int n, int r){
		if(n < 0 || r < 0)
			throw new ArithmeticException("n and r must be non-negative!");
		else if(n < r)
			throw new ArithmeticException("n must be greater than or equal to r!");
		else
			return SimpleArithmetic.longFactorial(n)/(SimpleArithmetic.longFactorial(r)*SimpleArithmetic.longFactorial(n-r));
	}
	
	public static long permutations(int n, int r){
		if(n < 0 || r < 0)
			throw new ArithmeticException("n and r must be non-negative!");
		else if(n < r)
			throw new ArithmeticException("n must be greater than or equal to r!");
		else
			return SimpleArithmetic.longFactorial(n)/SimpleArithmetic.longFactorial(n-r);	}
	
	
		
}
