public class Vendor
{
	public Vendor(double averageFoodPrice, double peopleThere, double popFactor, double materialCost, int neededEmployees)
	{
		foodPrice = averageFoodPrice;
		peoplePerDay = peopleThere * popFactor;
		cost = materialCost + (neededEmployees * MIN_WAGE * 12);
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
	public static final double MIN_WAGE = 11.13;
}
