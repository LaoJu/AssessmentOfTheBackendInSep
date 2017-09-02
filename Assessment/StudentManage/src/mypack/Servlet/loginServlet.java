package mypack.Servlet;

import mypack.Function;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class loginServlet implements Servlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setContentType("UTF-8");
        request.setCharacterEncoding("UTF-8");

        //获取用户名和密码
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Function fun = new Function();
        boolean IsOK = fun.IsSuccess(username,password);      //判断用户名和密码是否匹配
        if(IsOK) {
            response.sendRedirect("student.jsp");
        }
        else {

            response.sendRedirect("login.jsp");
        }
    }
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        HttpServletRequest rq = (HttpServletRequest) request;
        HttpServletResponse rs = (HttpServletResponse) response;
        try {
            doPost(rq,rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
