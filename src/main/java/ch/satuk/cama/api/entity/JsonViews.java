package ch.satuk.cama.api.entity;

import com.fasterxml.jackson.annotation.JsonView;

/**
 * Created by satuk on 03.07.17.
 * Views for use with {@link JsonView @JsonView}.
 */
public interface JsonViews {
    
    interface Summary {
    
    }
    
    interface Detail extends Summary {
    
    }
}
