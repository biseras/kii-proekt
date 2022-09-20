package com.example.film.xport.rest;

import com.example.film.domain.models.Film;
import com.example.film.services.FilmService;
import com.example.film.services.form.FilmForm;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/film")
@AllArgsConstructor
@CrossOrigin("http://localhost:3000/")
public class FilmResource {
    private final FilmService filmService;
    @GetMapping
    public List<Film> getAll() {
        return filmService.getAll();
    }
    @PostMapping("/create")
    public ResponseEntity<Film> create(@RequestBody FilmForm filmForm){
        return this.filmService.createFilm(filmForm).map(film -> ResponseEntity.ok().body(film))
                .orElseGet(()->ResponseEntity.badRequest().build());
    }

}
