//*******************************************************************
// ITC 115 (Fall 2019)
// Assignment 10
// Program: ticketPrinter
// By: Sabra Grace
//*******************************************************************
package ticketPrinter;

public class StudentAdvanceTicket extends AdvanceTicket {

	  public StudentAdvanceTicket(int number, int daysAhead) {
	    super(number, daysAhead);
	    super.ticketPrice = super.getPrice() / 2;
	  }

	  public String toString() {
	    return super.toString() + " (ID Required) ";
	  }
	}
