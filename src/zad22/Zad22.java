package zad22;

import java.util.Scanner;

public class Zad22 {

	public static void main(String[] args) {
		System.out.print("Ile wyrazów chcesz wprowadziæ: ");
		Scanner scanner=new Scanner(System.in);
		int liczba=scanner.nextInt();
		scanner.nextLine();
		
		String []tab=new String[liczba];
		for(int i=0; i<tab.length; i++) {
			System.out.print("Wprowadx wyraz: ");
			tab[i]=scanner.nextLine();
		}
		
		StringBuilder cos=new StringBuilder();
		for(int i=0; i<tab.length; i++) {
			cos.append(tab[i].charAt(tab[i].length()-1));
		}
		scanner.close();
		System.out.print(cos.toString());
	}

}
