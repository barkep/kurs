package zad21;

public class Hospital {
	
	private Person[] persons;
	private int licznik=0;

	public Person[] getPersons() {
		return persons;
	}

	public void setPersons(Person[] persons) {
		this.persons = persons;
	}
	
	Hospital() {
		persons= new Person[100];
	}
	
	public void add(Person persons) {
		if(licznik<100) {
			getPersons()[licznik]=persons;
			licznik++;
		}
	}
	
	@Override
	public String toString() {
		String result="";
		for(int i=0; i<licznik;i++) {
			result=result+persons[i]+"\n";
		}
		return result;
	}

}
