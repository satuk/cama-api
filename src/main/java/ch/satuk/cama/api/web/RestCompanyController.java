package ch.satuk.cama.api.web;

import ch.satuk.cama.api.entity.Company;
import ch.satuk.cama.api.entity.JsonViews;
import ch.satuk.cama.api.service.CompanyService;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by satuk on 04.07.17.
 */

@RestController
@RequestMapping("/api/companies")
public class RestCompanyController {
    
    private final CompanyService service;
    
    @Autowired
    public RestCompanyController( CompanyService service ) {
        this.service = service;
    }
    
    @JsonView(JsonViews.Summary.class)
    @GetMapping
    public List<Company> retrieveAllCompanies() {
        return service.findAll();
    }
    
    @JsonView(JsonViews.Detail.class)
    @GetMapping("/{id}")
    public Company retrieveCompany( @PathVariable Long id ) {
        return this.service.findById( id );
    }
}
