package com.uniamerica.avaliation.model;

import javax.persistence.*;

@Entity
@Table(name="brands")

public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String name;

    public Brand() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Brand(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
