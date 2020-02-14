package com.example.musiclibrary.repository;

import com.example.musiclibrary.models.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
