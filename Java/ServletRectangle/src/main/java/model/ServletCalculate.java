package model;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ServletCalculate", value = "/ServletCalculate")
public class ServletCalculate extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Entered into Servlet.");
        String length = request.getParameter("length");
        String breadth = request.getParameter("breadth");

        int l = Integer.parseInt(length);
        int b = Integer.parseInt(breadth);

        int area = l * b;

        String result = String.valueOf(area);

        request.setAttribute("result", result);
        RequestDispatcher rd = request.getRequestDispatcher("Area.jsp");
        rd.forward(request, response);


    }

}
