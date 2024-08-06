package com.imesh.movie_ticket_booking_system.DTO;

import com.imesh.movie_ticket_booking_system.entities.Movie;
import com.imesh.movie_ticket_booking_system.request.MovieRequest;

public class MovieDTO {
	public static Movie movieDtoToMovie(MovieRequest movieRequest) {
		Movie movie = Movie.builder()
				.movieName(movieRequest.getMovieName())
				.duration(movieRequest.getDuration())
				.genre(movieRequest.getGenre())
				.language(movieRequest.getLanguage())
				.releaseData(movieRequest.getReleaseDate())
				.rating(movieRequest.getRating())
				.build();
		return movie;
		
	}
}
