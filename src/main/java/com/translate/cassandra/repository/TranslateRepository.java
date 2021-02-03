package com.translate.cassandra.repository;

import com.translate.cassandra.model.Translate;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TranslateRepository extends ReactiveCrudRepository<Translate, Translate> {

}
