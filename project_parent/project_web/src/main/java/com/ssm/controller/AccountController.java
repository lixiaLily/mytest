package com.ssm.controller;

import com.ssm.entity.Account;
import com.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/success")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("findAll.do")
    public ModelAndView findAll(){
        List<Account> all = accountService.findAll();
        ModelAndView mv=new ModelAndView();
        mv.setViewName("list");
        mv.addObject("list",all);
        return mv;
    }
}
