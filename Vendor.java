public class Vendor
{
	public Vendor(double averageFoodPrice, double peopleThere, double popFactor, double materialCost, int neededEmployees)
	{
		foodPrice = averageFoodPrice;
		peoplePerDay = peopleThere * popFactor;
		cost = materialCost;
		employeesNeeded = neededEmployees;
	}
	public double calculateProfit()
	{
		return (foodPrice * peoplePerDay) - cost;
	}
	public int employeesNeeded;
	public double foodPrice;
	public double peoplePerDay;
	public double cost;
}
