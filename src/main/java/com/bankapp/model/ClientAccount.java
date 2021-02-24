package com.bankapp.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "CLIENT_ACCOUNT", schema = "PUBLIC", catalog = "TESTDB")
public class ClientAccount {
    @Id
    @GeneratedValue
    private Long id;
    @Id
    @Column(name = "CLIENT_ACCOUNT_NUMBER", nullable = false, length = 10)
    private String clientAccountNumber;

    @Basic
    @Column(name = "DISPLAY_BALANCE", nullable = true, precision = 3)
    private BigDecimal displayBalance;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getClientAccountNumber() {
        return clientAccountNumber;
    }

    public void setClientAccountNumber(String clientAccountNumber) {
        this.clientAccountNumber = clientAccountNumber;
    }

    public BigDecimal getDisplayBalance() {
        return displayBalance;
    }

    public void setDisplayBalance(BigDecimal displayBalance) {
        this.displayBalance = displayBalance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientAccount that = (ClientAccount) o;
        return Objects.equals(clientAccountNumber, that.clientAccountNumber) && Objects.equals(displayBalance, that.displayBalance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientAccountNumber, displayBalance);
    }
}
