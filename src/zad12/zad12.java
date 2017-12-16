package zad12;

public class zad12 {
	
	public static void main(String []args) {
		
		int []tab1= {1,2,3};
		int []tab2= {4,5,6};
		int suma=0;
		for (int i=0; i<tab1.length; i++) {
			suma+=tab1[i];
		}
		for (int i=0; i<tab2.length; i++) {
			suma+=tab2[i];
		}
		
		System.out.print(suma);
	}

}
