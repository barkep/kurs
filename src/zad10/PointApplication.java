package zad10;

import java.util.Scanner;

public class PointApplication {

	public static final int ADD_X = 1;
	public static final int ADD_Y = 2;
	public static final int MINUS_X = 3;
	public static final int MINUS_Y = 4;

	public static void main(String[]args) {
    	
        Point point=new Point(2,2);
        System.out.println(point.x+"   "+point.y);
        PointController set=new PointController();
        Scanner scanner =new Scanner(System.in);
        int a=0;
        do {
        	a=scanner.nextInt();
        	switch(a) {
        		case(ADD_X):
        			set.addX(point);
        			break;
        		case(ADD_Y):
        			set.addX(point);
        			break;
        		case(MINUS_X):
        			set.addX(point);
        			break;
    			case(MINUS_Y):
    				set.addX(point);
    				break;
        		}
        }
        while(a!=0); 
        set.addX(point);
        System.out.println(point.x+"   "+point.y);

    }
}
