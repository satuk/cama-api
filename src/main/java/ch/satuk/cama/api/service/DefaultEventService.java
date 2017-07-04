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
    private final EventRepository repository;
    
    @Autowired
    public DefaultEventService( EventRepository repository ) {
        this.repository = repository;
    }
    
    @Override
    public List<Event> findAll() {
        return this.repository.findAll();
    }
    
    @Override
    public List<Event> findByEventNameIgnoreCaseContaining( String searchEvent ) {
        return this.repository.findByEventNameIgnoreCaseContaining( searchEvent );
    }
    
    @Override
    public Event findById( Long id ) {
        return this.repository.findById( id );
    }
}
