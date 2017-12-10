package zad9a;

import zad9b.PointController;

public class PointApplication {

    public static void main(String[]args) {

        Point point=new Point(2,2);
        PointController set=new PointController();
        set.addX(point);
        System.out.println(point.x+"   "+point.y);

    }
}
