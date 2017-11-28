package Probability;

public class FactorialOverflowException extends ArithmeticException{
	
	private static final long serialVersionUID = 8985627757080797363L;

	public FactorialOverflowException(){
		super("Factorial result too large for int! Use an 'n' less than "+ Integer.toString(SimpleCombinatorics.SMALL_FACTORIAL_UPPER_BOUND) + ".");
	}
	
	public FactorialOverflowException(int n){
		super("Factorial input too large: " + n);
	}
}
