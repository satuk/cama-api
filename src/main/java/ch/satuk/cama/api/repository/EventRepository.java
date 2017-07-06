package ch.satuk.cama.api.repository;

import ch.satuk.cama.api.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by satuk on 04.07.17.
 */
public interface EventRepository extends JpaRepository<Event, Long> {
    
    List<Event> findByEventNameIgnoreCaseContaining( String searchEvent );
    
    Event findById( Long id );
    
    List<Event> findEventsByCompany_Id( Long id );
    
}
