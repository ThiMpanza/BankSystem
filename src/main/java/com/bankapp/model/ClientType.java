package com.bankapp.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "CLIENT_TYPE", schema = "PUBLIC", catalog = "TESTDB")
public class ClientType {
    private Long id;
    private String clientTypeCode;
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
    @Column(name = "CLIENT_TYPE_CODE", nullable = false, length = 2)
    public String getClientTypeCode() {
        return clientTypeCode;
    }

    public void setClientTypeCode(String clientTypeCode) {
        this.clientTypeCode = clientTypeCode;
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
        ClientType that = (ClientType) o;
        return Objects.equals(clientTypeCode, that.clientTypeCode) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientTypeCode, description);
    }
}
