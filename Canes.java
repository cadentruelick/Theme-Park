
public class Canes extends Vendor{

	public int employeesNeeded;
	public double averageFoodPrice;
	public double popFactor;
	public double cost;
	public static final double MIN_WAGE = 11.13;
	
	public Canes(int peoplePresent) 
	{
		super(peoplePresent);
		
		//set the average food price
		averageFoodPrice = 9.00;
		setFoodPrice(averageFoodPrice);
		
		//set the cost of materials
		cost = 200.00 + averageFoodPrice * 1/3 * peoplePresent * .8;
		setCost(cost);
		
		//set popularity and calculate the people attending
		popFactor = .80;
		setPeoplePerDay(popFactor);
		
		//set the number of employees
		employeesNeeded = 12;
		setEmployeesNeeded(employeesNeeded);
	}
	
	//calculate the profit from Canes
	public double getProfit()
	{
		return calculateProfit();
	}
	
	
	
		

}
