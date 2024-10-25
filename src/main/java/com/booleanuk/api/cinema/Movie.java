package com.booleanuk.api.cinema;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private String rating;
    private String description;
    private int runtimeMins;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

