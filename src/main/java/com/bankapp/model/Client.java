package com.bankapp.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "CLIENT", schema = "PUBLIC", catalog = "TESTDB")
public class Client {
    @Id
    @GeneratedValue
    private Long id;
    @Id
    @Column(name = "CLIENT_ID", nullable = false)
    private int clientId;
    @Basic
    @Column(name = "TITLE", nullable = true, length = 10)
    private String title;
    @Basic
    @Column(name = "NAME", nullable = false, length = 255)
    private String name;
    @Basic
    @Column(name = "SURNAME", nullable = true, length = 100)
    private String surname;
    @Basic
    @Column(name = "DOB", nullable = false)
    private Date dob;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return clientId == client.clientId && Objects.equals(title, client.title) && Objects.equals(name, client.name) && Objects.equals(surname, client.surname) && Objects.equals(dob, client.dob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, title, name, surname, dob);
    }
}
