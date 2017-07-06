package ch.satuk.cama.api.service;

import ch.satuk.cama.api.entity.Company;
import ch.satuk.cama.api.entity.JsonViews;
import ch.satuk.cama.api.entity.User;
import ch.satuk.cama.api.repository.UserRepository;
import ch.satuk.cama.api.repository.WorkRepository;
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
public class DefaultUserService implements UserService {
    
    @JsonView(JsonViews.Summary.class)
    private final UserRepository userRepository;
    
    
    @Autowired
    public DefaultUserService( UserRepository userRepository ) {
        this.userRepository = userRepository;
    }
    
    
    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }
    
    @Override
    public List<User> findByFirstNameIgnoreCaseContaining( String searchUser ) {
        return this.userRepository.findByFirstNameIgnoreCaseContaining( searchUser );
    }
    
    @Override
    public User findById( Long id ) {
        return this.userRepository.findById( id );
    }
    
    @Override
    public void updateUser( User user ) {
        this.userRepository.saveAndFlush( user );
    }
    
}
