package ch.satuk.cama.api.service;

import ch.satuk.cama.api.entity.Application;

import java.util.List;

/**
 * Created by satuk on 05.07.17.
 */

public interface ApplicationService {
    
    Application findById( Long id );
    
    void deleteById( Long id );
    
    void save( Application application );
    
    List<Application> findAll();
    
    Application findApplicationByEvent_IdAndUser_Id( Long event_id, Long user_id );
    
    List<Application> findApplicationsByUser_Id( Long id );
    
    List<Application> findApplicationsByEvent_Id( Long id );
}
