package ch.satuk.cama.api.service;

import ch.satuk.cama.api.entity.Application;
import ch.satuk.cama.api.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by satuk on 05.07.17.
 */

@Service
@Transactional(readOnly = true)
public class DefaultApplicationService implements ApplicationService {
    
    private final ApplicationRepository applicationRepository;
    
    
    @Autowired
    public DefaultApplicationService( ApplicationRepository applicationRepository ) {
        this.applicationRepository = applicationRepository;
    }
    
    @Override
    public List<Application> findApplicationsByUser_Id( Long id ) {
        return this.applicationRepository.findApplicationsByUser_Id( id );
    }
    
    @Override
    public List<Application> findApplicationsByEvent_Id( Long id ) {
        return this.applicationRepository.findApplicationsByEvent_Id( id );
    }
    
    @Override
    public Application findById( Long id ) {
        return this.applicationRepository.findById( id );
    }
    
    @Override
    public void deleteById( Long id ) {
        this.applicationRepository.delete( id );
    }
    
    @Override
    public void save( Application application ) {
        this.applicationRepository.save( application );
    }
    
    @Override
    public List<Application> findAll() {
        return this.applicationRepository.findAll();
    }
    
    @Override
    public Application findApplicationByEvent_IdAndUser_Id( Long event_id, Long user_id ) {
        return this.applicationRepository.findApplicationByEvent_IdAndUser_Id( event_id, user_id );
    }
}
