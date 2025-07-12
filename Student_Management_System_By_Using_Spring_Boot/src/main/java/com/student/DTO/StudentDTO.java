package com.student.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentDTO 
{
	private String name;
	private String emailid;
	private long mobilenumber;
	private String gender;
}
