package ch.satuk.cama.api.repository;

import ch.satuk.cama.api.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by satuk on 05.07.17.
 */

public interface ApplicationRepository extends JpaRepository<Application, Long> {
    
    List<Application> findApplicationsByUser_Id( Long id );
    
}
