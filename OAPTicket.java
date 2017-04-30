/**
* This is the OAP ticket class
* @Author Nabil Aziz
*
*/

public class OAPTicket extends FreeSeat{ // Example of Inheritance  
	
	private int OAPPrice = 6;
	
	
	public int getOAPPrice() {
		
		
		
		return OAPPrice;
	}
	
	public void OAPBought(){
		
		
		System.out.println("\nBought a OAP Ticket for \u00A36");						// This section executes the standard price for the Student ticket
		OAPTicket OAPObject = new OAPTicket();     
		OAPObject.SeatBooked();														// Inherited function which states the Seat is now booked
	}
		public void DiscountOAPBought(){
		
		
		System.out.println("\nBought a discounted OAP Ticket for \u00A34");				// This section executes the discounted price for the Student ticket
		OAPTicket OAPObject = new OAPTicket();     
		OAPObject.SeatBooked();														// Inherited function which states the Seat is now booked
}

	 void SeatBooked() {

		System.out.println("\nThe OAP Seat has been booked.\n");  // function which is inherited to the other ticket classes to state the seat has been booked. 
	
}
}