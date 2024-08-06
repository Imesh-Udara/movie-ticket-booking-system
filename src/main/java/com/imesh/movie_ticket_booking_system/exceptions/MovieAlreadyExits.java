package com.imesh.movie_ticket_booking_system.exceptions;

public class MovieAlreadyExits extends RuntimeException{
	
	private static final long serialVersionUID = 87214071728310561L;
	
	public MovieAlreadyExits() {
		super("Movie is already exists with same name and language");
	}

}
