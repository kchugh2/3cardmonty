package newpackage;

import java.util.Scanner;

public class threecardapp {

	public static void main(String[] args)
	{
		int bet,turn,amount=100;
		String cont="y";
		Scanner keyboard = new Scanner (System.in);
		threecardhistory play = new threecardhistory();
		boolean shook;
		do
		{
			System.out.println("You have "+amount+" Dollars left");
			System.out.println("Welcome to 3 card monty \n##\t##\t##\nWhat amount do you want to bet > 5 ?");
			bet=keyboard.nextInt();
		
			
			while(bet<5||bet>amount)
			{
				System.out.println("Bet an amount >= $5 or less than your total amount");
				bet=keyboard.nextInt();
			}
			
			System.out.println("What position the ace at?");
			turn=keyboard.nextInt();
			shook=play.shake(turn);
			
			amount = play.winloss(shook,turn,amount,bet);
			//System.out.println(amount);
			System.out.println("Play Again?? [y/n]");
			cont=keyboard.next();
			keyboard.nextLine();
					
					
		}while(amount>0&&amount<500&&cont.equals("y"));
	
	if(amount<=0)
		System.out.println("You Busted");
	else if (amount >= 500)
		System.out.println("You got too much dough to keep playing $" + amount );
	else
		System.out.println("Here's your $"+amount+" Go away");
	play.showHistory();
	

	}

}
