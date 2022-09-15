package com.example.simple3.servlet;

import com.example.simple3.entities.GPACal;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
//path servlet มี / นำหน้าเสมอ
@WebServlet(name = "GPAServlet", value = "/GPAServlet")
public class GPAServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doprocess(request, response);
    }  //Method ดั้งเดิม คำนวนไม่ได้นะ

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doprocess(request, response);
    }

    private void doprocess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Name[] = request.getParameterValues("Allname");
        String score[] = request.getParameterValues("Allscore");
        String Grade[] = new String[Name.length];
         GPACal cal = new GPACal();  //รับมาเป็น number แต่ก็ยังต้องแปลง
        if (Name == null || score == null) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "MISSING");
            return;
        }
       Map<String,String[]> paramap = request.getParameterMap() ; //ต้อง map กับ key ที่ request ส่งมา
        for(int i=0;i< Name.length;i++) {
            Grade[i] = cal.calculat(Double.valueOf(score[i]));
        }
        request.setAttribute("GRADE",Grade);
        request.setAttribute("NAME",Name);
        request.setAttribute("SCORE",score);


request.getRequestDispatcher("/GPAresult.jsp").forward(request,response);
       /* Enumeration<String> param = request.getParameterNames();
        while (param.hasMoreElements()) {
            String nameofall = param.nextElement(); //ใช้ได้แค่ชื่อธรรมดา ไม่อาร์เรย์
            String nameV = request.getParameter(nameofall);
            System.out.println(nameofall + " : " + nameV);

        }*/
    }
}
