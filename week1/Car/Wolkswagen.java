
public class Wolkswagen implements Car {
	private String brand;
	
	public void setBrand() {
		brand = "Wolkswagen";
	}
	
	public Wolkswagen() {
		setBrand();
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getType() {
		return "German";
	}
}
