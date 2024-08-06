package com.imesh.movie_ticket_booking_system.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imesh.movie_ticket_booking_system.DTO.MovieDTO;
import com.imesh.movie_ticket_booking_system.entities.Movie;
import com.imesh.movie_ticket_booking_system.exceptions.MovieAlreadyExits;
import com.imesh.movie_ticket_booking_system.repositoryes.MovieRepository;
import com.imesh.movie_ticket_booking_system.request.MovieRequest;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	public String addMovie(MovieRequest movieRequest) {
		
		Movie movieByName = movieRepository.findByMovieName(movieRequest.getMovieName());
		
		if(movieByName != null && movieByName.getLanguage().equals(movieRequest.getLanguage())) {
			throw new MovieAlreadyExits();
		}
		
		Movie movie = MovieDTO.movieDtoToMovie(movieRequest);
		movieRepository.save(movie);
		return "The movie has been added successfully";
		
	}
}
