package com.bankapp.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Currency {
    private Long id;
    private String currencyCode;
    private int decimalPlaces;
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
    @Column(name = "CURRENCY_CODE", nullable = false, length = 3)
    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @Basic
    @Column(name = "DECIMAL_PLACES", nullable = false)
    public int getDecimalPlaces() {
        return decimalPlaces;
    }

    public void setDecimalPlaces(int decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
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
        Currency currency = (Currency) o;
        return decimalPlaces == currency.decimalPlaces && Objects.equals(currencyCode, currency.currencyCode) && Objects.equals(description, currency.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currencyCode, decimalPlaces, description);
    }
}
