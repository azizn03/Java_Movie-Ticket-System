/**
* This is the Child ticket class
* @Author Nabil Aziz
*
*/

public class ChildTicket extends FreeSeat{ // Example of Inheritance 
	
	
	private int ChildPrice = 4;
			
	public int getChildPrice() {
		
		
		
		return ChildPrice;
	}
	
	public void ChildBought(){
		
		
		System.out.println("\nBought a Child Ticket for \u00A34");							// This section executes the standard price for the Student ticket

		ChildTicket ChildObject = new ChildTicket();     
		ChildObject.SeatBooked();															// Inherited function which states the Seat is now booked
	}	
	
	public void DiscountChildBought(){
		
		
		System.out.println("\nBought a discounted Child Ticket for \u00A32");				// This section executes the discounted price for the Student ticket

		ChildTicket ChildObject = new ChildTicket();     
		ChildObject.SeatBooked();															// Inherited function which states the Seat is now booked
	}
	
	 void SeatBooked() {

		System.out.println("\nThe Child Seat has been booked.\n");  // function which is inherited to the other ticket classes to state the seat has been booked. 
	
}
}