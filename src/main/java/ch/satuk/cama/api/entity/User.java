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
@Table(name = "users")
@Data
@EqualsAndHashCode(exclude = "id")
@ToString(exclude = "password")
public class User implements Serializable {
    
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
    @Size(max = 30, message = "{errors.range}")
    @Column(name = "first_name")
    private String firstName;
    
    @JsonView(JsonViews.Summary.class)
    @NotNull(message = "{errors.required}")
    @Size(max = 30, message = "{errors.range}")
    @Column(name = "last_name")
    private String lastName;
    
    @JsonView(JsonViews.Detail.class)
    // BCrypt encoded passwords can need 50-76 characters.
    @NotNull(message = "{errors.required}")
    @Size(max = 76, message = "{errors.range}")
    private String password;
    
    @JsonView(JsonViews.Detail.class)
    @NotNull(message = "{errors.required}")
    @Size(max = 200, message = "{errors.range}")
    @Column(unique = true)
    private String email;
    
    @JsonView(JsonViews.Detail.class)
    @NotNull(message = "{errors.required}")
    @Size(max = 200, message = "{errors.range}")
    private String address;
    
    @JsonView(JsonViews.Summary.class)
    @NotNull(message = "{errors.required}")
    @Size(max = 30, message = "{errors.range}")
    private Integer age;
    
    @JsonView(JsonViews.Detail.class)
    @NotNull(message = "{errors.required}")
    @Size(min = 4, max = 4, message = "{errors.range}")
    @Column(name = "postal_code")
    private Integer postalCode;
    
    @JsonView(JsonViews.Summary.class)
    @NotNull(message = "{errors.required}")
    @Size(max = 30, message = "{errors.range}")
    private String city;
    
    @JsonView(JsonViews.Detail.class)
    @NotNull(message = "{errors.required}")
    @Column(name = "handy_number")
    @Size(min = 10, max = 14, message = "{errors.range}")
    private Long handyNumber;
    
    @JsonView(JsonViews.Detail.class)
    @ManyToMany
    private List<Company> companies = new ArrayList<>();
    
    public User() {
        /* default constructor: required by JPA */
    }
    
    public User( Long id, String firstName, String lastName, String password, String email, String address, Integer age, Integer postalCode, String city, Long handyNumber ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.address = address;
        this.age = age;
        this.postalCode = postalCode;
        this.city = city;
        this.handyNumber = handyNumber;
    }
    
    public User( String firstName, String lastName, String password, String email, String address, Integer age, Integer postalCode, String city, Long handyNumber ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.address = address;
        this.age = age;
        this.postalCode = postalCode;
        this.city = city;
        this.handyNumber = handyNumber;
    }
    
    public void addCompany( Company company ) {
        this.companies.add( company );
    }
    
    @PrePersist
    protected void prePersist() {
        this.dateCreated = LocalDateTime.now();
    }
}
