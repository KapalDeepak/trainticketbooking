package com.train.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.train.binding.Passanger;
import com.train.binding.Ticket;

@RestController
public class PassangerRestController {

	@PostMapping(value = "/passanger", produces = "application/json", consumes = "application/json")
	public ResponseEntity<Ticket> getPassangerDetails(@RequestBody Passanger passanger) {
		   Ticket ticket = new Ticket((long)456345643, "Konark Express", "BAM", "CSTM", passanger);
		String str = "ticket booked successfully ";
		return new ResponseEntity<Ticket>(ticket, HttpStatus.CREATED);
	}
	@PutMapping("/ticket")
	public ResponseEntity<String> updateTicket(@RequestBody Passanger passanger)
	{
		System.out.println(passanger);
//		logic to update ticket
		return new ResponseEntity<String>("Ticket Updated",HttpStatus.OK);
	}
	@DeleteMapping("/ticket/{pnr}")
	public ResponseEntity<String> deleteTicket(@PathVariable("pnr") Long pnrNo )
	{
		return new ResponseEntity<String>("Ticket Deleted", HttpStatus.OK);
	}

}
