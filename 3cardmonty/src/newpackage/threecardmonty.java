package newpackage;

import java.util.ArrayList;
import java.util.Random;

public class threecardmonty 
{
	
		//private String [] text = new String [15];
		private int play ;
		
			public threecardmonty ()
			{
				play=0;
			
				/*text[0]="Try Again!";
				text[1]="Indeed!";
				text[2]="It is known!";
				text[3]="The result is ambiguous";
				text[4]="Fo shizzle";
				text[5]="Nein Nein Nein Nein Nein!";
				text[6]="T-bonae";
				text[7]="Welp";
				text[8]="gg";
				text[9]="bruv!!";
				text[10]="ceecee";
				text[11]="The stars agree";
				text[12]="pwnd!";
				text[13]="matkapuri";
				text[14]="Butter Chicken With Naan!";*/
			}
			public int shake()
			{
				Random generator = new Random();
				int r = generator.nextInt(3);
				return (r+1);
			}
			
			

		}


	
		
	
