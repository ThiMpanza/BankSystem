package com.bankapp.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Atm {
    private Long id;
    private int atmId;
    private String name;
    private String location;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "ATM_ID", nullable = false)
    public int getAtmId() {
        return atmId;
    }

    public void setAtmId(int atmId) {
        this.atmId = atmId;
    }

    @Basic
    @Column(name = "NAME", nullable = false, length = 10)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "LOCATION", nullable = false, length = 255)
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Atm atm = (Atm) o;
        return atmId == atm.atmId && Objects.equals(name, atm.name) && Objects.equals(location, atm.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(atmId, name, location);
    }
}
