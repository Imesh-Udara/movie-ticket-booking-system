package com.imesh.movie_ticket_booking_system.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imesh.movie_ticket_booking_system.entities.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>{

	Movie findByMovieName(String movieName);
	
}
