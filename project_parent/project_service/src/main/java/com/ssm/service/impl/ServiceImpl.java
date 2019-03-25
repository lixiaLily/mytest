package com.ssm.service.impl;

import com.ssm.dao.AccountDao;
import com.ssm.entity.Account;
import com.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ServiceImpl implements AccountService{
    @Autowired
    private AccountDao accountDao;

    public List<Account> findAll() {
        return accountDao.findAll();
    }
}
