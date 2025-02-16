public class Car extends Vehicle {
	private String fuelType;
	
	Car(String brand, String model, int year, String fuelType){
		super(brand,model,year);
		this.fuelType = fuelType;
	}
	
	@Override
	public void displayDetails() {
		System.out.printf("Brand:%s\nModel:%s\nYear:%d\nFuel-Type:%s", brand, model, year, fuelType);
	}

}
