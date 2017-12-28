package zad23;

public class Calculator {

	public final char PLUS = '+';
	public final char MINUS = '-';
	public final char MULTIPLY = '*';
	public final char DIVIDE = '/';

	public double calculate(double a, double b, char operator) {
		double result=0;
		switch(operator) {
		case PLUS:
			result=a+b;
			break;
		case MINUS:
			result=a-b;
			break;
		case MULTIPLY:
			result=a*b;
			break;
		case DIVIDE:
			if(b==0) {
				throw new ArithmeticException("Nie mo¿na dzieliæ przez 0!");
			}
			result=a/b;
			break;
		default:
			throw new UnknownOperatorException("niezdefiniowany operator matematyczny");			
		}
		return result;
	}
}
