package com.poc.TicketBookingRestApp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.poc.TicketBookingRestApp.dto.TicketDTO;
import com.poc.TicketBookingRestApp.entities.TicketDetails;

@RestController
public class TicketBookingController {

	@RequestMapping(path="/createTicket",method=RequestMethod.POST)		
	public ResponseEntity<TicketDetails> createTicket(@RequestBody TicketDTO ticketDTO)
	{
		TicketDetails ticketDetails = new TicketDetails();
		ticketDetails.setFirstName(ticketDTO.getFirstName());
		ticketDetails.setLastName(ticketDTO.getLastName());
		ticketDetails.setTicketNumber("1");
		return new ResponseEntity<TicketDetails>(ticketDetails,HttpStatus.OK);
	}
	
}
