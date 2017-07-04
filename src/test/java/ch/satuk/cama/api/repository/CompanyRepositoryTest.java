package ch.satuk.cama.api.repository;

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

/**
 * Created by satuk on 03.07.17.
 */

@Transactional
@RunWith(SpringRunner.class)
@Sql("/test-data.sql")
@SpringBootTest
public class CompanyRepositoryTest {
    
    @Autowired
    CompanyRepository repository;
    
    
    @Test
    public void findById() {
        Company company = repository.findById( 1L );
        assertThat( company.getId() ).isEqualTo( 1 );
    }
    
    @Test
    public void findByNameIgnoreCaseContaining() {
        Company company = repository.findById( 1L );
        int companyNameHalf = company.getName().length() / 2;
        String companyNameBig = company.getName().toUpperCase();
        
        assertThat( repository.findByNameIgnoreCaseContaining( companyNameBig.substring( 0, companyNameHalf ) ) ).isEqualTo( Arrays.asList( company ) );
    }
    
}
