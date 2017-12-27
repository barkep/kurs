package zad21;

public class Nurse extends Person {
	
	private double nadgodziny;

	public double getNadgodziny() {
		return nadgodziny;
	}

	public void setNadgodziny(double nadgodziny) {
		this.nadgodziny = nadgodziny;
	}
	
	Nurse(String imie, String nazwisko, double wyplata, double nadgodziny) {
		super(imie, nazwisko, wyplata);
		setNadgodziny(nadgodziny);
	}
	
	@Override
	public String toString() {
		return imie+" "+nazwisko+"; "+wyplata+"; "+nadgodziny;
	}
}
