package com.example.film.domain.repository;

import com.example.film.domain.models.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface FilmRepository extends JpaRepository<Film, Long> {
}
