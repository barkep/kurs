package zad15b;

import java.util.Scanner;

public class HospitalApp {
	
	public static void main(String []args) {
		
		Hospital hospital=new Hospital();
		Scanner scanner=new Scanner(System.in);
		int menu=-1;
		
		 while (menu != 0) {
			 	
				System.out.println("Menu: ");
				System.out.println("1. Dodaj pacjenta");
				System.out.println("2. Wyœwietl Kolejke");
				System.out.println("0. Zakoñcz program");
				System.out.print("Wprowadz wybran¹ opcjê: ");
				menu=scanner.nextInt();
				switch (menu) {
				case(0):
					break;
				case(1):
					hospital.addPatient();
					break;
				case(2):
					hospital.print();
					break;
				default:
	                System.out.println("Nie znaleziono takiej opcji");
				}
	        }
		 scanner.close();
		
	}
}

