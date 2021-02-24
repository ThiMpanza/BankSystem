package com.bankapp.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "CURRENCY_CONVERSION_RATE", schema = "PUBLIC", catalog = "TESTDB")
public class CurrencyConversionRate {
    @Id
    @GeneratedValue
    private Long id;
    @Id
    @Column(name = "CURRENCY_CODE", nullable = false, length = 3)
    private String currencyCode;
    private String conversionIndicator;
    private BigDecimal rate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @Basic
    @Column(name = "CONVERSION_INDICATOR", nullable = false, length = 1)
    public String getConversionIndicator() {
        return conversionIndicator;
    }

    public void setConversionIndicator(String conversionIndicator) {
        this.conversionIndicator = conversionIndicator;
    }

    @Basic
    @Column(name = "RATE", nullable = false, precision = 8)
    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrencyConversionRate that = (CurrencyConversionRate) o;
        return Objects.equals(currencyCode, that.currencyCode) && Objects.equals(conversionIndicator, that.conversionIndicator) && Objects.equals(rate, that.rate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currencyCode, conversionIndicator, rate);
    }
}
