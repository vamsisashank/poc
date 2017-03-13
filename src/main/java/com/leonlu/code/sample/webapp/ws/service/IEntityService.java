package com.leonlu.code.sample.webapp.ws.service;

/**
 * Created by vkotagiri on 3/12/17.
 */

import java.util.Map;
import com.leonlu.code.sample.webapp.ws.entity.Entity;
import org.springframework.data.domain.Page;

public interface IEntityService {

    long count();

    Entity create(Entity resource);

    Page<Entity> findAll();

    void delete(String id);

    Page<Entity> findAllPaginatedAndSorted(int page, int size, String sortBy, String sortOrder);

    Page<Entity> search(int page, int size, String sortBy, String sortOrder, Map<String, String[]> filters);

    void update(String id, Entity resource);

    Entity findOne(String id);
}
