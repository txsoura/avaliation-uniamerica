package com.uniamerica.avaliation.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="brands")

public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String name;

    @OneToMany
    private List<Model> models;

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

    public List<Model> getModels() {
        return models;
    }

    public void setModels(List<Model> models) {
        this.models = models;
    }
}
