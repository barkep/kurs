package zad18;

public class Apple extends Fruit {

	private String odmiana;
	
	public Apple(String odmiana) {
		setOdmiana(odmiana);
	}
	
	@Override
	void printInfo() {
		super.printInfo();
		System.out.print(": "+getOdmiana());
	}

	public String getOdmiana() {
		return odmiana;
	}

	public void setOdmiana(String odmiana) {
		this.odmiana = odmiana;
	}
	
	

}
