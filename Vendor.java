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
	
	//@param materialCost		the total cost of running the stand per day
	public void setCost(double materialCost)
	{
		cost = materialCost;
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
		return (foodPrice * peoplePerDay) - cost - employeesNeeded * 11.13;
	}
	
	protected int peopleThere;
	protected double foodPrice;
	protected double cost;
	protected int peoplePerDay;
	protected int employeesNeeded;
}
