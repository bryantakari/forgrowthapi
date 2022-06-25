package com.bryan.forgrowth.controller;

import com.bryan.forgrowth.model.dto.AccountDTO;
import com.sun.deploy.net.HttpResponse;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Date;

@RestController
public class IdentityController {

    @RequestMapping(value = "/identity/myidentity",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<AccountDTO> myIdentity(){

        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setId(new Timestamp(System.currentTimeMillis()).getTime()+"_Account");
        accountDTO.setGmtCreated(new Date());
        accountDTO.setGmtUpdated(new Date());
        accountDTO.setEmail("account1@gmail.com");
        accountDTO.setPassword("password123");
        accountDTO.setUsername("account1");
        ResponseEntity<AccountDTO> responseEntity = new ResponseEntity<AccountDTO>(accountDTO,HttpStatus.FORBIDDEN);
        return responseEntity;
    }
}
