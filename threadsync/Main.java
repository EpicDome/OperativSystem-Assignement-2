import booking.*;

public class Main {
      public static void main(String[] args) {
        MovieTicketServer movieTicketServer = new MovieTicketServer("Troll", 10);

        // Creating 4 threads
        Thread t1 = new MovieTicketClient("Kåre", 2, movieTicketServer);
        Thread t2 = new MovieTicketClient("Knut", 3, movieTicketServer);
        Thread t3 = new MovieTicketClient("Karsten", 4, movieTicketServer);
        Thread t4 = new MovieTicketClient("Alexander Rybak", 3, movieTicketServer);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
