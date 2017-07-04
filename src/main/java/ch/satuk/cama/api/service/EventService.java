package ch.satuk.cama.api.service;

import ch.satuk.cama.api.entity.Event;

import java.util.List;

/**
 * Created by satuk on 04.07.17.
 */

public interface EventService {
    
    List<Event> findAll();
    
    List<Event> findByEventNameIgnoreCaseContaining( String searchEvent );
    
    Event findById( Long id );
}
