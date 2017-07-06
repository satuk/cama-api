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
@Table(name = "works")
@Data
@ToString
@EqualsAndHashCode(exclude = "id")
public class Work implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonView(JsonViews.Summary.class)
    private Long id;
    
    @JsonView(JsonViews.Summary.class)
    @Column(name = "date_created", updatable = false, nullable = false)
    private LocalDateTime dateCreated = LocalDateTime.now();
    
    @NotNull(message = "{errors.required}")
    @JsonView(JsonViews.Detail.class)
    @JoinColumn(name = "event_id")
    @OneToOne(cascade = CascadeType.ALL)
    private Event event;
    
    @NotNull(message = "{errors.required}")
    @JoinColumn(name = "user_id")
    @OneToOne(cascade = CascadeType.ALL)
    private User user;
    
    
    public Work() {
        /* default constructor: required by JPA */
    }
    
    public Work( Long id, LocalDateTime dateCreated, Event event, User user ) {
        this.id = id;
        this.dateCreated = dateCreated;
        this.event = event;
        this.user = user;
    }
    
    public Work( LocalDateTime dateCreated, Event event, User user ) {
        this( null, dateCreated, event, user );
    }
    
    public Work( Event event, User user ) {
        this( null, event, user );
    }
    
    @PrePersist
    protected void prePersist() {
        this.dateCreated = LocalDateTime.now();
    }
}
