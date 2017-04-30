/**
* This is the Standard ticket class
* @Author Nabil Aziz
*
*/

public class StandardTicket extends FreeSeat{  // Example of Inheritance
	
	
	private int StandardPrice = 8;
	
	public int getStandardPrice() {
		
		
		
		return StandardPrice;
	}
	
	public void StandardBought(){
		
		
		System.out.println("\nBought a Standard Ticket for \u00A38");							// This section executes the standard price for the Student ticket
		StandardTicket StandardObject = new StandardTicket();     
		StandardObject.SeatBooked();															// Inherited function which states the Seat is now booked
	}
	
	public void DiscountStandardBought(){
		
		
		System.out.println("\nBought a discounted Standard Ticket for \u00A36");				// This section executes the discounted price for the Student ticket
		StandardTicket StandardObject = new StandardTicket();     
		StandardObject.SeatBooked();															// Inherited function which states the Seat is now booked
										}
		 
		 void SeatBooked() {

		System.out.println("\nThe Standard Seat has been booked.\n");  // function which is inherited to the other ticket classes to state the seat has been booked. 

	}
	
}