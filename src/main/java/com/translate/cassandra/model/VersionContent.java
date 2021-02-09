package com.translate.cassandra.model;

import com.datastax.driver.core.DataType;
import lombok.Data;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import java.io.Serializable;

@Data
@UserDefinedType(value="version_content")
public class VersionContent implements Serializable {

    @Column
    @CassandraType(type = DataType.Name.TEXT)
    private String content;

    @CassandraType(type = DataType.Name.INT)
    private int version;

}
