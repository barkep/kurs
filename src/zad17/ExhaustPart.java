package zad17;

public class ExhaustPart extends Part {
	

	private boolean emisja;
	
	ExhaustPart(int uniqeID, String prodName, String model, String seria, boolean emisja) {
		super(uniqeID, prodName, model, seria);
		setEmisja(emisja);
	}

	public boolean isEmisja() {
		return emisja;
	}
	public void setEmisja(boolean emisja) {
		this.emisja = emisja;
	}

	

}
