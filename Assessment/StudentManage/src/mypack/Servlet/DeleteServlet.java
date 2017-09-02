package mypack.Servlet;

import mypack.Function;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteServlet implements Servlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws Exception {

        response.setContentType("UTF-8");
        request.setCharacterEncoding("UTF-8");

        String stdNumber = request.getParameter("stdNumber");    //从页面获取学号
        Function fun = new Function();
        boolean IsOK = fun.IsDelete(stdNumber);     //判断是否成功
        if(IsOK){
            response.sendRedirect("student.jsp");
        }
        else {
            response.sendRedirect("error.jsp");
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
