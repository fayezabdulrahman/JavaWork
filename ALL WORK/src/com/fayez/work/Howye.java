/*
This file is created by Fayez Rahman on the 20 Feb 2017 at 22:10:08
*/
package com.fayez.work;
import java.util.Scanner;
public class Howye {
	public static void main (String args[])
	{
		
		
			System.out.println("Pick a number between 1 and 10 \n");
			
			Scanner guess = new Scanner(System.in);
			String user = guess.nextLine();
			
			int correct = 7;
			if(Integer.parseInt(user) == correct)
			{
				System.out.println("Correct!");
			}
			else
			{
				System.out.println("Wrong try again! :'(");
			}
		
		
		
	}
}

