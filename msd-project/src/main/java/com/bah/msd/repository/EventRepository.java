package com.bah.msd.repository;

import org.springframework.data.repository.CrudRepository;

import com.bah.msd.domain.Event;

public interface EventRepository extends CrudRepository<Event, Long>{
	
	Event findByCode(String code);
	
	Event findByTitle(String title);

}
