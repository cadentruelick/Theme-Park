package GroupProject;

public class Vendor
{
	//@param peoplePresent		the number of people attending the park
	public Vendor(int peoplePresent)
	{
		peopleThere = peoplePresent;
	}
	
	//@param averageFoodPrice	the average cost of food in the food stand
	public void setFoodPrice(double averageFoodPrice)
	{
		foodPrice = averageFoodPrice;
	}

	//@param popFactor			the percent, in decimal, of people visiting stand
	public void setPeoplePerDay(double popFactor)
	{
		peoplePerDay = (int) Math.round(peopleThere * popFactor);
	}
	
	//@param neededEmployees	the number of employees needed to run stand for one day
	public void setEmployeesNeeded(int neededEmployees)
	{
		employeesNeeded = neededEmployees;
	}
	
	//calculates the total profit from the stand for one day
	public double calculateProfit()
	{
		return (foodPrice * peoplePerDay) - (200 + 1/3 * foodPrice * PeoplePerDay) - employeesNeeded * 11.13 * 12;
	}
	
	protected int peopleThere;
	protected double foodPrice;
	protected double cost;
	protected int peoplePerDay;
	protected int employeesNeeded;
}
