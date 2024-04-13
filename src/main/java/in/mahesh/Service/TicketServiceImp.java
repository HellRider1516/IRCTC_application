package in.mahesh.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.mahesh.Binding.Passenger;
import in.mahesh.Binding.Ticket;
import in.mahesh.Repo.TicketRepo;
@Service
public class TicketServiceImp implements TicketService {
	
	@Autowired
	private TicketRepo repo;

	@Override
	public Ticket bookticket(Passenger passenger) {
		Ticket t=new Ticket();
		BeanUtils.copyProperties(passenger,t);
		repo.save(t);
		return t;
	}

	@Override
	public Ticket getById(Integer ticketid) {
		Optional<Ticket> byId = repo.findById(ticketid);
		if(byId.isPresent()) {
			Ticket ticket = byId.get();
			return ticket;
			
		}else {
			return null;
		}
	}

	@Override
	public List<Ticket> getAllTickets() {
		return repo.findAll();
	}

}
