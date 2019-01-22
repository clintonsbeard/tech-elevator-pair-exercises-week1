package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then display the change required.
 
 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */

public class MakeChange {

	public static void main(String[] args) {
		
		while (true) {
			
			Scanner in = new Scanner (System.in);
		
			System.out.print("Please enter the amount of the bill: ");
			double amountOfTheBill = in.nextDouble();
			
			System.out.print("Please enter the amount tendered: ");
			double amountOfTender = in.nextDouble();

			double amountOfChange = amountOfTender - amountOfTheBill;
			System.out.printf("The change required is: $%3.2f", amountOfChange);
			System.out.println("");
			}
		}

}