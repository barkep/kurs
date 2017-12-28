package zad23;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double a = 0;
		double b = 0;
		char operator = 0;

		boolean readComplete = false;

		while (!readComplete) {
			try {
				System.out.println("Podaj pierwsz¹ liczbê: ");
				a = input.nextDouble();
				input.nextLine();
				System.out.println("Podaj operator arytmetyczny (+, -, * lub /): ");
				operator = input.next().charAt(0);
				System.out.println("Podaj drug¹ liczbê: ");
				b = input.nextDouble();
				readComplete = true;
			} catch (InputMismatchException e) {
				System.out.println("Wprowadzono niepoprawne dane");
				input.nextLine();
			}
		}
		Calculator calc = new Calculator();
		double result = 0;
		boolean calculationComplete = false;
		try {
			result = calc.calculate(a, b, operator);
			calculationComplete = true;
		} catch (ArithmeticException | UnknownOperatorException e) {
			System.err.println(e.getMessage());
		}

		if (calculationComplete) {
			System.out.println(a + "" + operator + "" + b + " = " + result);
		} else {
			System.out.println("Nie mo¿na by³o obliczyæ wyniku wyra¿enia " + a + operator + b);
		}

		input.close();
	}

}
