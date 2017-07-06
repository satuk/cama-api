package ch.satuk.cama.api.repository;

import ch.satuk.cama.api.entity.Application;
import ch.satuk.cama.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by satuk on 05.07.17.
 */

public interface ApplicationRepository extends JpaRepository<Application, Long> {
    
    Application findById( Long id );
    
    Application findApplicationByEvent_IdAndUser_Id( Long event_id, Long user_id );
    
    List<Application> findApplicationsByUser_Id( Long id );
    
    List<Application> findApplicationsByEvent_Id( Long id );
}
