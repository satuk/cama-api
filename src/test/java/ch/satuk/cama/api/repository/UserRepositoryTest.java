package ch.satuk.cama.api.repository;

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
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

/**
 * Created by satuk on 06.07.17.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = NONE)
@Transactional
@Sql("/test-data.sql")
public class UserRepositoryTest {
    
    @Autowired
    UserRepository userRepository;
    
    @Autowired
    CompanyRepository companyRepository;
    
    @Test
    public void addCompany() {
        User user = this.userRepository.findById( 1L );
        Company company2 = this.companyRepository.findById( 2L );
        
        assertThat( this.userRepository.findAll().get( 0 ).getCompanies().size() ).isEqualTo( 1 );

//        user.addCompany( company2 );
        this.userRepository.findById( user.getId() ).addCompany( company2 );
        
        assertThat( this.userRepository.findAll().get( 0 ).getCompanies().size() ).isEqualTo( 2 );
    }
}
