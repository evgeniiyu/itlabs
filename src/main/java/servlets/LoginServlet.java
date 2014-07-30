package servlets;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Evgenii on 23.07.2014.
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("user");
        String password = req.getParameter("pass");


        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<HTML><BODY>");
        out.println("<H2>hello "+userName+"</H2>");

        out.println("<form name=\"loginForm\" action=\"cookies\" method=\"post\">");
        out.println("<input type=\"submit\" value=\"Show Cookies\">");
        out.println("</form>");
        out.println("</BODY></HTML>");

//        HttpSession session = request.getSession(true);
//                session.setAttribute("auth", true);
//                session.setAttribute("user", user.getName());
//        String path = "index.jsp";
//        resp.sendRedirect(path);

//        request.getRequestDispatcher(request, response).forward(".jsp");



    }
}
