package com.dao;

import com.entities.TestTable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TestTableRepository extends CrudRepository<TestTable, Long> {

    List<TestTable> findAll();

    TestTable findOne(Long id);

    @Query("select t from TestTable t where t.value=:value")
    List<TestTable> findDataByValue(@Param("value") String value);
}
