package in.mahesh.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mahesh.Binding.Ticket;

public interface TicketRepo extends JpaRepository<Ticket, Integer> {

}
