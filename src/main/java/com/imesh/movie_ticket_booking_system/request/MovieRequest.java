package com.imesh.movie_ticket_booking_system.request;

import java.util.Date;

import com.imesh.movie_ticket_booking_system.enums.Genre;
import com.imesh.movie_ticket_booking_system.enums.Language;

import lombok.Data;

@Data
public class MovieRequest {
	
	private String movieName;
	private Integer duration;
	private Double rating;
	private Date releaseDate;
	private Genre genre;
	private Language language;
	
}
