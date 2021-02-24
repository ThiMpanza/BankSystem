package com.bankapp.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ACCOUNT_TYPE", schema = "PUBLIC", catalog = "TESTDB")
public class AccountType {
    private Long id;
    private String accountTypeCode;
    private String description;
    private Object transactional;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "ACCOUNT_TYPE_CODE", nullable = false, length = 10)
    public String getAccountTypeCode() {
        return accountTypeCode;
    }

    public void setAccountTypeCode(String accountTypeCode) {
        this.accountTypeCode = accountTypeCode;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = false, length = 50)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "TRANSACTIONAL", nullable = true)
    public Object getTransactional() {
        return transactional;
    }

    public void setTransactional(Object transactional) {
        this.transactional = transactional;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountType that = (AccountType) o;
        return Objects.equals(accountTypeCode, that.accountTypeCode) && Objects.equals(description, that.description) && Objects.equals(transactional, that.transactional);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountTypeCode, description, transactional);
    }
}
