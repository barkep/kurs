package Szymon;

public class Logika {

	private Miasto[]miasta;
	private int licznik=0;

	public Miasto[] getMiasta() {
		return miasta;
	}

	public void setMiasta(Miasto[] miasta) {
		this.miasta = miasta;
	}
	
	Logika(int ilosc){
		miasta=new Miasto[ilosc];
	}
	
	void addMiasto(String nazwa, double szer, double dl) {
			miasta[licznik]=new Miasto(nazwa, szer, dl);
			licznik++;
	}
	
	void printMiasta() {
		for(int i=0;i<licznik; i++) {
			System.out.println(miasta[i]);
		}
	}
	
}
