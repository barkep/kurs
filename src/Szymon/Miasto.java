package Szymon;

public class Miasto {

	private String nazwa;
	private WspolrzedneGPS wspolrzedneGPS;

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public WspolrzedneGPS getWspolrzedneGPS() {
		return wspolrzedneGPS;
	}

	public void setWspolrzedneGPS(WspolrzedneGPS wspolrzedneGPS) {
		this.wspolrzedneGPS = wspolrzedneGPS;
	}

	Miasto(String nazwa, double szer, double dl) {
		setNazwa(nazwa);
		wspolrzedneGPS = new WspolrzedneGPS(szer, dl);
		setWspolrzedneGPS(wspolrzedneGPS);
	}

	@Override
	public String toString() {
		return getNazwa() + "; " + getWspolrzedneGPS();
	}

}
