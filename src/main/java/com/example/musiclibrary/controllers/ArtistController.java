package com.example.musiclibrary.controllers;

import com.example.musiclibrary.models.Artist;
import com.example.musiclibrary.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController(value = "/artist")
public class ArtistController {

    @Autowired
    ArtistRepository artistRepository;

    @GetMapping(value = "/all")
    public List<Artist> getAllArtists(){
        return artistRepository.findAll();
    }

    @PostMapping(value = "/new")
    public Artist createArtist(@Valid @RequestBody Artist artist){
        return artistRepository.save(artist);
    }
}
