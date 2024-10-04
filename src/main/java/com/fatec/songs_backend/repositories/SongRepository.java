package com.fatec.songs_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.songs_backend.models.Song;

public interface SongRepository extends JpaRepository<Song, Integer> {
    
}
