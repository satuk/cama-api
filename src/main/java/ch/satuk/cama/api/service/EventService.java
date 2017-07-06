package ch.satuk.cama.api.service;

import ch.satuk.cama.api.entity.Event;

import java.util.List;

/**
 * Created by satuk on 04.07.17.
 */

public interface EventService {
    
    Event save( Event event );
    
    Event findById( Long id );
    
    List<Event> findAll();
    
    List<Event> findByEventNameIgnoreCaseContaining( String searchEvent );
    
    List<Event> findEventsByCompany_Id( Long id );
}
