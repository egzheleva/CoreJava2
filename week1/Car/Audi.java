
public class Audi implements Car {
	private String brand;
	private double mileage;

	
	public void setBrand() {
		this.brand = "Audi";
	}
	
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public double getMileage() {
		return mileage;
	}
	
	public Audi(double mileage) {
		setBrand();
		this.mileage = mileage;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getType() {
		return "German";
	}
	public String toString() {
		return "Your car is" + getBrand();
	}
}
