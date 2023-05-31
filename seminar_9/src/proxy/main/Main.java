package proxy.main;

import proxy.model.Client;
import proxy.model.ITicketOffice;
import proxy.model.Proxy;
import proxy.model.TicketOffice;

public class Main {
    public static void main(String[] args) {
        Client underageClient=new Client("Maria",12);
        Client overageClient=new Client("Mircea",22);
        ITicketOffice ticketOffice=new TicketOffice();

        ticketOffice.sellTicket(underageClient);
        ticketOffice.sellTicket(overageClient);

        ITicketOffice proxy=new Proxy(ticketOffice);
        proxy.sellTicket(underageClient);
        proxy.sellTicket(overageClient);
    }
}
