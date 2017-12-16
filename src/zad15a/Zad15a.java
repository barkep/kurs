package zad15a;

import java.util.Scanner;

public class Zad15a {

	public static void main(String[]args) {
		
		int ilosc, suma=0;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Ile liczb chcesz wprowadziæ: ");
		ilosc=scanner.nextInt();
		
		while(ilosc>0) {
			System.out.print("Podaj liczbê: ");
			suma+=scanner.nextInt();
			ilosc--;
		}
		scanner.close();
		
		System.out.println("Suma wprowadzonych liczb: "+suma);
		
		
	}
}
