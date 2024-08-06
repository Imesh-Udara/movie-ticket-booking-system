package com.imesh.movie_ticket_booking_system.entities;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.imesh.movie_ticket_booking_system.enums.Genre;
import com.imesh.movie_ticket_booking_system.enums.Language;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "SHOWS")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Show {
	
	private Integer showId;
	private Time time;
	private Date date;
	
	@ManyToOne
	@JoinColumn
	private Movie movie;
	
	@ManyToOne
	@JoinColumn
	private Theater theater;
	
	@OneToMany(mappedBy = "show", cascade = CascadeType.ALL)
	private List<ShowSeat> showSeatList = new ArrayList<>();
	
	@OneToMany(mappedBy = "show", cascade = CascadeType.ALL)
	private List<Ticket> ticketList = new ArrayList<>();
}
