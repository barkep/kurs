package zad14;

import java.util.Scanner;

public class App {
	
	public static void main(String[]args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Wprowadz pierwsza liczbe: ");
		int a=scanner.nextInt();
		
		System.out.print("Wprowadz znak +, -, *, / : ");
		char znak=scanner.next().charAt(0);
		System.out.print("Wprowadz pierwsza liczbe: ");
		int b=scanner.nextInt();
		scanner.close();
		
		Calc calc=new Calc(a,b);
		System.out.println(a+""+znak+""+b+"="+calc.dzialanie(znak));
		
	}

}
