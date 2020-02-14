package com.example.musiclibrary.controllers;

import com.example.musiclibrary.models.Album;
import com.example.musiclibrary.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController(value ="/album")
public class AlbumController {
    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/album/all")
    public List<Album> getAllAlbums(){
        return albumRepository.findAll();

    }

    @PostMapping("/create")
    public Album createAlbum(@Valid @RequestBody Album albumData){
        return albumRepository.save(albumData);
    }
}
