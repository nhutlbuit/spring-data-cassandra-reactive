package com.translate.cassandra.repository;

import com.translate.cassandra.model.Translate;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;

@Repository
@Transactional
public interface TranslateRepository extends ReactiveCrudRepository<Translate, Translate> {

    @Query("select * from translate where solr_query='-{!tuple}version_content.content:*'")
    Flux<Translate> findByVersionContentNotContains(final String keyword);

}
