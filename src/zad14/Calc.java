package zad14;

public class Calc {
	
	private int a;
	private int b;
	
	Calc (int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	int dzialanie(char znak) {
		if(znak=='+') {
			return a+b;
		}
		else if(znak=='-') {
			return a-b;
		}
		else if(znak=='*') {
			return a*b;
		}
		else if(znak=='/') {
			return a/b;
		}
		else {
			System.err.println("Z³y znak");
			return 0;
		}
	}
	
	

}
