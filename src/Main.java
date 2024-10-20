import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Point2 pt = new Point2();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-----------------------------------------------");

            System.out.println("Enter VAlue Of x2");
            double x2 = sc.nextDouble();

            System.out.println("Enter value of y2");
            double y2 = sc.nextDouble();

            System.out.println("Enter value of x3");
            double x3 = sc.nextDouble();

            System.out.println("Enter value of y3");
            double y3 = sc.nextDouble();

            pt.setX1(0.0);
            pt.setY1(0.0);
            pt.setX2(x2);
            pt.setY2(y2);
            pt.setX3(x3);
            pt.setY3(y3);
            double dd = pt.calculateDistance(pt.getX1(), pt.getX2(), pt.getY1(), pt.getY2());
            System.out.println(dd);
            double dd2 = pt.calculateDistance(pt.getX3(), pt.getY3(), pt.getY2(), pt.getY2());
            System.out.println(dd2);
        }
    }
}