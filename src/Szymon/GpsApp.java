package Szymon;

import java.util.Scanner;

public class GpsApp {

	public static void main(String[] args) {
		int ilosc;
		Scanner input=new Scanner(System.in);
		System.out.print("Podaj iloœæ miast: ");
		ilosc=input.nextInt();
		while(ilosc>7 || ilosc<0) {
			System.out.print("Zbyt du¿a lub ma³a liczba miast, podaj jeszcze raz: ");
			ilosc=input.nextInt();
		}
		Logika apka=new Logika(ilosc);
		
		for(int i=0;i<ilosc;i++) {
			System.out.print("Podaj nazwe miasta: ");
			input.nextLine();
			String nazwa=input.nextLine();
			System.out.print("Podaj szerokoœæ geograficzn¹: ");
			double szer=input.nextDouble();
			System.out.print("Podaj d³ugoœæ geograficzn¹: ");
			double dl=input.nextDouble();
			apka.addMiasto(nazwa, szer, dl);
		}
		input.close();	
	
		apka.printMiasta();
	}
	

}
