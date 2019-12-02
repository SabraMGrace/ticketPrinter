//*******************************************************************
// ITC 115 (Fall 2019)
// Assignment 10
// Program: ticketPrinter
// By: Sabra Grace
//*******************************************************************
package ticketPrinter;

public class AdvanceTicket extends TicketPrinter {
	  private static Object ticketNumber;
	private int daysAhead;
	public double ticketPrice;

	  public AdvanceTicket(int number, int daysAhead) {
	    super(ticketNumber);
	    this.daysAhead = daysAhead;
	  }

	  public double getPrice() {
	    if (daysAhead >= 10) {
	      return 30.00;
	    } else {
	      return 40.00;
	    }
	  }

	  public String toString() {
	    if (daysAhead >= 10) {
	      return super.toString() + " (" + this.daysAhead + " days ahead, you got a great deal!)";
	    } else {
	      return super.toString() + " (" + this.daysAhead + " days ahead, you could have saved a bit more)";
	    }
	  }
	}
