package in.mahesh.Service;

import java.util.List;

import in.mahesh.Binding.Passenger;
import in.mahesh.Binding.Ticket;

public interface TicketService {
	
	public Ticket bookticket(Passenger passenger );
	
	public Ticket getById(Integer ticketid);
	
	public List<Ticket> getAllTickets();
	

}
