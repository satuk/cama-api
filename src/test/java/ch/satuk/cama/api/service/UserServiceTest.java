package ch.satuk.cama.api.service;

import ch.satuk.cama.api.entity.Company;
import ch.satuk.cama.api.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by satuk on 06.07.17.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Sql("/test-data.sql")
public class UserServiceTest {
    
    @Autowired
    UserService userService;
    
    @Autowired
    CompanyService companyService;
    
    @Test
    public void addCompany() {
        User user = this.userService.findById( 1L );
        Company company2 = this.companyService.findById( 2L );
        
        assertThat( user.getCompanies().size() ).isEqualTo( 1 );
        
        user.addCompany( company2 );
        assertThat( user.getCompanies().size() ).isEqualTo( 2 );
    }
}
