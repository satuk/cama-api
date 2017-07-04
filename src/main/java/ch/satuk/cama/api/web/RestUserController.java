package ch.satuk.cama.api.web;

import ch.satuk.cama.api.entity.JsonViews;
import ch.satuk.cama.api.entity.User;
import ch.satuk.cama.api.service.UserService;
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
    
    private final UserService service;
    
    @Autowired
    public RestUserController( UserService service ) {
        this.service = service;
    }
    
    @JsonView(JsonViews.Summary.class)
    @GetMapping
    public List<User> retrieveAllUsers() {
        return this.service.findAll();
    }
    
    @JsonView(JsonViews.Summary.class)
    @GetMapping("/{id}")
    public User retrieveUser( @PathVariable Long id ) {
        return this.service.findById( id );
    }
    
}
