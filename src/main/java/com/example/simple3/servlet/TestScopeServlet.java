package com.example.simple3.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "TestScopeServlet", value = "/TestScopeServlet")
public class TestScopeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("rc", "This is Request Scope");

        ServletContext servletContext = getServletContext();

        servletContext.setAttribute("ac","This is Application Scope");
        HttpSession session = request.getSession();
        session.setAttribute("sc","This is Session Scope");

        servletContext.getRequestDispatcher("/test_scope.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
