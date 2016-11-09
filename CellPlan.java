
public class CellPlan {
//Attributes
	protected int minutes;
	private int texts;
	private int data;
	protected int budget;
	
	public CellPlan(int userBudget, int minutes, int texts, int data) {
		// TODO Auto-generated constructor stub
		this.budget = userBudget;
		this.minutes = minutes;
		this.texts = texts;
		this.data = data;		
	}

	public void makingMoney()
	{
		this.minutes += 1;
		System.out.println(this.minutes);
	}
	
	public String toString()
	{
		return ("your budget is this stuff: " + this. budget +
				" uses this much minutes: " + this.minutes
				+ " uses this much text " + this.texts
				+ " this data " + this.data);
	}
}


