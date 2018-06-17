/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heroku.web.servlet.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell
 */
@WebServlet(name = "dashboard",urlPatterns ={"/admin","/admin/dashboard"})

public class DashboardServlet extends HttpServlet{
     @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("title", "Dashboard");
        request.getRequestDispatcher("/WEB-INF/views/admin/dashboard/index.jsp")
                .forward(request, response);
    }
}
