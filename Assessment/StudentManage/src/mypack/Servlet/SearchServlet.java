/*package mypack.Servlet;

import mypack.DBConnection;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SearchServlet implements Servlet {


    public void doPost(HttpServletRequest request,HttpServletResponse response) throws Exception {

        response.setContentType("UTF-8");
        request.setCharacterEncoding("UTF-8");

        String studentName = request.getParameter("name");
        String studentNumber = request.getParameter("stdNumber");

        System.out.println(studentName);

        Connection conn = DBConnection.getConn();
        Statement stmt = conn.createStatement();

        if (studentName!=null && studentName.length()>0) {

            String sql = "SELECT StudentName,StudentAge,StudentNumber,StudentMajor FROM student WHERE StudentName='"+studentName+"'";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                while (rs.next()) {
                    String name = rs.getString(1);
                    int stdAge = rs.getInt(2);
                    int stdNumber = rs.getInt(3);
                    String stdMajor = rs.getString(4);
                    System.out.println("<tr><td>" + name + "</td><td>" + stdAge + "</td><td>" + stdNumber + "</td><td>" + stdMajor + "</td></tr>");

                }
            } else {
                response.sendRedirect("error.jsp");

            }
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
}*/
