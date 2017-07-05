package ch.satuk.cama.api.service;

import ch.satuk.cama.api.entity.Work;

import java.util.List;

/**
 * Created by satuk on 05.07.17.
 */

public interface WorkService {
    
    List<Work> findWorksByUser_Id( Long id );
    
}
