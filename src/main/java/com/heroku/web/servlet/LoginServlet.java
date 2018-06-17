/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heroku.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Dell
 */
@WebServlet(name = "login", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/views/login.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        String userName = request.getParameter("username");
        String passWord = request.getParameter("password");

        if (userName.equals("admin") && passWord.equals("admin")) {
            HttpSession session = request.getSession(true);
            session.setAttribute("user", true);
            response.sendRedirect(request.getContextPath() + "/admin/dashboard");
            System.out.println("matched***************************************************************************");
        } else {
            response.sendRedirect(request.getContextPath() + "/login?error");

        }
    }

}
