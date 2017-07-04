package ch.satuk.cama.api.web;

import ch.satuk.cama.api.entity.Company;
import ch.satuk.cama.api.entity.JsonViews;
import ch.satuk.cama.api.service.CompanyService;
import ch.satuk.cama.api.service.DefaultCompanyService;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by satuk on 04.07.17.
 */

@Controller
@RequestMapping("/api/companies")
public class RestCompanyController {
    
    private final CompanyService service;
    
    
    @Autowired
    public RestCompanyController( DefaultCompanyService service ) {
        this.service = service;
    }
    
    @JsonView(JsonViews.Summary.class)
    @GetMapping
    public List<Company> retrieveAllCompanies() {
        return service.findAll();
    }
}
