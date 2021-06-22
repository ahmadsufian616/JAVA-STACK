package com.example.Lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.Lookify.models.Song;
import com.example.Lookify.repoistroy.SongRepo;

@Service
public class SongService {
	private final SongRepo Repo;

	public SongService(SongRepo repo) {

		Repo = repo;
	}
	
	public List<Song> findallsong() {
		
		return Repo.findAll();
	}
	
	public Song createSong(Song song) {
		return Repo.save(song);
		 
	}
	public Song findbyid( Long id) {
		Optional<Song> optionalSong = Repo.findById(id);
		if (optionalSong.isPresent()) {
			return optionalSong.get();
		} else {
			return null;
		}
		}
		public Song removebyid(Long id) {
				Optional<Song> optionalSong = Repo.findById(id);
				Repo.deleteById(id);
				return optionalSong.get();
			
			
			}
		public List<Song> songsContainingArtist(String artist) {
			return Repo.findByArtistContaining(artist);
		}
			
		public List<Song> topTenByRating() {
			return Repo.findTop10ByOrderByRateDesc();
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
			
			
			
			
			
			

	
		
	

}
