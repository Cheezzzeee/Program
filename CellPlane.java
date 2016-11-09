import java.util.Scanner;

/**
 * 
 */

/**
 * @author swagL0rdxXx69
 *
 */
public class CellPlane {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Let's ask the user how much they use their phone
		System.out.println("What is your name? ");
		String userName = sc.next();
		System.out.println("What is your budget? ");
		int userBudget = sc.nextInt();
		System.out.println("How many minutes do you talk for? ");
		int userMinutes = sc.nextInt();
		System.out.println("How much do you text? ");
		int userTexts = sc.nextInt();
		System.out.println("How much data do you use? ");
		int userData = sc.nextInt();
		

		//CellPlan one = new CellPlan(userMinutes, userTexts, userData);
		//Rogers two = new Rogers(4,5,6);
		
		
		//Make a user-Class
		User user = new User (userName,userBudget,userMinutes,userTexts, userData);
		
		
		//CellPlan three = new CellPlan(69,420);
		
		CellPlan [] plans= new CellPlan[4];
		plans[0] = new CellPlan(user.getBudget(), user.getMinutes(),user.getTexts(), user.getData());
		plans[1] = new Rogers(500,100,420, 10);
		plans[2] = new Bell (user.getBudget(),user.getMinutes(),user.getTexts(), user.getData());
		plans[3] = new Telus (user.getBudget(),user.getMinutes(),user.getTexts(), user.getData());
		
		CellPlan[] rogerPlans = new CellPlan[2];
		rogerPlans[0] = new Rogers(1,2,3,4);
		rogerPlans[1] = new Rogers (5,6,7,8);
		
		for ( int i=0; i<plans.length; i++)
		{
		System.out.println(plans[i]);
		}
		//System.out.println(plans[1]);
		
		/*
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		*/

		//one.makingMoney();
		//two.makingMoney();

	}

}
