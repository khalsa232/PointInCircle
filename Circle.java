public class Circle{
    private Point center;
    private double radius;

    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }

    public boolean isInside(Point p){
        double distance = center.distance(p.getX(), p.getY());
        return distance <= radius;
    }

    public Point getCenter(){
        return center;
    }

    public double getRadius(){
        return radius;
    }

    public String toString() {
        return "Circle with center " + center + " and radius " + radius;
    }
}