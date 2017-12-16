package zad15b;

import java.util.Scanner;

public class Hospital {
	
	private Patient patients;
	private Patient[] patinet;
	private int licznik;
	
	Hospital(){
		this.patinet=new Patient[10];
		licznik=0;
	}
	void addPatient() {
		if(licznik<10) {
		Scanner scanner=new Scanner(System.in);
		patients=new Patient();
		System.out.print("Podaj imie: ");
		patients.setImie(scanner.nextLine());
		
		System.out.print("Podaj nazwisko: ");
		patients.setNazwisko(scanner.nextLine());
		
		System.out.print("Podaj PESEL: ");
		patients.setPesel(scanner.nextLine());
		this.patinet[licznik]=patients;
		System.out.println();
		licznik++;
		
		}
		else {
			System.out.println("Kolejka jest pe³na");
			System.out.println();
		}
	}
	void print() {
		System.out.println();
		System.out.println("Kolejka pacjentów:");
		for(int i=0; i<licznik; i++) {
			System.out.println("Pacjent "+(i+1)+": "+this.patinet[i].getImie()+";"+this.patinet[i].getNazwisko()+";"+this.patinet[i].getPesel());
		}
		System.out.println();
	}

}
