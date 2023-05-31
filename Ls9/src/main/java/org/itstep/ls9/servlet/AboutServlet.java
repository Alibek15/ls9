package org.itstep.ls9.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AboutServlet", value = "/about")
public class AboutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("about.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

//Get - запрос на чтение данных где видны все параметры, все передачи идут явно и можно менять
// Post - измененние в базе данных или с чувствительными данными и требуется redirect.
// После обработки пост запроса всегда редирект иначе запрос обработается 2 раза
//
