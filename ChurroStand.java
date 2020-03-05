///Caden Sounart
public class ChurroStand extends Vendor
{
	public ChurroStand(int peopleVisiting)
	{
		super(peopleVisiting);
		setFoodPrice(4.75);
		setPeoplePerDay(.5);
		setEmployeesNeeded(2);
	}
	public double getProfit()
	{
		return calculateProfit();
	}
}
