package com.imesh.movie_ticket_booking_system.entities;

import com.imesh.movie_ticket_booking_system.enums.SeatType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "SHOW_SEATS")
@Data
public class ShowSeat {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
  
    private String seatNo;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    private Integer price;
    
    private Boolean isAvailable;
    
    private Boolean isFoodContains;

    @ManyToOne
    @JoinColumn
    private Show show;
}
