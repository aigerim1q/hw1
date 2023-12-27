import java.util.ArrayList;
public class Shape {
    private ArrayList<Point> pointsArrayList;
    public Shape(){
        pointsArrayList = new ArrayList<Point>(); //array initialisation / create
    }

    public void addPoint(Point pointnum){
        pointsArrayList.add(pointnum);
    }

    int i = 0;
    double p = 0;
    public double perimeter(){
        while(i<9){
            p=p+pointsArrayList.get(i).distanceTo(pointsArrayList.get(i+1).x_coor, pointsArrayList.get(i+1).y_coor);
            i++;
        }
        return p+pointsArrayList.get(9).distanceTo(pointsArrayList.get(0).x_coor, pointsArrayList.get(0).y_coor);
    }
    int j=0;
    double max=0;
    public double longestSide() {
        while (j<9){
            if(max<pointsArrayList.get(j).distanceTo(pointsArrayList.get(j+1).x_coor, pointsArrayList.get(j+1).y_coor)){
                max=pointsArrayList.get(j).distanceTo(pointsArrayList.get(j+1).x_coor, pointsArrayList.get(j+1).y_coor);

            }
            j++;
        }

        return ((pointsArrayList.get(9).distanceTo(pointsArrayList.get(0).x_coor, pointsArrayList.get(0).y_coor)>max) ? pointsArrayList.get(9).distanceTo(pointsArrayList.get(0).x_coor, pointsArrayList.get(0).y_coor) : max);
    }

    public double averageSide() {
        return perimeter()/10;
    }
}