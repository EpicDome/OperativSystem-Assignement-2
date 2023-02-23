package booking;

public class MovieTicketServer {
	String MovieName;
    int NumberOfSeats;

	public MovieTicketServer(String movieName, int numberOfSeats) {
		this.MovieName = movieName;
        this.NumberOfSeats = numberOfSeats;
	}

	public synchronized void bookTicket(String customerName, int numberOfTickets) {

		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Available tickets: " + this.NumberOfSeats);

		if ((this.NumberOfSeats - numberOfTickets) < 0) {
			System.out.println("Hi, " + customerName + " : There are only " + this.NumberOfSeats + " number of seats left for " + this.MovieName);
		} else {
			this.NumberOfSeats = this.NumberOfSeats - numberOfTickets;
			System.out.println("Hi, " + customerName + " : The " + numberOfTickets + " seats are successfully booked for" + this.MovieName);
		}
	}
}
