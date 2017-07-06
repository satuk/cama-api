package ch.satuk.cama.api.web;

import ch.satuk.cama.api.entity.Company;
import ch.satuk.cama.api.entity.Event;
import ch.satuk.cama.api.entity.JsonViews;
import ch.satuk.cama.api.service.CompanyService;
import ch.satuk.cama.api.service.EventService;
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
    
    private final CompanyService companyService;
    private final EventService eventService;
    
    @Autowired
    public RestCompanyController( CompanyService companyService, EventService eventService ) {
        this.companyService = companyService;
        this.eventService = eventService;
    }
    
    @JsonView(JsonViews.Summary.class)
    @GetMapping
    public List<Company> retrieveAllCompanies() {
        return companyService.findAll();
    }
    
    @JsonView(JsonViews.Detail.class)
    @GetMapping("/{id}")
    public Company retrieveCompany( @PathVariable Long id ) {
        return this.companyService.findById( id );
    }
    
    @JsonView(JsonViews.Summary.class)
    @GetMapping("/{id}/events")
    public List<Event> retrieveAllEventsOfCompany( @PathVariable Long id ) {
        return this.eventService.findEventsByCompany_Id( id );
    }
    
    @JsonView(JsonViews.Summary.class)
    @GetMapping("/{id}/events/{id}")
    public Event retrieveEventOfCompany( @PathVariable Long id ) {
        return this.eventService.findById( id );
    }
}
