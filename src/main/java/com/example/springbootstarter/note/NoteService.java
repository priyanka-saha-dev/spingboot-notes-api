package com.example.springbootstarter.note;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteService {

	@Autowired
	private NoteRespository repo;

	public List<Note> getAllNotes() {
		return repo.findAll();
	}

	public Optional<Note> getNoteByID(String id) {
		return repo.findById(id);
	}

	public void addNote(Note note) {
		repo.save(note);
	}

	public void updateNote(String id, Note note) {
		Optional<Note> noteFound = repo.findById(id);

		if (noteFound.isPresent()) {
			repo.save(note);
		}
	}

	public void deleteNote(String id) {
		repo.deleteById(id);
	}
	
//	public void toggleFavourite(String id) {
//		repo.toggleFavourite(id);
//	}

}
