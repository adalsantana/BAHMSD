package com.bah.msd.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bah.msd.domain.Event;
import com.bah.msd.repository.EventRepository;

@Service
public class EventServiceImp implements EventService{
	
	@Autowired
	private EventRepository repo;
	
	
	public void addEvent(Event event) {
		repo.save(event);
	}
	
	
	public Iterable<Event> getAllEvents() {
		return repo.findAll();
	}
	
	
	public Optional<Event> findEventById(Long id) {
		return repo.findById(id);
	}
	
	

}
