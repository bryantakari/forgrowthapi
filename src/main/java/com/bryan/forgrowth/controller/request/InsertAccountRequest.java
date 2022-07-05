package com.bryan.forgrowth.controller.request;

import com.bryan.forgrowth.model.jpa.Account;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.time.LocalDate;

public class InsertAccountRequest implements Serializable {
    private static final long serialVersionUID = 1296745294130419707L;

    @JsonProperty(value = "email")
    private String email;
    @JsonProperty(value = "password")
    private String password;
    @JsonProperty(value = "phoneNumber")
    private String phoneNumber;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

