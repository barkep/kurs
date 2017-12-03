package zad8;

public class Calculator {
	
	int a,b,c;
	
	Calculator(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	Calculator(int a, int b, int c){
		this(a,b);
		this.c=c;
	}
	
	int add() {
		return a+b+c;
	}
	
	int add1() {
		return a+b;
	}
	
	int substract() {
		return a-b;
	}
	
	int substract1() {
		return b-a;
	}

}
