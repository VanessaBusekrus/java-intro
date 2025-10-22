package CodeWithMosh;

import java.awt.Point;

public class PointExample {
    public static void main(String[] args) {
        Point point1 = new Point(1, 1);
        Point point2 = point1; // point2 references the same object as point1
        point2.x = 2;
        System.out.println(point1); // Outputs something like java.awt.Point[x=2,y=1]
        System.out.println(point2);
    }
}