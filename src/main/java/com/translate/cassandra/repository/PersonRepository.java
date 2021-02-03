package com.translate.cassandra.repository;

import com.translate.cassandra.model.PersonKey;
import com.translate.cassandra.model.Person;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PersonRepository extends ReactiveCrudRepository<Person, PersonKey> {

  List<Person> findByKeyFirstName(final String firstName);

  List<Person> findByKeyFirstNameAndKeyDateOfBirthGreaterThan(
      final String firstName, final LocalDateTime dateOfBirth);

  @Query(allowFiltering = true)
  List<Person> findByLastName(final String lastName);

  // Flux<Person> findAll();
}
