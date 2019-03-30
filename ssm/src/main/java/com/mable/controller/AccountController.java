package com.mable.controller;

import com.mable.domain.Account;
import com.mable.service.AccountService;
import org.junit.runner.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 账户web层控制器
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层查询所有执行");
        //调用业务层方法
         List<Account>list = accountService.findAll();
         model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/saveAccount")
    public void saveAccount(Account account, HttpServletRequest request,HttpServletResponse response)throws Exception{
        accountService.saveAccount(account);
        //重定向到findAll方法
        response.sendRedirect(request.getContextPath()+"/account/findAll");
            return ;
    }

}
