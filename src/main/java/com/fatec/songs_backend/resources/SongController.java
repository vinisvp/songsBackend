package com.fatec.songs_backend.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.songs_backend.models.Song;
import com.fatec.songs_backend.services.SongService;

@RestController
@RequestMapping("songs")
public class SongController {
    @Autowired
    private SongService songService;

    @GetMapping
    public List<Song> getSongs(){
        return songService.getAll();
    }

    @GetMapping("{id}")
    public Song getSong(@PathVariable int id){
        return songService.get(id);
    }

    @PostMapping
    public Song postSong(@RequestBody Song song){
        return songService.post(song);
    }
}
