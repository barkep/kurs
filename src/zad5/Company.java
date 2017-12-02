package zad5;

public class Company {
	public static void main(String[] args) {
		
		Employee prac1=new Employee();
		Employee prac2=new Employee();
		Employee prac3=new Employee();
		
		prac1.imie="Jan";
		prac1.nazwisko="Kowalski";
		prac1.dataUrodzenia="1987";
		prac1.staz=4;

		prac2.imie="Jan";
		prac2.nazwisko="Kowalski";
		prac2.dataUrodzenia="1987";
		prac2.staz=2;
		

		prac3.imie="Jan";
		prac3.nazwisko="Kowalski";
		prac3.dataUrodzenia="1987";
		prac3.staz=3;
		
		System.out.println(prac1.imie+" "+prac1.nazwisko+" "+prac1.dataUrodzenia+" "+prac1.staz);
		System.out.println(prac2.imie+" "+prac2.nazwisko+" "+prac2.dataUrodzenia+" "+prac2.staz);
		System.out.println(prac3.imie+" "+prac3.nazwisko+" "+prac3.dataUrodzenia+" "+prac3.staz);
		
	}

}
