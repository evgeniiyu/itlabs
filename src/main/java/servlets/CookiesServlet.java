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
 * Created by Evgenii on 28.07.2014.
 */
public class CookiesServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        Gson gson = new GsonBuilder().create();
        resp.setContentType("application/json");
        PrintWriter out = resp.getWriter();


        if (cookies != null)
        {
            String g = gson.toJson(cookies);
            out.println(g);


            //gson.toJsonTree(cookies);

            //req.getSession().setAttribute("Cookies", g);

            //resp.addCookie();
            //req.getRequestDispatcher("/newPage.jsp").forward(req,resp);

        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
