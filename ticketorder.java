/**
* This program shows an implementation of a simple ticket booking system 
*
* @Author Nabil Aziz
* @Version 1.0
* @date 18-04-2017
*/

import java.util.Scanner;															// Libary which allows user inputs
import java.util.ArrayList;															// Libary which allows arrays


 class TicketOrder {
	
	public static void main(String[] args) {
		

		StandardDay DayObject = new StandardDay();									// Created an object named DayObject
		int discount = DayObject.getDiscount();								        // Returning a value and assigning it to the discount integer 
		FreeSeat PolyArray[] = new FreeSeat[10];									// A polymorphic array being delcared which is from the FreeSeat Class.
		int count = 0; 
		int MenuOption = 0;															// Declaring the MenuOption integer for the switch case statement
		ArrayList<Integer> TicketPrices = new ArrayList<Integer>();					// Declaring the array which will store the bought tickets
		
			while(MenuOption != 6){														// The Menu will loop until 6 has been chosen which closes the program
		
			if(discount == 1){															// If the discount integer holds a value of 1 then the following code is executed. 
		
			System.out.println(
		
					"\n-----WEDNESDAY DISCOUNT PRICES------" +
					"\nTicket Order System\n" +
					"----------------------------\n" +
					"1.   Buy a Standard Ticket - \u00A36 \n" +
					"2.   Buy a OAP Ticket - \u00A34\n" +							// Discounted Menu
					"3.   Buy a Student Ticket - \u00A34\n" +
					"4.   Buy a child Ticket - \u00A32\n" +
					"5.   Print total Order\n" +
					"6.   Close Program;\n" +
					"----------------------------\n");
		
				}
		
			else{																		// if the discount integer does not hold the value of 1 which would be 0 then the following code is executed instead
			
			System.out.println(
			
					"\nTicket Order System\n" +
					"----------------------------\n" +
					"1.   Buy a Standard Ticket - \u00A38 \n" +
					"2.   Buy a OAP Ticket - \u00A36\n" +						    // Normal Menu 
					"3.   Buy a Student Ticket - \u00A36\n" +
					"4.   Buy a child Ticket - \u00A34\n" +
					"5.   Print total Order\n" +
					"6.   Close Program;\n" +
					"----------------------------\n");
				
				}
	
		Scanner menu = new Scanner(System.in);									    // User input is taken for the Menu
		MenuOption = menu.nextInt();												// User input is assigned to the MenuOption Variable
		
		
		switch (MenuOption) {

			case 1: 
			
				if (discount != 0){													// If discount value is 1 then the following code is executed 
				StandardTicket StandardObject = new StandardTicket();				// Created a class and class constructor named StandardTicket
				PolyArray[count] = new StandardTicket();							// A polymorthic array which takes the booking statement from the FreeSteet class and stores it within a variable. 
				count++;															// Goes to the next place within the Array for the next record
				StandardObject.DiscountStandardBought();							// Notifies the customer has bought the ticket
				int Standardprice = StandardObject.getStandardPrice();				// Takes the price from the StudentTicket Class and assigns it to an integer
				Standardprice = Standardprice - 2;									// Deducts a value of 2 from the price
				TicketPrices.add(Standardprice);									// Adds the final ticket price to an Array
				}
			
			else {																	// If discount = 0 This code is executed
				StandardTicket StandardObject = new StandardTicket();
				PolyArray[count] = new StandardTicket();
				count++;
				StandardObject.StandardBought();
				int Standardprice = StandardObject.getStandardPrice();
				Standardprice = StandardObject.getStandardPrice();
				TicketPrices.add(Standardprice);
				}	
			break; 
			
			case 2: 
			
				if (discount != 0){
				OAPTicket OAPObject = new OAPTicket();
				PolyArray[count] = new OAPTicket();
				count++;
				OAPObject.DiscountOAPBought();
				int OAPprice = OAPObject.getOAPPrice();
				OAPprice = OAPprice - 2;
				TicketPrices.add(OAPprice);
			
			}
			
			
			else {
				OAPTicket OAPObject = new OAPTicket();
				PolyArray[count] = new OAPTicket();
				count++;
				OAPObject.OAPBought();
				int OAPprice = OAPObject.getOAPPrice();
				OAPprice = OAPObject.getOAPPrice();
				TicketPrices.add(OAPprice);
				
				}
			break; 
			
			
			case 3: 
			
			if 		(discount != 0){									   
					StudentTicket StudentObject = new StudentTicket(); 
					PolyArray[count] = new StudentTicket();
					count++;
					StudentObject.DiscountStudentBought();				   
					int Studentprice = StudentObject.getStudentPrice();	   
					Studentprice = Studentprice - 2;					   
					TicketPrices.add(Studentprice);	
				 	
			}
			
			
			else {													   
					StudentTicket StudentObject = new StudentTicket();
					PolyArray[count] = new StudentTicket();
					count++;
					StudentObject.StudentBought();
					int Studentprice = StudentObject.getStudentPrice();
					Studentprice = StudentObject.getStudentPrice();
					TicketPrices.add(Studentprice);
				
				}
			 break;
			
			
			
			case 4: 
			
			if 		(discount != 0){
					ChildTicket ChildObject = new ChildTicket();
					PolyArray[count] = new ChildTicket();
					count++;
					ChildObject.DiscountChildBought();
					int childprice = ChildObject.getChildPrice();
					childprice = childprice - 2;
					TicketPrices.add(childprice);
				 }
			 
			else {
					ChildTicket ChildObject = new ChildTicket();
					PolyArray[count] = new ChildTicket();
					count++;
					ChildObject.ChildBought();
					int childprice = ChildObject.getChildPrice();
					childprice = ChildObject.getChildPrice();
					TicketPrices.add(childprice);
				 
				  }
			break;
				
			
			case 5: 
			
			System.out.println("\nPrint total Order\n");									// If 5 is entered the total price will be calculated and printed here
			
			for(int x=0; x<10; x++)	{
						if (PolyArray[x] != null) {															// Preventing any Null pointer exceptions 
							PolyArray[x].SeatBooked();														// A polymorthic Array which prints the seats which have been booked
												  }
									}
				int i;
				int sum = 0;
					
					for(i = 0; i < TicketPrices.size(); i++)
					sum += TicketPrices.get(i);																// The array is calculated and the total price is shown here. 
					System.out.println("\n The total cost of tickets for this movie is \u00A3" + sum);
			break;
			
			case 6: 
			
				System.out.println("Close Program");													// If 6 is chosen then the Program will close. 
				System.exit(0);	
			break;
			
			default:
				System.out.println("Invalid month.");
            break;
			}
		
		}
	}
}
