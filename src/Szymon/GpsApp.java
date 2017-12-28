package Szymon;

import java.util.Scanner;

public class GpsApp {

	public static void main(String[] args) {
		int ilosc;
		Scanner input=new Scanner(System.in);
		System.out.print("Podaj ilo�� miast: ");
		ilosc=input.nextInt();
		while(ilosc>7 || ilosc<0) {
			System.out.print("Zbyt du�a lub ma�a liczba miast, podaj jeszcze raz: ");
			ilosc=input.nextInt();
		}
		Logika apka=new Logika(ilosc);
		
		for(int i=0;i<ilosc;i++) {
			System.out.print("Podaj nazwe miasta: ");
			input.nextLine();
			String nazwa=input.nextLine();
			System.out.print("Podaj szeroko�� geograficzn�: ");
			double szer=input.nextDouble();
			System.out.print("Podaj d�ugo�� geograficzn�: ");
			double dl=input.nextDouble();
			apka.addMiasto(nazwa, szer, dl);
		}
		input.close();	
	
		apka.printMiasta();
	}
	

}
