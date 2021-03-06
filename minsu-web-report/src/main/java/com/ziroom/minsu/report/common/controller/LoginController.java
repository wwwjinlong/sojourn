/*
 * Copyright (c) 2016. Copyright (c) 2016. ziroom.com.
 */
package com.ziroom.minsu.report.common.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * <p>登录controller</p>
 * 
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 * 
 * @author bushujie
 * @since 1.0
 * @version 1.0
 */
@Controller
@RequestMapping("/")
public class LoginController {

    @Value("#{'${minsu.static.resource.url}'.trim()}")
    private String staticResourceUrl;
    
    @Value("#{'${report.web.logout.url}'.trim()}")
    private String logoutUrl;

    @RequestMapping(value = "/login")
    public String userLogin(HttpServletRequest request, Model model) {
        HttpSession session = request.getSession();
        session.setAttribute("staticResourceUrl", staticResourceUrl);
        model.addAttribute("staticResourceUrl", staticResourceUrl);
        return "login/login";
    }
    
    @RequestMapping(value = "/logout")
    public String userLogout(HttpServletRequest request) {
        return "redirect:" + logoutUrl;
    }
    
    @RequestMapping(value = "/error")
    public String redirectError(HttpServletRequest request) {
    	request.getSession().invalidate();
    	return "error/error";
    }
    
    @RequestMapping(value="/noAuthority")
    public String redirect403Error(HttpServletRequest request){
    	return "error/403";
    }
}
