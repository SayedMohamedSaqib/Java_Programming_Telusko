package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/firstServlet")
public class FirstServletApp extends HttpServlet {

    public FirstServletApp() {
        System.out.println("Servlet object is created internally by the container");
    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("uname");
        String city = request.getParameter("ucity");

        PrintWriter writer = response.getWriter();
        writer.println("Hello" + name);
        writer.println("I know that you are from " + city);

        writer.close();
    }
}