package com.bah.msd.api;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import com.bah.msd.domain.Event;
import com.bah.msd.repository.EventRepository;
import com.bah.msd.service.EventService;

@RestController
@RequestMapping("/events")
public class EventApi {
	
	@Autowired
	private EventRepository repo;
	
	@GetMapping
	public Iterable<Event> getAllEvents() {
		return repo.findAll();
	}
	
	@GetMapping("/{eventId}")
	public Optional<Event> getEventById(@PathVariable ("eventId")long id) {
		return repo.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<?> addEvent(@RequestBody Event newEvent, UriComponentsBuilder uri) {
		if(newEvent.getId()!=0 || newEvent.getCode() == null || newEvent.getDescription() == null || newEvent.getTitle() == null) {
			return ResponseEntity.badRequest().build();
		}
		
		newEvent = repo.save(newEvent);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/id").buildAndExpand(newEvent.getId()).toUri();
		ResponseEntity<?> response = ResponseEntity.created(location).build();
		
		return response;
	}

}
