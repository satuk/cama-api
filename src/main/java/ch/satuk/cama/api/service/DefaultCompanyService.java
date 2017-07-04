package ch.satuk.cama.api.service;

import ch.satuk.cama.api.entity.Company;
import ch.satuk.cama.api.entity.JsonViews;
import ch.satuk.cama.api.repository.CompanyRepository;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by satuk on 03.07.17.
 */

@Service
@Transactional(readOnly = true)
public class DefaultCompanyService implements CompanyService {
    
    @JsonView(JsonViews.Summary.class)
    private final CompanyRepository repository;
    
    
    @Autowired
    public DefaultCompanyService( CompanyRepository repository ) {
        this.repository = repository;
    }
    
    
    @Override
    public List<Company> findAll() {
        return this.repository.findAll();
    }
    
    @Override
    public List<Company> findByIdIgnoreCaseContaining( String searchText ) {
        return this.repository.findByNameIgnoreCaseContaining( searchText );
    }
    
    @Override
    public Company findById( Long id ) {
        return this.repository.findById( id );
    }
}
