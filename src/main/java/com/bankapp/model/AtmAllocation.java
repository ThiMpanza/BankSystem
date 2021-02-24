package com.bankapp.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ATM_ALLOCATION", schema = "PUBLIC", catalog = "TESTDB")
public class AtmAllocation {
    private Long id;
    private int atmAllocationId;
    private int count;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "ATM_ALLOCATION_ID", nullable = false)
    public int getAtmAllocationId() {
        return atmAllocationId;
    }

    public void setAtmAllocationId(int atmAllocationId) {
        this.atmAllocationId = atmAllocationId;
    }

    @Basic
    @Column(name = "COUNT", nullable = false)
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AtmAllocation that = (AtmAllocation) o;
        return atmAllocationId == that.atmAllocationId && count == that.count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(atmAllocationId, count);
    }
}
