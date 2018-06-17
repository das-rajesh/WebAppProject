/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heroku.web.listner;

import java.util.Date;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Dell
 */
public class AcessLogListener implements ServletRequestListener{

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        HttpServletRequest request=(HttpServletRequest)sre.getServletRequest();
        System.out.println("URL: "+request.getRequestURI());
        System.out.println("Access Date : " + new Date());
        System.out.println("Acess Method: "+request.getMethod());
        System.out.println("User Agent: "+request.getHeader("User Agent"));
        
    }
    
}
