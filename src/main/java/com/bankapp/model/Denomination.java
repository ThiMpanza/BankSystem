package com.bankapp.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;

@Entity
public class Denomination {
    private Long id;
    private int denominationId;
    private BigInteger value;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "DENOMINATION_ID", nullable = false)
    public int getDenominationId() {
        return denominationId;
    }

    public void setDenominationId(int denominationId) {
        this.denominationId = denominationId;
    }

    @Basic
    @Column(name = "VALUE", nullable = false, precision = 0)
    public BigInteger getValue() {
        return value;
    }

    public void setValue(BigInteger value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Denomination that = (Denomination) o;
        return denominationId == that.denominationId && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(denominationId, value);
    }
}
