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
    private String name;
    
    @NotNull(message = "{errors.required}")
    @Size(max = 50, message = "{errors.range}")
    @JsonView(JsonViews.Summary.class)
    private String logo;
    
    @JsonView(JsonViews.Summary.class)
    @NotNull(message = "{errors.required}")
    private LocalDate date;
    
    @JsonView(JsonViews.Summary.class)
    @NotNull(message = "{errors.required}")
    private LocalDateTime start;
    
    @JsonView(JsonViews.Summary.class)
    @NotNull(message = "{errors.required}")
    private LocalDateTime end;
    
    @JsonView(JsonViews.Detail.class)
    @NotNull(message = "{errors.required}")
    @Column(name = "different_location")
    private Boolean differentLocation;
    
    @JsonView(JsonViews.Detail.class)
    @NotNull(message = "{errors.required}")
    private Boolean visibility;
    
    @JsonView(JsonViews.Summary.class)
    @Column(name = "expected_person")
    private Integer expectedPerson;
    
    @NotNull(message = "{errors.required}")
    @Size(max = 200, message = "{errors.range}")
    @JsonView(JsonViews.Summary.class)
    private String description;
    
    @JsonView(JsonViews.Summary.class)
    @ManyToOne
    private Company company;
    
    public Event() {
        /* default constructor: required by JPA */
    }
    
    public Event( Long id, String name, String logo, LocalDate date, LocalDateTime start, LocalDateTime end, Boolean differentLocation, Boolean visibility, Integer expectedPerson, String description, Company company ) {
        this.id = id;
        this.name = name;
        this.logo = logo;
        this.date = date;
        this.start = start;
        this.end = end;
        this.differentLocation = differentLocation;
        this.visibility = visibility;
        this.expectedPerson = expectedPerson;
        this.description = description;
        this.company = company;
    }
    
    public Event( String name, String logo, LocalDate date, LocalDateTime start, LocalDateTime end, Boolean differentLocation, Boolean visibility, Integer expectedPerson, String description, Company company ) {
        this( null, name, logo, date, start, end, differentLocation, visibility, expectedPerson, description,
                company );
    }
    
    @PrePersist
    protected void prePersist() {
        this.dateCreated = LocalDateTime.now();
    }
}
