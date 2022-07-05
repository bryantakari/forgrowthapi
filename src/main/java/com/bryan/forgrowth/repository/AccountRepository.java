package com.bryan.forgrowth.repository;


import com.bryan.forgrowth.model.jpa.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account,String> {



}
