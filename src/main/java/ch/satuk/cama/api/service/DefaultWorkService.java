package ch.satuk.cama.api.service;

import ch.satuk.cama.api.entity.User;
import ch.satuk.cama.api.entity.Work;
import ch.satuk.cama.api.repository.WorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by satuk on 05.07.17.
 */

@Service
@Transactional(readOnly = true)
public class DefaultWorkService implements WorkService {
    
    private final WorkRepository repository;
    
    
    @Autowired
    public DefaultWorkService( WorkRepository repository ) {
        this.repository = repository;
    }
    
    @Override
    public List<Work> findWorksByUser_Id( Long id ) {
        return this.repository.findWorksByUser_Id( id );
    }
    
    @Override
    public Work save( Work work ) {
        return this.repository.saveAndFlush( work );
    }
    
    @Override
    public Work findById( Long id ) {
        return this.repository.findById( id );
    }
    
}
