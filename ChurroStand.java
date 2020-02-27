///Caden Sounart
public class ChurroStand extends Vendor
{
	public ChurroStand(int peopleVisiting)
	{
		super(peopleVisiting);
		setFoodPrice(4.75);
		setCost(1);
		setPeoplePerDay(.75);
		setEmployeesNeeded(2);
	}
	public double calculateProfit()
	{
		return (foodPrice * peoplePerDay) - (cost * peoplePerDay);
	}
}
