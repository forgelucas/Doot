package com.dootax.dootassistant.repository;
import com.dootax.dootassistant.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TicketRepository extends JpaRepository <Ticket, Integer> {
}
