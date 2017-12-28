package Szymon;

public class WspolrzedneGPS {

	private double szerokosc;
	private double dlugosc;

	public double getSzerokosc() {
		return szerokosc;
	}

	public void setSzerokosc(double szerokosc) {
		this.szerokosc = szerokosc;
	}

	public double getDlugosc() {
		return dlugosc;
	}

	public void setDlugosc(double dlugosc) {
		this.dlugosc = dlugosc;
	}

	public WspolrzedneGPS(double szerokosc, double dlugosc) {
		setSzerokosc(szerokosc);
		setDlugosc(dlugosc);
	}

	@Override
	public String toString() {
		return "dlugosc: "+ getDlugosc() + "; szerokosc: " + getSzerokosc();
	}
}
