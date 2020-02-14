package com.example.musiclibrary.repository;

import com.example.musiclibrary.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {

}
