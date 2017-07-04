package ch.satuk.cama.api.service;

import ch.satuk.cama.api.entity.Company;

import java.util.List;

/**
 * Created by satuk on 03.07.17.
 */
public interface CompanyService {
    
    List<Company> findAll();
    
    List<Company> findByIdIgnoreCaseConstaining( String searchText );
    
    Company findById( Long id );
    
}
