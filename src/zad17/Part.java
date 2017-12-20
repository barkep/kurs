package zad17;

public class Part {
	
	private int uniqeID;
	private String prodName;
	private String model;
	private String seria;
	
	Part(int uniqeID, String prodName, String model, String seria) {
		setUniqeID(uniqeID);
		setProdName(prodName);
		setModel(model);
		setSeria(seria);
	}
	
	
	public int getUniqeID() {
		return uniqeID;
	}
	public void setUniqeID(int uniqeID) {
		this.uniqeID = uniqeID;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSeria() {
		return seria;
	}
	public void setSeria(String seria) {
		this.seria = seria;
	}
	
	

}
