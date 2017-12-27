package zad21;

public class Doctor extends Person {

	private double premia;

	public double getPremia() {
		return premia;
	}

	public void setPremia(double premia) {
		this.premia = premia;
	}
	
	Doctor(String imie, String nazwisko, double wyplata, double premia) {
		super(imie, nazwisko, wyplata);
		setPremia(premia);
	}
	
	@Override
	public String toString() {
		return imie+" "+nazwisko+"; "+wyplata+"; "+premia;
	}
}
