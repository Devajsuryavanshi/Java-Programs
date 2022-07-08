package package1;

public class Car 
{
	private String licenceNumber;
	private String model;
	private Double currentMileage;
	private int engineSize;
	
	
	Car(String licenceNumber, String model , Double currentMileage, int engineSize)
	{
		this.setCurrentMileage(currentMileage);
		this.setlicenceNumber(licenceNumber);
		this.setModel(model);
		this.setEngineSize(engineSize);
	}
	
	public void setlicenceNumber(String licenceNumber)
	{
		this.licenceNumber = licenceNumber;
	}
	
	public String getlicenceNumber()
	{
		return this.licenceNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Double getCurrentMileage() {
		return currentMileage;
	}

	public void setCurrentMileage(Double currentMileage) {
		this.currentMileage = currentMileage;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}
	
}

 class AddCar 
{

	public Car[] addDetails(int n) 
	{
		Car arr[] = new Car[n];
		for(int i = 0; i < n; i++)
		{
			double mileage =0;
			int engineSize = 0;
			String licenceNO = "";
			String model = "";
			
			System.out.println(i +" Enter Car's Current Milage : ");
			mileage = Double.parseDouble(System.console().readLine());
			
			System.out.println(i +" Enter Car's Engine Size : ");
			engineSize = Integer.parseInt(System.console().readLine());
			
			System.out.println(i +" Enter Your licence Number : ");
			licenceNO = System.console().readLine();
			
			System.out.println(i +" Enter Car's Model : ");
			model = System.console().readLine();
			
			arr[i] = new Car(licenceNO, model, mileage, engineSize);
			System.out.println("Car Added Successfully");
		}
		return arr;
		

	}
	
	public Car[] findCarList(String model,Car[] list )
	{
		Car[] dupli = new Car[list.length];
		int count = 0;
		model.toLowerCase();
		
		for (int i = 0; i < list.length; i++)
		{
			String temp = list[i].getModel();
			System.out.println(model.equalsIgnoreCase(temp));
			if(model.equalsIgnoreCase(temp))
			{
				dupli[count] = list[i];
				count++;
			}
		}
		
		return dupli;
	}

}

