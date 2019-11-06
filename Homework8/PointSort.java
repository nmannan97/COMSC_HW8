import java.util.*;
import java.lang.Math;
/**
 * Write a description of class PointSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PointSort
{
    // instance variables - replace the example below with your own
    private static Point [] POINTS = new Point[100];
    private static Point []stripL = new Point[100];
    private static Point []stripR = new Point[100];
    private static Point[] values = new Point[2];
    private double median;
    private Random rando = new Random();
    /**
     * Constructor for objects of class PointSort
     */
    public PointSort()
    {
        double max = 0;
        for(int i = 0; i<100; i++)
        {
            Point temp = new Point(rando.nextDouble()*100, rando.nextDouble()*100);
            POINTS[i] = temp;
        }
        median = max/2;
        for(int i = 0;i<100;i++){
            if(POINTS[i].getX() < median)
                stripL[i] = POINTS[i];
            else
                stripR[i] = POINTS[i];
        }
    }
    public static Pair getClosestPair(Point[] points)
    {
        Pair p = new Pair(; 
        return p;
    }
    public static void main(String args[])
    {
        PointSort p = new PointSort();
        for(int i = 0;i<100;i++)
        {
            System.out.println(POINTS[i].getX() + " : " + POINTS[i].getY());
        }
    }
}
class Point
{
    private double x;
    private double y;
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
}
class Pair
{
    Point p1;
    Point p2;
    public Pair(Point p1, Point p2)
    {
        this.p1 = p1;
        this.p2 = p2;
    }
    public double getDistance()
    {
        return Math.sqrt(Math.pow((p1.getX() - p2.getX()),2) + Math.pow((p1.getY() - p2.getY()),2)); 
    }
}