package ch.satuk.cama.api.web;

import ch.satuk.cama.api.entity.*;
import ch.satuk.cama.api.service.ApplicationService;
import ch.satuk.cama.api.service.EventService;
import ch.satuk.cama.api.service.UserService;
import ch.satuk.cama.api.service.WorkService;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by satuk on 04.07.17.
 */

@RestController
@RequestMapping("/api/events")
public class RestEventController {
    
    private final EventService eventService;
    private final ApplicationService applicationService;
    private final UserService userService;
    private final WorkService workService;
    
    
    @Autowired
    public RestEventController( EventService eventService, ApplicationService applicationService, UserService
            userService, WorkService workService ) {
        this.eventService = eventService;
        this.applicationService = applicationService;
        this.userService = userService;
        this.workService = workService;
    }
    
    
    @JsonView(JsonViews.Summary.class)
    @GetMapping
    public List<Event> retrieveAllEvents() {
        return eventService.findAll();
    }
    
    @JsonView(JsonViews.Detail.class)
    @GetMapping("/{id}")
    public Event retrieveEvent( @PathVariable Long id ) {
        return this.eventService.findById( id );
    }
    
    @JsonView(JsonViews.Summary.class)
    @GetMapping("/{id}/applications")
    public List<User> retrieveAllAppliedUsers( @PathVariable Long id ) {
        
        return this.applicationService
                .findApplicationsByEvent_Id( id )
                .stream()
                .map( application -> this.userService.findById( application.getUser().getId() ) )
                .collect( Collectors.toList() );
    }
    
    @JsonView(JsonViews.Summary.class)
    @PostMapping("/{id}/applications")
    public void approveUser( @RequestBody Map<String, String> json, @PathVariable Long id ) {
        // check if its in the applications list
        
        // find event and user
        Event event = this.eventService.findById( id );
        User user = this.userService.findById( Long.parseLong( json.get( "user_id" ) ) );
        
        user.addCompany( event.getCompany() );
        this.userService.updateUser( user );
        
        // than save it and allow just once
        if ( this.workService.findWorksByUser_Id( user.getId() )
                .stream()
                .filter( work -> work.getEvent().equals( event ) )
                .collect( Collectors.toList() )
                .size() == 0 ) {
            
            this.workService.save( new Work( event, user ) );
            
        }
        
        // than delete it from applications table
        Application application = this.applicationService.findApplicationByEvent_IdAndUser_Id( event.getId(), user.getId() );
        if ( this.applicationService
                .findAll()
                .stream()
                .filter( a -> a.getId() == application.getId() )
                .collect( Collectors.toList() )
                .size() == 0 ) {
            
            this.applicationService.deleteById( application.getId() );
            
        }
    }
}
