package com.booleanuk.api.cinema;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Screening {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie;

    private int screenNumber;
    private int capacity;
    private LocalDateTime startsAt;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

