package newpackage;

import java.util.ArrayList;

public class threecardhistory extends threecardmonty {
	private ArrayList<Integer> qlist = new ArrayList<Integer>();
	private ArrayList<Integer> alist = new ArrayList<Integer>();
	private ArrayList<Integer> blist = new ArrayList<Integer>();
	private static int  count = 0;
	
	public threecardhistory()
	{
		super();
		}
	
	public boolean shake(int turn)
	{	
		int response = super.shake();
		
		alist.add(response);
		qlist.add(turn);
		count++;
		if(response==turn)
			return true;
		else 
			return false;
	}
	
	public int winloss(boolean shook, int turn, int amount, int bet)
		{
		blist.add(bet);
		if (shook==true)
		{
			System.out.println("You got it- The ace was at position : " + turn);
			amount = amount + bet;
				if(turn==1)
					System.out.println("AA\t##\t##");
				else if (turn ==2)
					System.out.println("##\tAA\t##");
				else
					System.out.println("##\t##\tAA");
		}
		else
		{

			if(turn==1)
				{
				System.out.println("You lose - The ace was at position : " + (turn+1) );
				amount = amount - bet;
				System.out.println("##\tAA\t##");
				}
				else if (turn ==2)
					{
					System.out.println("You lose - The ace was at position : " + (turn-1) );
					amount = amount - bet;
					System.out.println("AA\t##\t##");
					}
					
				else
					{
					System.out.println("You lose - The ace was at position : " + (turn-2) );
					amount = amount - bet;
					System.out.println("AA\t##\t##");
					}
			
		}
		return amount;
		}
	
	public void showHistory()
	{
		for(int i=0;i<count;i++)
		{
			System.out.println("Betting position on turn " + (i+1) + ": " +qlist.get(i));
			System.out.println("Winning position on turn" + (i+1) + ": " +alist.get(i));
			System.out.println("Bet amount on turn  " + (i+1) + ": " +blist.get(i));
			
		}
	}
}
