package ch.satuk.cama.api.entity;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by satuk on 03.07.17.
 */

@Entity
@Table(name = "companies")
@Data
@EqualsAndHashCode(exclude = "id")
@ToString
public class Company implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @JsonView(JsonViews.Summary.class)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @JsonView(JsonViews.Summary.class)
    @Column(name = "date_created", updatable = false, nullable = false)
    private LocalDateTime dateCreated = LocalDateTime.now();
    
    @JsonView(JsonViews.Summary.class)
    @NotNull(message = "{errors.required}")
    @Size(max = 50, message = "{errors.range}")
    private String name;
    
    @JsonView(JsonViews.Summary.class)
    @NotNull(message = "{errors.required}")
    @Size(max = 200, message = "{errors.range}")
    private String address;
    
    @JsonView(JsonViews.Summary.class)
    @NotNull(message = "{errors.required}")
    @Size(min = 4, max = 4, message = "{errors.range}")
    @Column(name = "postal_code")
    private Integer postalCode;
    
    @JsonView(JsonViews.Detail.class)
    @Size(max = 200, message = "{errors.range}")
    private String description;
    
    @JsonView(JsonViews.Summary.class)
    @Size(max = 200, message = "{errors.range}")
    private String url;
    
    public Company() {
        /* default constructor: required by JPA */
    }
    
    public Company( Long id, String name, String address, Integer postalCode, String description, String url ) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.postalCode = postalCode;
        this.description = description;
        this.url = url;
    }
    
    public Company( String name, String address, Integer postalCode, String description, String url ) {
        this( null, name, address, postalCode, description, url );
    }
    
    @PrePersist
    protected void prePersist() {
        this.dateCreated = LocalDateTime.now();
    }
    
}
