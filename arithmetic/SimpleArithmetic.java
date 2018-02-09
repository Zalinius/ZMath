package arithmetic;

public class SimpleArithmetic {


	public static int intFactorial(int n){
		if(n < 0)
			throw new ArithmeticException("Error. factorial input must be positive");
		else if (n > maxIntFactorial())
			throw new FactorialOverflowException("int", n);
		else{
			int factorial = 1;
			for(; n != 0; --n){
				factorial *= n;
			}
			return factorial;
		}
	}

	public static long longFactorial(int n){
		if(n < 0)
			throw new ArithmeticException("Error. factorial input must be positive");
		else if (n > maxLongFactorial())
			throw new FactorialOverflowException("long", n);
		else{
			long factorial = 1;
			for(; n != 0; --n){
				factorial *= n;
			}
			return factorial;	
		}
	}

	public static int maxIntFactorial(){
		int factorial = Integer.MAX_VALUE;

		int divisor = 0;
		while(factorial > 0){
			divisor ++;
			factorial /= divisor;

		}
		return divisor - 1;
	}

	public static int maxLongFactorial(){
		long factorial = Long.MAX_VALUE;

		int divisor = 0;
		while(factorial > 0){
			divisor ++;
			factorial /= divisor;

		}
		return divisor - 1;
	}

	public static void main(String[] args){
		System.out.println(maxIntFactorial());
		System.out.println(maxLongFactorial());
		System.out.println(longFactorial(0));
		
		System.out.println(longFactorial(-1));

	}
}
