package arithmetic;

public class FactorialOverflowException extends ArithmeticException {
	
	private String type;
	private int n;
	
	public FactorialOverflowException(String type, int n){
		this.type = type;
		this.n = n;
	}
	
	public String getMessage(){
		String message =  "Factorial result too large for " + type + ". Use an n <= ";
		if(type.equals("int"))
			message += SimpleArithmetic.maxIntFactorial();
		else if(type.equals("long"))
			message += SimpleArithmetic.maxLongFactorial();
		
		message += " instead of " + n + ".";
		
		return message;
			
	}

}
