
public class Telus extends CellPlan {

	//Attributes
	
	public Telus(int l, int i, int j, int k) {
		// TODO Auto-generated constructor stub
		super(l, i, j, k);
		System.out.println("hello this is Telus " + this.minutes);
	}
	
	
	public String toString()
	{
	return super.toString();
	}
	
	public void makingMoney()
	{
		this.minutes += 2;
		System.out.println(this.minutes);
	}

}