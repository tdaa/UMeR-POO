import java.lang.Math;
import java.io.Serializable;
/**
 * Write a description of class Point2D here.
 *
 * @author jhbb
 * @version 1.0 19/04/2017
 */

public class Point2D implements Serializable{
  private double x;
  private double y;

  //Constructors
  public Point2D(double x, double y){
    this.x = x;
    this.y = y;
  }

  public Point2D(){
    this.x = 0;
    this.y = 0;
  }

  public Point2D(Point2D p){
    this.x = p.getX();
    this.y = p.getY();
  }

  //methods
  public double getX(){
    return this.x;
  }

  public double getY(){
    return this.y;
  }

  public void travelTo(Point2D p){
    this.x = p.getX();
    this.y = p.getY();
  }

  public void travelTo(double x, double y){
    this.x = x;
    this.y = y;
  }

  public double distanceTo(Point2D dest){
    double xfactor = Math.pow(dest.getX(), 2) - Math.pow(this.getX(), 2); //destx² - orix²
    double yfactor = Math.pow(dest.getY(), 2) - Math.pow(this.getY(), 2); //desty² - oriy²
    return Math.sqrt(Math.abs(xfactor + yfactor));
  }

  public Point2D clone(){
    return new Point2D(this);
  }

  public String toString(){
    return "x:" + this.x + " y:" + this.y;
  }
}
