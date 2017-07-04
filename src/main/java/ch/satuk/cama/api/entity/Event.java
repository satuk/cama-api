package ch.satuk.cama.api.entity;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by satuk on 03.07.17.
 */
@Entity
@Table(name = "events")
@Data
@EqualsAndHashCode(exclude = "id")
@ToString
public class Event implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @JsonView(JsonViews.Summary.class)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @JsonView(JsonViews.Summary.class)
    @Column(name = "date_created", updatable = false, nullable = false)
    private LocalDateTime dateCreated = LocalDateTime.now();
    
    
    @NotNull(message = "{errors.required}")
    @Size(max = 50, message = "{errors.range}")
    @JsonView(JsonViews.Summary.class)
    @Column(name = "event_name")
    private String eventName;
    
    @NotNull(message = "{errors.required}")
    @Size(max = 50, message = "{errors.range}")
    @JsonView(JsonViews.Summary.class)
    private String logo;
    
    @JsonView(JsonViews.Summary.class)
    @NotNull(message = "{errors.required}")
    @Column(name = "event_date")
    private LocalDate eventDate;
    
    @JsonView(JsonViews.Summary.class)
    @NotNull(message = "{errors.required}")
    @Column(name = "event_start")
    private LocalDateTime eventStart;
    
    @JsonView(JsonViews.Summary.class)
    @NotNull(message = "{errors.required}")
    @Column(name = "event_end")
    private LocalDateTime eventEnd;
    
    @JsonView(JsonViews.Detail.class)
    @NotNull(message = "{errors.required}")
    @Column(name = "different_location")
    private Boolean differentLocation;
    
    @JsonView(JsonViews.Detail.class)
    @NotNull(message = "{errors.required}")
    private Boolean visibility;
    
    @JsonView(JsonViews.Detail.class)
    @Column(name = "expected_person")
    private Integer expectedPerson;
    
    @ManyToOne
    private Company company;
    
    public Event() {
        /* default constructor: required by JPA */
    }
    
    public Event( Long id, String eventName, String logo, LocalDate eventDate, LocalDateTime eventStart, LocalDateTime eventEnd, Boolean differentLocation, Boolean visibility, Integer expectedPerson, Company company ) {
        this.id = id;
        this.eventName = eventName;
        this.logo = logo;
        this.eventDate = eventDate;
        this.eventStart = eventStart;
        this.eventEnd = eventEnd;
        this.differentLocation = differentLocation;
        this.visibility = visibility;
        this.expectedPerson = expectedPerson;
        this.company = company;
    }
    
    public Event( String eventName, String logo, LocalDate eventDate, LocalDateTime eventStart, LocalDateTime eventEnd, Boolean differentLocation, Boolean visibility, Integer expectedPerson, Company company ) {
        this( null, eventName, logo, eventDate, eventStart, eventEnd, differentLocation, visibility, expectedPerson, company );
    }
    
    @PrePersist
    protected void prePersist() {
        this.dateCreated = LocalDateTime.now();
    }
}
