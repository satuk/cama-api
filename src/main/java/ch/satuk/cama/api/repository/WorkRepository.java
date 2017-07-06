package ch.satuk.cama.api.repository;

import ch.satuk.cama.api.entity.Work;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by satuk on 05.07.17.
 */

public interface WorkRepository extends JpaRepository<Work, Long> {
    
    List<Work> findWorksByUser_Id( Long id );
    
    Work findById( Long id );
    
}
