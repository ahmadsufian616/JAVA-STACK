package com.example.Lookify.repoistroy;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Lookify.models.Song;

@Repository
public interface SongRepo extends CrudRepository<Song, Long> {

	List<Song> findAll();

	List<Song> findByArtistContaining(String artist);

	List<Song> findTop10ByOrderByRateDesc();

}
