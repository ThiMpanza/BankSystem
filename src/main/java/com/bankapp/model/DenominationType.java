package com.bankapp.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "DENOMINATION_TYPE", schema = "PUBLIC", catalog = "TESTDB")
public class DenominationType {
    private Long id;
    private String denominationTypeCode;
    private String description;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "DENOMINATION_TYPE_CODE", nullable = false, length = 1)
    public String getDenominationTypeCode() {
        return denominationTypeCode;
    }

    public void setDenominationTypeCode(String denominationTypeCode) {
        this.denominationTypeCode = denominationTypeCode;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = false, length = 255)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DenominationType that = (DenominationType) o;
        return Objects.equals(denominationTypeCode, that.denominationTypeCode) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(denominationTypeCode, description);
    }
}
