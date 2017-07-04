package ch.satuk.cama.api.web;

import ch.satuk.cama.api.entity.Event;
import ch.satuk.cama.api.entity.JsonViews;
import ch.satuk.cama.api.service.EventService;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by satuk on 04.07.17.
 */

@RestController
@RequestMapping("/api/events")
public class RestEventController {
    
    private final EventService service;
    
    @Autowired
    public RestEventController( EventService service ) {
        this.service = service;
    }
    
    
    @JsonView(JsonViews.Summary.class)
    @GetMapping
    public List<Event> retrieveAllEvents() {
        return service.findAll();
    }
    
    @JsonView(JsonViews.Detail.class)
    @GetMapping("/{id}")
    public Event retrieveEvent( @PathVariable Long id ) {
        return this.service.findById( id );
    }
}
