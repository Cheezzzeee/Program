
public class User {

	//Attributes
	private String name;
	private int budget;
	private int callDuration;
	private int textAmount;
	private int dataUsage;
	private boolean family;
	
	
	public User(String userName, int userBudget, int userMinutes, int userTexts, int userData) {
		// TODO Auto-generated constructor stub
		this.name = userName;
		this.budget = userBudget;
		this.callDuration = userMinutes;
		this.textAmount = userTexts;
		this.dataUsage= userData;

	}
	
	public int getBudget()
	{
		return this.budget;
	}
	public int getMinutes()
	{
		return this.callDuration;
	}
	public int getTexts()
	{
		return this.textAmount;
	}
	public int getData()
	{
		return this.dataUsage;
	}
	
}
