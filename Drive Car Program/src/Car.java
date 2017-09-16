/*
* Camron Upshur 
* This program can track the fuel and creat a car
*/
public class Car 
{
	public Car(double carmpg)
	{
		fuel = 0;
		mpg = carmpg;
	}
	public void addgas(double gas)
	{
		fuel = gas;
	}
	public void drive(double miles)
	{
		fuel = (1/mpg) * miles;
	}
	public double fuelcheck( )
	{
		return fuel;
	}
	private double fuel;
	private double mpg;
}
