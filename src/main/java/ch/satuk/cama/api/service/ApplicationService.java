package ch.satuk.cama.api.service;

import ch.satuk.cama.api.entity.Application;

import java.util.List;

/**
 * Created by satuk on 05.07.17.
 */

public interface ApplicationService {
    
    List<Application> findApplicationsByUser_Id( Long id );
    
}
