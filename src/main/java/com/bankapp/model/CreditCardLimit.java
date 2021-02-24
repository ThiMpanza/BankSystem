package com.bankapp.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "CREDIT_CARD_LIMIT", schema = "PUBLIC", catalog = "TESTDB")
public class CreditCardLimit {
    private Long id;
    private String clientAccountNumber;
    private BigDecimal accountLimit;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "CLIENT_ACCOUNT_NUMBER", nullable = false, length = 10)
    public String getClientAccountNumber() {
        return clientAccountNumber;
    }

    public void setClientAccountNumber(String clientAccountNumber) {
        this.clientAccountNumber = clientAccountNumber;
    }

    @Basic
    @Column(name = "ACCOUNT_LIMIT", nullable = false, precision = 3)
    public BigDecimal getAccountLimit() {
        return accountLimit;
    }

    public void setAccountLimit(BigDecimal accountLimit) {
        this.accountLimit = accountLimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCardLimit that = (CreditCardLimit) o;
        return Objects.equals(clientAccountNumber, that.clientAccountNumber) && Objects.equals(accountLimit, that.accountLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientAccountNumber, accountLimit);
    }
}
