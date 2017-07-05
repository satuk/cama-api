package ch.satuk.cama.api.entity;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by satuk on 05.07.17.
 */

@Entity
@Table(name = "applications")
@Data
@EqualsAndHashCode(exclude = "id")
@ToString
public class Application implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @JsonView(JsonViews.Summary.class)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @JsonView(JsonViews.Summary.class)
    @Column(name = "date_created", updatable = false, nullable = false)
    private LocalDateTime dateCreated = LocalDateTime.now();
    
    @NotNull(message = "{errors.required}")
    @JsonView(JsonViews.Detail.class)
    // what is by removing?? its ok with CascadeType.all
    @JoinColumn(name = "event_id")
    @OneToOne(cascade = CascadeType.ALL)
    private Event event;
    
    @NotNull(message = "{errors.required}")
    // what is by removing?? its ok with CascadeType.all
    @JoinColumn(name = "user_id")
    @OneToOne(cascade = CascadeType.ALL)
    private User user;
    
    
    public Application() {
        /* default constructor: required by JPA */
    }
    
    public Application( Long id, LocalDateTime dateCreated, Event event, User user ) {
        this.id = id;
        this.dateCreated = dateCreated;
        this.event = event;
        this.user = user;
    }
    
    public Application( LocalDateTime dateCreated, Event event, User user ) {
        this(null, dateCreated, event, user);
    }
    
    @PrePersist
    protected void prePersist() {
        this.dateCreated = LocalDateTime.now();
    }
}
