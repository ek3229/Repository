/**
 * @(#)paths.java
 *
 *
 * @author 
 * @version 1.00 2018/11/28
 */

import java.util.Scanner;

public class paths
{
	public static void main (String[] args)
	{
		int path;
		
		Scanner scan = new Scanner (System.in);
		System.out.println ("You're traped in a cave and you need to get out!");
		System.out.println ("You find three paths. Which one do you choose?");
		System.out.println ("(Input a 1,2, or 3)");
		System.out.println ("1 (Left), 2 (Center), 3(Right)");
		
		path = scan.nextInt();
		
		if (path == 1)
		{
			System.out.println ("You are dead unless you solve this puzzle. If you solve it then you can escape!");
			System.out.println ("Does 2 + 2 = 4?");
			System.out.println ("1 (Yes), 2 (No)");
			
			path = scan.nextInt();
			
			if (path == 1)
				System.out.println ("You are correct! You are now free.");
			
			if (path == 2)
				System.out.println ("You are incorrect! You are now dead.");
		}
		
		if (path == 2)
		{
			System.out.println ("You earned some Treasure!");
			System.out.println ("Now what are you going to do with the Treasure?");
			System.out.println ("1 (Take it all), 2 (Take half of it)");
			
			path = scan.nextInt();
			
			if (path == 1)
				System.out.println ("You took all of the treasure and escape the cave!");
				
			if (path == 2)
				System.out.println ("You took half of the treasure and let some other adventurers take the other half.");
				System.out.println ("You escape the cave!");
		}
		
		if (path == 3)
		{
			System.out.println ("You escaped the cave!");
		}
	}
}

