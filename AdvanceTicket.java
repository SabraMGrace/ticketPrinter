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

	  public AdvanceTicket(int number, int daysAdvance) {
	    super(ticketNumber);
	    this.daysAdvance = daysAdvance;
	  }

	  public double getPrice() {
	    if (daysAdvance >= 10) {
	      return 30.00;
	    } else {
	      return 40.00;
	    }
	  }

	  public String toString() {
	    if (daysAdvance >= 10) {
	      return super.toString() + " (" + this.daysAdvance + " days before the event");
	    } else {
	      return super.toString() + " (" + this.daysAhead + " days before the event");
	    }
	  }
	}
