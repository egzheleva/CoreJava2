
public class Example {
	public static void main(String args[]) {
		Car car = new Audi(12000);
		System.out.println(car.getBrand());
		
		Car c = new Wolkswagen();
		c.getBrand();
	}
}