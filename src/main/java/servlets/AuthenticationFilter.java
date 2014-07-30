package servlets;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Evgenii on 28.07.2014.
 */
public class AuthenticationFilter implements Filter {
    private final String LOGIN = "user";
    private final String PASSWORD = "pass";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        String path = "index.jsp";
        String login = request.getParameter("user");
        String password = request.getParameter("pass");
        try{
            if (login.equals(LOGIN) && password.equals(PASSWORD)){
                request.getSession().removeAttribute("failed");
                filterChain.doFilter(request, response);
            }
            else{
                request.getSession().setAttribute("failed", "true");
                response.sendRedirect(((HttpServletRequest) servletRequest).getContextPath() + "/index.jsp");
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    @Override
    public void destroy() {

    }
}
