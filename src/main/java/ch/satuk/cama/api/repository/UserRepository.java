package ch.satuk.cama.api.repository;

import ch.satuk.cama.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by satuk on 04.07.17.
 */

public interface UserRepository extends JpaRepository<User, Long> {
    
    List<User> findByFirstNameIgnoreCaseContaining( String searchText );
    
    User findById( Long id );
    
}
