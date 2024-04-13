package in.mahesh.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.mahesh.Binding.Passenger;
import in.mahesh.Binding.Ticket;
import in.mahesh.Service.TicketService;

@RestController
public class TicketRest {
	
	@Autowired
	private TicketService service;
	
	@PostMapping(value="/ticket",consumes = "application/json",produces = "application/json")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passenger){
		Ticket ticket = service.bookticket(passenger);
		return new ResponseEntity<Ticket>(ticket, HttpStatus.CREATED);
	}
	
	
	@GetMapping(value="/ticket/{ticketId}",produces = "application/json")
	public ResponseEntity<Ticket> getTicket(@PathVariable("ticketId") Integer ticketId){
		Ticket byId = service.getById(ticketId);
		return new ResponseEntity<Ticket>(byId, HttpStatus.OK);
	}
	
	@GetMapping(value="/tickets",produces = "application/json")
	public ResponseEntity<List<Ticket>> getAllTickets(){
		List<Ticket> list = service.getAllTickets();
		return new ResponseEntity<List<Ticket>>(list, HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
