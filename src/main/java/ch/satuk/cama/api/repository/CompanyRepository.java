package ch.satuk.cama.api.repository;

import ch.satuk.cama.api.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by satuk on 03.07.17.
 */
public interface CompanyRepository extends JpaRepository<Company, Long> {
    
    List<Company> findByNameIgnoreCaseContaining( String searchText );
    
    Company findById( Long id );
    
}
