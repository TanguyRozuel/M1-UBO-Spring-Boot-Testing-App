package com.dtos;

import lombok.Data;

import java.time.LocalDate;

@Data
public class DogDto {
	
	private Long Id;
	private String name;
	private String race;
	private LocalDate birthDate;
	
}
