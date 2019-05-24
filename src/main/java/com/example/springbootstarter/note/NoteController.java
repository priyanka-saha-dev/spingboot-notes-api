package com.example.springbootstarter.note;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoteController {

	@Autowired
	private NoteService svc;
	
	@RequestMapping(method=RequestMethod.GET, value="/note")
	private List<Note> getAllNotes() {
		return svc.getAllNotes();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/note")
	private void addNote(@RequestBody Note note) {
		svc.addNote(note);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/note/{id}")
	private Note getNoteByID(@PathVariable String id) {
		return svc.getNoteByID(id).get();
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/note/{id}")
	private void updateNote(@PathVariable String id, @RequestBody Note note) {
		svc.updateNote(id, note);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/note/{id}")
	private void deleteNote(@PathVariable String id) {
		svc.deleteNote(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/note/{id}/favourite")
	private Boolean toggleFavourite(@PathVariable String id) {
		return svc.toggleFavourite(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/note/{id}/favourite")
	private Boolean getFavourite(@PathVariable String id) {
		return svc.getFavourite(id);
	}
	
}
