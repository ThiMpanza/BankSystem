package com.bankapp.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "CLIENT_SUB_TYPE", schema = "PUBLIC", catalog = "TESTDB")
public class ClientSubType {
    @Id
    @GeneratedValue
    private Long id;
    @Id
    @Column(name = "CLIENT_SUB_TYPE_CODE", nullable = false, length = 4)
    private String clientSubTypeCode;
    @Basic
    @Column(name = "DESCRIPTION", nullable = false, length = 255)
    private String description;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getClientSubTypeCode() {
        return clientSubTypeCode;
    }

    public void setClientSubTypeCode(String clientSubTypeCode) {
        this.clientSubTypeCode = clientSubTypeCode;
    }


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
        ClientSubType that = (ClientSubType) o;
        return Objects.equals(clientSubTypeCode, that.clientSubTypeCode) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientSubTypeCode, description);
    }
}
