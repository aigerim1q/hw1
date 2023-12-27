import java.lang.Math;
public class Point extends Shape {
    int x_coor; //x coordinate point 1
    int y_coor; //y-coordinate


    public Point(int x, int y){ // constructor x-1 строчка 1 число
        x_coor=x;
        y_coor=y;
    }

    public String toString() {
        return "Point:" +

                "\nx-coordinate: " + x_coor +
                "\ny-coordinate: " + y_coor;
    }
    public double distanceTo(int x2, int y2){
        return Math.sqrt((x_coor-x2)*(x_coor-x2) + (y_coor-y2)*(y_coor-y2)); //returning formula of solving for distance between two points
    }

}