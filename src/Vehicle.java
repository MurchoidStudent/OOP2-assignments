
public class Vehicle {
	public String brand;
	public String model;
	public int year;
	
	Vehicle(String brand, String model, int year){
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	public void displayDetails() {
		System.out.printf("Brand:%s\tModel:%s\tYear:%d", brand, model, year);
	}
}
