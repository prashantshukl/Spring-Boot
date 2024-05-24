package com.prashant.aopdemo.dao;


import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO{

    @Override
    public void addAccount() {
        System.out.println(getClass() + "Doing Some DB Stuff  ");
    }
}
