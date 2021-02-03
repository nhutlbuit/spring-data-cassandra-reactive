package com.translate.cassandra.model;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;

import static org.springframework.data.cassandra.core.cql.PrimaryKeyType.PARTITIONED;

@Data
@Table("translate")
public class Translate implements Serializable {

    @PrimaryKeyColumn(name = "base_text", type = PARTITIONED)
    private String baseText;

    @Column
    private String category;

    @Column
    private String lang;

    @Column("sub_category")
    private String subCategory;

    @Column
    private String content;

    @Column
    private Integer version;


}
