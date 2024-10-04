package com.fatec.songs_backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.songs_backend.models.Song;
import com.fatec.songs_backend.repositories.SongRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class SongService {
    @Autowired
    private SongRepository songRepository;

    public List<Song> getAll(){
        return songRepository.findAll();
    }

    public Song get(int id){
        return songRepository.findById(id)
               .orElseThrow(() -> new EntityNotFoundException("Song not found"));
    }

    public Song post(Song song){
        return songRepository.save(song);
    }

    public void delete(int id){
        if(songRepository.existsById(id)){
            songRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Song not found");
        }
    }

    public void put(int id, Song requestSong){
        Song song = songRepository.getReferenceById(id);

        song.setName(requestSong.getName());
        song.setAlbum(requestSong.getAlbum());
        song.setLength(requestSong.getLength());
        song.setArtist(requestSong.getArtist());
        song.setGenre(requestSong.getGenre());

        songRepository.save(song);
    }
}
