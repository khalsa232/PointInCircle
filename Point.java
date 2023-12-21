public class Point{
    private double x; 
    private double y;

    public Point(){
        x = 0;
        y = 0;
    }

    public Point(double setX, double setY){
        x = setX;
        y = setY;
    }

    public double distance(double x2, double y2){
        return Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double setX){
        x = setX;
    }

    public void setY(double setY){
        y = setY;
    }

    public boolean equals(Point other){
        return this.x == other.x && this.y == other.y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
}
}