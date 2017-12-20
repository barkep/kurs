package zad17;

public class Whell extends Part {

	private int rozmiar;
	private int szerokosc;

	Whell(int uniqeID, String prodName, String model, String seria, int rozmiar, int szerokosc) {
		super(uniqeID, prodName, model, seria);
		setRozmiar(rozmiar);
		setSzerokosc(szerokosc);
	}

	public int getRozmiar() {
		return rozmiar;
	}

	public void setRozmiar(int rozmiar) {
		this.rozmiar = rozmiar;
	}

	public int getSzerokosc() {
		return szerokosc;
	}

	public void setSzerokosc(int szerokosc) {
		this.szerokosc = szerokosc;
	}
}
