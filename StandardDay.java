/**
* This class is used to ask the user what day it is to which the discount system is implemented
* @Author Nabil Aziz
*
*/

import java.util.Scanner;
import java.util.ArrayList;


 class StandardDay {
	 
			 int discount = 0;
			int MenuOption = 0;
		public int getDiscount() {
			
	
				System.out.println(
					"\nWhat day is it?\n" +
					"----------------------------\n" +
					"1.   Monday\n" +
					"2.   Tuesday\n" +
					"3.   Wensday\n" +
					"4.   Thursday\n" +
					"5.   Friday\n" +
					"6.   Saturday\n" +
					"7.   Sunday\n" +
					"----------------------------\n");
		
		
		Scanner menu = new Scanner(System.in);
		MenuOption = menu.nextInt();
		
		/*This section of the code asks the user what day it is today.  the rest of the program to use the discounted menu and prices. 
		If Wensday is chosen then a value of 1 is added to the discount integer which changes	*/
		
		switch (MenuOption) {

			case 1: 
			case 2: 																						
			case 4:																							
			case 5:
			case 6:
			case 7:
			break;
			
			case 3: 
			
				System.out.println("\n Congraulations, All tickets are \u00A32 cheaper on Wensdays!\n\n");
				discount = 1;
			
			break;
			
			default:
				System.out.println("\nWrong decision, please try again\n");
			break;
			}
			
			
		return discount;
		
		
		}
	}
 