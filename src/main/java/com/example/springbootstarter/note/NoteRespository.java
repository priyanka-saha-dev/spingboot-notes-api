package com.example.springbootstarter.note;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoteRespository extends MongoRepository<Note, String> {

	//public void toggleFavourite(String id);
	
}
