
public class Car {
	private double milesDriven;
	private double gasInTank;
	private double milesPerGallon;

	public Car(double mpg) {
		milesDriven = 0;
		gasInTank = 0;
		milesPerGallon = mpg;

	}

	public void addGas(double amount) 
	{
		gasInTank = gasInTank + amount;
	}

	public void drive(double distance) 
	{
		milesDriven = milesDriven + distance;
		double gasConsumed = distance / milesPerGallon;
		gasInTank = gasInTank - gasConsumed;
	}
}
