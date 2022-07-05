package com.bryan.forgrowth.controller.facade;

import com.bryan.forgrowth.controller.request.InsertAccountRequest;
import org.hibernate.sql.Insert;

import java.io.Serializable;

public interface AccountFacade {
    public void addingNewAccount(InsertAccountRequest request);
}
