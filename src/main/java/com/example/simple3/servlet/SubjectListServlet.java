package com.example.simple3.servlet;


import com.example.simple3.entities.Subject;
import com.example.simple3.servlet.repositories.SubjectRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "SubjectListServlet", value = "/SubjectList") // บอก webcontainer ว่าเรียก servlet ตัวนี้
public class SubjectListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Subject> subjects = new SubjectRepository().findAll(); // List ข้อมูลทั้งหมด (Local var)
        request.setAttribute("subjects",subjects); //รับด้วยชื่ออะไร,ส่งค่า
        request.getRequestDispatcher("/subject_listing.jsp").forward(request,response);// ใช้ Method forward โยนการทำงานต่อ

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
