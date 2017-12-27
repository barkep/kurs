package zad21;

public class Person {
	
	protected String imie;
	protected String nazwisko;
	protected double wyplata;
	
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public double getWyplata() {
		return wyplata;
	}
	public void setWyplata(double wyplata) {
		this.wyplata = wyplata;
	}
	
	Person(String imie, String nazwisko, double wyplata) {
		setImie(imie);
		setNazwisko(nazwisko);
		setWyplata(wyplata);
	}
	
	@Override
	public String toString() {
		return imie+" "+nazwisko+"; "+wyplata;
	}
	
}
