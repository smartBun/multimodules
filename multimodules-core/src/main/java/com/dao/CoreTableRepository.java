package com.dao;

import com.entities.CoreTable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CoreTableRepository extends CrudRepository<CoreTable, Long> {

    List<CoreTable> findAll();

    CoreTable findOne(Long id);

    @Query("select t from CoreTable t where t.value=:value")
    List<CoreTable> findDataByValue(@Param("value") String value);
}
