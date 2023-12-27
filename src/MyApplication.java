import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.*;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        Shape shape = new Shape();

        File file1 = new File("src/coordinates.txt");
        Scanner sc = new Scanner(file1);
        Point point1 = new Point(sc.nextInt(), sc.nextInt());  // getting values from file
        Point point2 = new Point(sc.nextInt(), sc.nextInt()); // getting values from file
        Point point3 = new Point(sc.nextInt(), sc.nextInt()); // getting values from file
        Point point4 = new Point(sc.nextInt(), sc.nextInt()); // getting values from file
        Point point5 = new Point(sc.nextInt(), sc.nextInt()); // getting values from file
        Point point6 = new Point(sc.nextInt(), sc.nextInt()); // getting values from file
        Point point7 = new Point(sc.nextInt(), sc.nextInt()); // getting values from file
        Point point8 = new Point(sc.nextInt(), sc.nextInt()); // getting values from file
        Point point9 = new Point(sc.nextInt(), sc.nextInt()); // getting values from file
        Point point10 = new Point(sc.nextInt(), sc.nextInt()); // getting values from file
        shape.addPoint(point1);
        shape.addPoint(point2);
        shape.addPoint(point3);
        shape.addPoint(point4);
        shape.addPoint(point5);
        shape.addPoint(point6);
        shape.addPoint(point7);
        shape.addPoint(point8);
        shape.addPoint(point9);
        shape.addPoint(point10);

        System.out.println(point6.distanceTo(point7.x_coor, point7.y_coor));
        System.out.println(point5.toString());
        System.out.println(shape.perimeter());
        System.out.println(shape.longestSide());
        System.out.println(shape.averageSide());
    }
}