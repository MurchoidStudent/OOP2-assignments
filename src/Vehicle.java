
/*
 * Name: Michael Kamau
 * ADM: CT101/19151/23
 * Course: Computer science
 * 
 * The answer to question 2 is in a branch called "Cat-1-qn-2" in this same repo
 * 
 * 
 * 
 */

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
