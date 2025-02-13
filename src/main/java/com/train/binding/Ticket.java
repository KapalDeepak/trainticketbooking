package com.train.binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
	
	private Long pnrNo;
	private String trainName;
	private String boardAt;
	private String departureAt;
	private Passanger passanger;
	
	
	 

}
