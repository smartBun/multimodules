package com.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "testtable")
public class TestTable implements Serializable{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "value")
    private String value;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
