package ch.satuk.cama.api.web;

import ch.satuk.cama.api.entity.Application;
import ch.satuk.cama.api.entity.JsonViews;
import ch.satuk.cama.api.entity.User;
import ch.satuk.cama.api.entity.Work;
import ch.satuk.cama.api.service.ApplicationService;
import ch.satuk.cama.api.service.UserService;
import ch.satuk.cama.api.service.WorkService;
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
@RequestMapping("/api/users")
public class RestUserController {
    
    private final UserService userService;
    private final WorkService workService;
    private final ApplicationService applicationService;
    
    @Autowired
    public RestUserController( UserService userService, WorkService workService, ApplicationService applicationService ) {
        this.userService = userService;
        this.workService = workService;
        this.applicationService = applicationService;
    }
    
    @JsonView(JsonViews.Summary.class)
    @GetMapping
    public List<User> retrieveAllUsers() {
        return this.userService.findAll();
    }
    
    @JsonView(JsonViews.Detail.class)
    @GetMapping("/{id}")
    public User retrieveUser( @PathVariable Long id ) {
        return this.userService.findById( id );
    }
    
    @JsonView(JsonViews.Detail.class)
    @GetMapping("/{id}/works")
    public List<Work> retrieveUserAllWorks( @PathVariable Long id ) {
        return this.workService.findWorksByUser_Id( id );
    }
    
    @JsonView(JsonViews.Detail.class)
    @GetMapping("/{id}/applications")
    public List<Application> retrieveUserAllApplications( @PathVariable Long id ) {
        return this.applicationService.findApplicationsByUser_Id( id );
    }
}
