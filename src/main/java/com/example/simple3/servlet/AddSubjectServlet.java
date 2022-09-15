package com.example.simple3.servlet;

import com.example.simple3.entities.Subject;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


import java.io.IOException;

@WebServlet(name = "AddSubjectServlet", value = "/AddSubject")
public class AddSubjectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    //We ensure that data is coming and not miss name of data
    //method do post is local variable
    //forward request and response เสมอ  เพื่อให้ servlet , jsp  อ่าน request แล้ว response กลับไป

    // อ่าน รีเควส เรียกโมเดล ส่งไปทำงานต่อ
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("subjectId");
        String title = request.getParameter("subjectTitle"); //ชื่อ form
        String credit = request.getParameter("credit");
        Subject subject = new Subject(id,title,Double.valueOf(credit)) ;
        request.setAttribute("s",subject); //s is object of subject
        request.getRequestDispatcher("/subject_info.jsp").forward(request,response); // forward เอกสาร แล้วหาเอกสารไม่เจอ คือ 404 เสมอ
    }
}
