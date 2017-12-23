package zad19;

public class DataStore {
	
	private final int MAX_ILOSC=100;
	
	private Computer[] computers;
	private int computersNumber;
	
	public Computer[] getComputers() {
        Computer[] comps = new Computer[computersNumber];
        for (int i = 0; i < computersNumber; i++) {
            comps[i] = computers[i];
        }
        return comps;
	}
	public void setComputers(Computer[] computers) {
		this.computers = computers;
	}
	public int getComputersNumber() {
		return computersNumber;
	}
	public void setComputersNumber(int computersNumber) {
		this.computersNumber = computersNumber;
	}
	public DataStore() {
		computers=new Computer[MAX_ILOSC];
		computersNumber=0;
	}
	
	public void add(Computer comp) {
        if (computersNumber < MAX_ILOSC) {
            computers[computersNumber] = comp;
            computersNumber++;
        }
    }
 
    public int checkAvailability(Computer find) {
        if (find == null)
            return 0;
 
        int count = 0;
        for (int i = 0; i < computersNumber; i++) {
            if (find.equals(computers[i])) {
                count++;
            }
        }
        return count;
    }

    
}