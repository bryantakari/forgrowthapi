package com.bryan.forgrowth.model.jpa;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "\"Account\"")
@Entity(name = "\"Account\"")
public class Account {
    @Id
    private String id;

    private String email;

    private String password;

    @Column(name = "\"phoneNumber\"")
    private String phoneNumber;

    @Column(name = "\"gmtCreated\"")
    private LocalDate gmtCreated;

    @Column(name = "\"gmtUpdated\"")
    private LocalDate gmtUpdated;

    public LocalDate getGmtUpdated() {
        return gmtUpdated;
    }

    public void setGmtUpdated(LocalDate gmtUpdated) {
        this.gmtUpdated = gmtUpdated;
    }

    public LocalDate getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(LocalDate gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(String id) {
        this.id = id;
    }
}
