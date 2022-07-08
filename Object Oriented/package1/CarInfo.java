package package1;
import java.util.*;

public class CarInfo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
//		getting user input
		System.out.print("Enter the number of cars you want to add :");
		int n = sc.nextInt();
		
//		creating necessary objects
		Car car[] = new Car[n];
		AddCar addcar = new AddCar();
		
//		Adding car details
		car = addcar.addDetails(n);
		
// which model user wants to find & Storing it in another variable
		System.out.println("Enter Model name to Find :");
		String m = System.console().readLine();
		var models = addcar.findCarList(m, car);
		System.out.print(models[0].getModel());
// checking & printing car values
		
		if(models[0] != null)
		{
			for(int i =0; i < models.length; i++)
			{
				System.out.println(" Your licence Number : " + models[i].getlicenceNumber());
				System.out.println(" Car's Model : " + models[i].getModel());
				System.out.println(" Car's Current Milage : " + models[i].getCurrentMileage());
				System.out.println(" Car's Engine Size : " + models[i].getEngineSize());
			}
		}
		else 
		{
			System.out.println("No cars found");
		}
		sc.close();
	}
	
}


