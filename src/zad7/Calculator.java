package zad7;

public class Calculator {

	double a, b;

	Calculator(double a, double b) {
		this.a = a;
		this.b = b;
	}

	double add() {
		return a + b;
	}

	double substract() {
		return a - b;
	}

	double multiply() {
		return a * b;
	}

	double divide() {
		return a / b;
	}
}
