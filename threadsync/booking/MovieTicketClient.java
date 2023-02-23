package booking;

public class MovieTicketClient extends Thread {

    String CustomerName;
    int NumberOfTickets;
    MovieTicketServer Server;
    
    public MovieTicketClient(String customerName, int numberOfTickets, MovieTicketServer server) {
		this.CustomerName = customerName;
        this.NumberOfTickets = numberOfTickets;
        this.Server = server;
	}
	
	public void run() {
	
    this.Server.bookTicket(this.CustomerName, this.NumberOfTickets);

	}
}
