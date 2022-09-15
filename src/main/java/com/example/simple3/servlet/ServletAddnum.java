package com.example.simple3.servlet;

import com.example.simple3.entities.Calculate;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ServletAddnum", value = "/AddNumber") // ชื่อ Servlet กับ path ที่จะ map
public class ServletAddnum extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doProcess(request,response);
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doProcess(request,response);

    }
    private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

       String x = request.getParameter("n1") ;
        String y=  request.getParameter("n2") ; //return to Enumeration -> get All Name not be value, You must pull this by loop and get value
        Calculate cal = new Calculate(Double.valueOf(x),Double.valueOf(y)) ; //สร้าง object จาก model
        Double resultAdd =cal.add() ;
        Double resultSub =cal.subtract() ; //ให้Model ทำงาน
        Double resultMul =cal.Multiple() ;
        Double resultDivided =cal.Divided() ;
        request.setAttribute("resultAdd",resultAdd);
        request.setAttribute("resultSub",resultSub); //รับค่า
        request.setAttribute("resultMul",resultMul);
        request.setAttribute("resultDivided",resultDivided);
        request.setAttribute("x",x);
        request.setAttribute("y",y);
        request.getRequestDispatcher("/addnum.jsp").forward(request,response); //ส่งต่อ
    }
}

//โจทย์ + -  * /