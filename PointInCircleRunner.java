import java.util.Scanner;
public class PointInCircleRunner{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi! This is a program that will tell you if a point is inside or outside of a given circle. \nLet's make our circle first.");
        System.out.println("Enter the center of the circle (double, double) : ");

        String input = scanner.nextLine();
        input = input.substring(1, input.length() - 1);
        String[] parts = input.split(",");
        double x = Double.parseDouble(parts[0].trim());
        double y = Double.parseDouble(parts[1].trim());
        Point point = new Point(x, y);
        System.out.println("I've constructed the point: " + point);

        System.out.println("Enter the radius: ");
        double radius = scanner.nextDouble();
        System.out.println("r = " + radius);
        scanner.nextLine();

        Circle circle = new Circle(new Point(x, y), 3);
    
        System.out.println("I've constructed the circle: Circle with center " + point + " and radius " + radius);
        System.out.println("OK. Type in a point and I'll tell you if it's inside or outside of the circle.");
        
        System.out.println("Enter the point (double, double) : ");
        String input2 = scanner.nextLine();
        input2 = input2.substring(1, input2.length() - 1);
        String[] parts2 = input2.split(",");
        double pointx = Double.parseDouble(parts2[0].trim());
        double pointy = Double.parseDouble(parts2[1].trim());
        Point point2 = new Point(pointx, pointy);
        boolean inside = circle.isInside(point2);

        if (inside){
            System.out.println("The point " + point2 + " is inside the Circle with center " + point + " and radius " + radius);
        } else if(!inside){
            System.out.println("The point " + point2 + " is not inside the Circle with center " + point + " and radius " + radius);
        }

        System.out.println("OK. Do another one!");
        System.out.println("Enter the point (double, double) : ");
        String input3 = scanner.nextLine();
        input3 = input3.substring(1, input3.length() - 1);
        String[] parts3 = input3.split(",");
        double pointx1 = Double.parseDouble(parts3[0].trim());
        double pointy1 = Double.parseDouble(parts3[1].trim());
        Point point3 = new Point(pointx1, pointy1);
        boolean inside1 = circle.isInside(point3);

        if (inside1){
            System.out.println("The point " + point3 + " is inside the Circle with center " + point + " and radius " + radius);
        } else if(!inside1){
            System.out.println("The point " + point3 + " is not inside the Circle with center " + point + " and radius " + radius);
        }

        scanner.close();
    }
}