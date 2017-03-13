package com.leonlu.code.sample.webapp.ws.repository;


import com.leonlu.code.sample.webapp.ws.entity.Entity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface IEntityRepository extends ElasticsearchRepository<Entity, String> {
}
