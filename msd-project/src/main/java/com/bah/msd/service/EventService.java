package com.bah.msd.service;

import java.util.Optional;

import com.bah.msd.domain.Event;

public interface EventService {
	
	public void addEvent(Event event);
	public Iterable<Event> getAllEvents();
	public Optional<Event> findEventById(Long id);

}
