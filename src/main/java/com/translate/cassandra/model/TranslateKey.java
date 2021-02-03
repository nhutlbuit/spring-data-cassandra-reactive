package com.translate.cassandra.model;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import java.io.Serializable;
import java.util.UUID;

import static org.springframework.data.cassandra.core.cql.Ordering.DESCENDING;
import static org.springframework.data.cassandra.core.cql.PrimaryKeyType.PARTITIONED;

@Data
@PrimaryKeyClass
public class TranslateKey implements Serializable {

  @PrimaryKeyColumn(name = "base_text", type = PARTITIONED)
  private String baseText;


  @PrimaryKeyColumn(name = "translate_id", ordinal = 1, ordering = DESCENDING)
  private UUID id;


}
