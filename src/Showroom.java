import java.util.Scanner;

public class Showroom {
	
public String brand,model,fuelType;
public int year;
Car newCar;

Showroom(){

System.out.println("Enter the car deatils as follows....");

Scanner input = new Scanner(System.in);

System.out.println("Brand: ");
brand = input.nextLine();
System.out.println("Model: ");
model = input.nextLine();
System.out.println("Fuel Type: ");
fuelType = input.nextLine();
System.out.println("Year: ");
year = input.nextInt();

 newCar= new Car(brand,model, year, fuelType);

newCar.displayDetails();

input.close();
}

}
