package com.dataopt.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dataopt.entities.Ticket;

//@Repository
public interface TicketBookingDao extends CrudRepository<Ticket, Integer>{

	//Ticket findOne(Integer ticketId);

}
