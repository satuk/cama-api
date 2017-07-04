package ch.satuk.cama.api.repository;

import ch.satuk.cama.api.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by satuk on 03.07.17.
 */

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
    
    List<Company> findByNameIgnoreCaseContaining( String searchText );
    
    Company findById( Long id );
    
}
