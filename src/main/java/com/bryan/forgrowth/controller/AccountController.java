package com.bryan.forgrowth.controller;

import com.bryan.forgrowth.controller.facade.AccountFacade;
import com.bryan.forgrowth.controller.request.InsertAccountRequest;
import com.bryan.forgrowth.controller.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {
    AccountFacade accountFacade;

    @Autowired
    public void setAccountFacade(AccountFacade accountFacade) {
        this.accountFacade = accountFacade;
    }

    @RequestMapping(value = "/account/insert",method = RequestMethod.POST)
    public ResponseEntity<Result> insertAccount(@RequestBody InsertAccountRequest param){
        accountFacade.addingNewAccount(param);

        Result result = new Result();
        result.setMessage("success");
        result.setSuccess(true);
        result.setObject(param);
        System.out.println("test"+param);
        ResponseEntity<Result> responseEntity = new ResponseEntity<Result>(result,HttpStatus.ACCEPTED);
        return responseEntity;
    }
}
