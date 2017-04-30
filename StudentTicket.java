/**
* This is the studnet ticket class
* @Author Nabil Aziz
*
*/

public class StudentTicket extends FreeSeat{ // Example of Inheritance 
	
	private int StudentPrice = 6;						// Price is delcared and stored within the Student Price integer
	
	public int getStudentPrice() {
		
		
		
		return StudentPrice;
	}
	
	public void StudentBought(){
		
		
		System.out.println("\nBought a Student Ticket for \u00A36");							// This section executes the standard price for the Student ticket
		
		StudentTicket StudentObject = new StudentTicket();     
		StudentObject.SeatBooked();															// Inherited function which states the Seat is now booked

	}
	
	public void DiscountStudentBought(){
		
		
		System.out.println("\nBought a discounted Student Ticket for \u00A34");					// This section executes the discounted price for the Student ticket
		
		StudentTicket StudentObject = new StudentTicket();     
		StudentObject.SeatBooked();															// Inherited function which states the Seat is now booked
	
}		

	void SeatBooked() {

		System.out.println("\nThe Student Seat has been booked.\n");  // function which is inherited to the other ticket classes to state the seat has been booked. 
	
	}


} 