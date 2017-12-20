package zad16;

public class Studnet {
	
	private String imie;
	private String nazwisko;
	private int nrIndeksu;
	public static int LICZNIK_STUDENTOW=0;
	
	Studnet(String imie, String nazwisko, int nrIndeksu){
		setImie(imie);
		setNazwisko(nazwisko);
		setNrIndeksu(nrIndeksu);
		LICZNIK_STUDENTOW++;
	}
	
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

	public int getNrIndeksu() {
		return nrIndeksu;
	}

	public void setNrIndeksu(int nrIndeksu) {
		this.nrIndeksu = nrIndeksu;
	}

}
