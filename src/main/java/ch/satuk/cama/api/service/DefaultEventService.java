package ch.satuk.cama.api.service;

import ch.satuk.cama.api.entity.Event;
import ch.satuk.cama.api.entity.JsonViews;
import ch.satuk.cama.api.repository.EventRepository;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by satuk on 04.07.17.
 */

@Service
@Transactional(readOnly = true)
public class DefaultEventService implements EventService {
    
    @JsonView(JsonViews.Summary.class)
    private final EventRepository eventRepository;
    
    @Autowired
    public DefaultEventService( EventRepository eventRepository ) {
        this.eventRepository = eventRepository;
    }
    
    @Override
    public List<Event> findAll() {
        return this.eventRepository.findAll();
    }
    
    @Override
    public List<Event> findByEventNameIgnoreCaseContaining( String searchEvent ) {
        return this.eventRepository.findByEventNameIgnoreCaseContaining( searchEvent );
    }
    
    @Transactional(readOnly = false)
    @Override
    public Event save( Event event ) {
        return eventRepository.save( event );
    }
    
    @Override
    public Event findById( Long id ) {
        return this.eventRepository.findById( id );
    }
    
    @Override
    public List<Event> findEventsByCompany_Id( Long id ) {
        return this.eventRepository.findEventsByCompany_Id( id );
    }
}
