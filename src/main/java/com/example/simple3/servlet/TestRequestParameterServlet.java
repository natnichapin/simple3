package com.example.simple3.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

@WebServlet(name = "TestRequestParameterServlet", value = "/TestRequestParameter")
public class TestRequestParameterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.getRequestDispatcher("/favorite_subjects.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 String paramValues[] = request.getParameterValues("fav_subjects") ;
         if(paramValues==null){
             response.sendError(HttpServletResponse.SC_BAD_REQUEST,"Missing fav_subjects");
             return; //บอกจาวาว่าไม่ต้องไปทำโค้ดด้านล่างแล้ว
         }
        request.getRequestDispatcher("/favorite_subjects.jsp").forward(request,response);
        Map<String,String[]> paramMap = request.getParameterMap() ; //ใช้กับพวกกลุ่ม
        System.out.println("Name: "+paramMap.get("name")[0]);
        System.out.println(" Favorite Subjects[0]: "+paramMap.get("fav_subjects")[0]);
        System.out.println(" Favorite Subjects[1]: "+paramMap.get("fav_subjects")[1]);


        /*       Enumeration<String> params = request.getParameterNames(); //รีเทินอะไร เอาตัวนั้นรับ
        while (params.hasMoreElements()) { //เอาชื่อมา เช็คว่ามีตัวต่อไปไหม
            String paramName = params.nextElement(); //เอาค่ามารับชื่อ เช่น รับคะแนน รับชื่อ
            String paraValue = request.getParameter(paramName) ; //สร้างตัวแปรมารับ ค่าจาก ชื่อนั้นๆ
            System.out.println(paramName+" = "+paraValue); //display output on log
    //ถ้ามี 1 ค่า ไม่ต้อง & เวลากรอกแบบ dynamic ผ่าน link
        }
        System.out.println("-----------------");+
        String paramValue[] = request.getParameterValues("fav_subjects");
        System.out.println("Favorite Subject");
        for (String value:paramValue) {
            System.out.println("\t"+value);
            System.out.println("-----------------");
        } */
    }

    }

