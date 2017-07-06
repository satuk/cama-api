package ch.satuk.cama.api.service;

import ch.satuk.cama.api.entity.Application;
import ch.satuk.cama.api.entity.Event;
import ch.satuk.cama.api.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

/**
 * Created by satuk on 06.07.17.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = NONE)
@Transactional
@Sql("/test-data.sql")
public class ApplicationServiceTest {
    
    @Autowired
    ApplicationService applicationService;
    
    @Autowired
    EventService eventService;
    
    @Autowired
    UserService userService;
    
    @Test
    public void findApplicationByEvent_IdAndUser_Id() {
        
        Event event = this.eventService.findById( 1L );
        User user = this.userService.findById( 1L );
        Application application = this.applicationService.findById( 1L );
        
        assertThat( this.applicationService.findApplicationByEvent_IdAndUser_Id( event.getId(), user.getId() ) ).isEqualTo( application );
        assertThat( this.applicationService.findAll().size() ).isEqualTo( 1 );
        
        this.applicationService.deleteById( application.getId() );
        assertThat( this.applicationService.findAll().size() ).isEqualTo( 0 );
    }
    
}
