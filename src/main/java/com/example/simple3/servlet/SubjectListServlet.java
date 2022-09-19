package com.example.simple3.servlet;


import com.example.simple3.entities.Subject;
import com.example.simple3.servlet.repositories.SubjectRepository;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "SubjectListServlet", value = "/SubjectList")
public class SubjectListServlet extends HttpServlet {
    List<Subject>subjects = null ;
    private int count = 0 ;
    //ทุกครั้งที่มี request เข้ามา สั่ง count++
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        count++;
        request.setAttribute("subjects",subjects);
        request.setAttribute("count",count);
        request.getRequestDispatcher("/subject_listing.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO document why this method is empty
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        this.subjects = new SubjectRepository().findAll();
        // สร้างแค่ครั้งแรกที่สร้าง object
        // เรียก Method init of parent
    }

    @Override
    public void destroy() {
        //use for destroy all object
        //unload object from memory
        //มีอะไรค้างไว้เอาออก
        super.destroy();
        System.out.println("\n------------------------");
        System.out.println("SubjectListServlet has die !!!");
        System.out.println("--------------------------");
    }
}
