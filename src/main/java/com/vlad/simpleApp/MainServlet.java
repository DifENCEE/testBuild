package com.vlad.simpleApp;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/")
public class MainServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter writer = resp.getWriter();


        writer.println("<html>");
        writer.println(
                "<h1 align=\"center\">" +
                        "Теория — это когда все известно, но ничего не работает. <br>" +
                        "Практика — это когда все работает, но никто не знает почему. <br>" +
                        "Мы же объединяем теорию и практику: ничего не работает и никто не знает почему!<br>" +
                        "</h1>"



        );
        writer.println("</html>");
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
