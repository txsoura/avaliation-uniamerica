package com.uniamerica.avaliation.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="models")

public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String name, version;

    @OneToOne
    private Brand brand;

    public Model() {
    }

    public Model(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
