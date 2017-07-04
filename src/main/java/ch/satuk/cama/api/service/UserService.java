package ch.satuk.cama.api.service;

import ch.satuk.cama.api.entity.User;

import java.util.List;

/**
 * Created by satuk on 04.07.17.
 */

public interface UserService {
    
    List<User> findAll();
    
    List<User> findByFirstNameIgnoreCaseContaining( String searchUser );
    
    User findById( Long id );
}
