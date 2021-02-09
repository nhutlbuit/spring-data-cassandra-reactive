package com.translate.cassandra.model;

import com.datastax.driver.core.DataType;
import lombok.Data;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.util.List;

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

    @CassandraType(type= DataType.Name.LIST,typeArguments = { DataType.Name.UDT }, userTypeName = "version_content")
    @Column(value = "version_content")
    private List<VersionContent> versionContent;


}
