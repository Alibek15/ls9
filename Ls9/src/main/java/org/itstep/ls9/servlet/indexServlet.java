package org.itstep.ls9.servlet;


import lombok.extern.slf4j.Slf4j;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet( value = "/index") //может принимать массив
public class indexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       /* PrintWriter writer = response.getWriter(); //Класс который позволяет позволяет генерировать и распечатывать в браузере теги итд
        writer.println("");
        writer.println("<h1>Hello WORLD!</h1>");
        writer.close();
*/

        request.getRequestDispatcher("index.jsp").forward(request,response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email =  request.getParameter("email");
        String password =  request.getParameter("password");

        request.setAttribute("email", email);

        response.sendRedirect("/about");

    }
}

//Maven - сборщик проектов
//lombok нужен для


