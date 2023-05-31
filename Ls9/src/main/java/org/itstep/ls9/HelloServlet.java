package org.itstep.ls9;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
//Java EE - решение для корпоротивного сектора, которые могут обслуживать несколько тысяч или миллионов студентов одновременно
//есть нотация как вебсервлет, где указывается value. value по какому названию он у нас должен обрабатывать
//со стороны клиента летит запрос на вебсервер. Дальше в xml указывались название всех сервлетов. После появления аннотаций
//в это нет никакой необходимости. Через анотации он понимает что такой сервлет уже есть которые обрабатывает значения value
//в случае если пришел doGet запрос, то надо выводить эту информацию метода на экран
//каждый сервлет должен быть уникальным