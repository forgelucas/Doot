package com.dootax.dootassistant.controller;
import com.dootax.dootassistant.model.Ticket;
import com.dootax.dootassistant.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tickets/new")
@CrossOrigin(origins = "*")
public class TicketController {
    @Autowired
    private TicketRepository repository;

    @PostMapping
    public Ticket criarTicket(@RequestBody Ticket ticket) {
        return repository.save(ticket);
    }
}
