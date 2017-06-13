
import java.io.Serializable;
/**
 * Write a description of class TaxiRide here.
 *
 * @author jhbb
 * @version 02/04
 */
public class TaxiRide implements Serializable{
  private Point2D start;
  private Point2D destination;
  private String driverEmail;
  private String clientEmail;
  private Vehicle vehicle;
  private double distance;
  private double expectedTime;
  private double actualTime;
  private double price;

  public TaxiRide(){}

  public TaxiRide(Point2D start, Point2D destination, String driverEmail, String clientEmail, Vehicle vehicle, double distance, double expectedTime, double actualTime, double price){
    this.start = start;
    this.destination = destination;
    this.driverEmail = driverEmail;
    this.clientEmail = clientEmail;
    this.vehicle = vehicle;
    this.distance = distance;
    this.expectedTime = expectedTime;
    this.actualTime = actualTime;
    this.price = price;
  }

  public TaxiRide(TaxiRide tr){
    this.start = tr.getStart();
    this.destination = tr.getDestination();
    this.driverEmail = tr.getDriverEmail();
    this.clientEmail = tr.getClientEmail();
    this.vehicle = tr.getVehicle();
    this.distance = tr.getDistance();
    this.expectedTime = tr.getExpectedTime();
    this.actualTime = tr.getActualTime();
    this.price = tr.getPrice();
  }

	public Point2D getStart() {
		return this.start;
	}

	public void setStart(Point2D start) {
		this.start = start;
	}

	public Point2D getDestination() {
		return this.destination;
	}

	public void setDestination(Point2D destination) {
		this.destination = destination;
	}

  public String getDriverEmail(){
    return this.driverEmail;
  }

  public String getClientEmail(){
    return this.clientEmail;
  }

	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public double getDistance() {
		return this.distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getExpectedTime() {
		return this.expectedTime;
	}

	public void setExpectedTime(double expectedTime) {
		this.expectedTime = expectedTime;
	}

	public double getActualTime() {
		return this.actualTime;
	}

	public void setActualTime(double actualTime) {
		this.actualTime = actualTime;
	}

  public double getPrice(){
    return this.price;
  }

  public TaxiRide clone(){
      return new TaxiRide(this.getStart(), this.getDestination(), this.getDriverEmail(), this.getClientEmail(), this.getVehicle(), this.getDistance(), this.getExpectedTime(), this.getActualTime(), this.getPrice());
  }

  public String toString(){
    return "Viagem iniciada em " + this.start.toString() + " e terminada em " + this.destination.toString()
                                  + "\n O motorista foi: " + this.driverEmail + "\n O cliente foi: "
                                  + this.clientEmail + "\n Distância total: " + this.distance;
  }
}
