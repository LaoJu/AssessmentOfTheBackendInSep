package mypack.Servlet;

import mypack.Function;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ModifyServlet implements Servlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws Exception {

        response.setContentType("UTF-8");
        request.setCharacterEncoding("UTF-8");

        //获取要修改的学生信息
        String stdName = request.getParameter("name");
        int stdAge = Integer.parseInt(request.getParameter("age"));
        String stdNumber = request.getParameter("stdNumber");
        String stdMajor = request.getParameter("major");

        Function fun = new Function();
        boolean IsOK = fun.IsModify(stdName,stdAge,stdNumber,stdMajor);  //判断是否修改成功
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
