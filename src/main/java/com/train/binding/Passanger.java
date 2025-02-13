package com.train.binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Passanger {
	
	private Integer pId;
	private String pName;
	private Integer pAge;
	private Long pNo;
	private String emailId;

}
