package ch.satuk.cama.api.service;

import ch.satuk.cama.api.entity.Company;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

/**
 * Created by satuk on 03.07.17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = NONE)
@Transactional
@Sql("/test-data.sql")
public class CompanyServiceTest {
    
    @Autowired
    CompanyService service;
    
    @Test
    public void findAll() {
        assertThat( service.findAll().size() ).isEqualTo( 1 );
    }
    
    @Test
    public void findById() {
        Company company = service.findById( 1L );
        assertThat( company.getId() ).isEqualTo( 1 );
    }
    
    @Test
    public void findByIdIgnoreCaseConstaining() {
        Company company = service.findById( 1L );
        String companyNameToUpperCase = company.getName().toUpperCase();
        
        assertThat( service.findByIdIgnoreCaseContaining( company.getName() ) ).isEqualTo( Arrays.asList( company ) );
        assertThat( service.findByIdIgnoreCaseContaining( company.getName().substring( 0, company.getName().length() / 2 ) ) ).isEqualTo( Arrays.asList( company ) );
    }
}
