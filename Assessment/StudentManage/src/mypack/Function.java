package mypack;

import com.sun.org.apache.regexp.internal.RE;

import java.sql.*;

public class Function {


    //判断登录用户名与密码是否正确
    public static boolean IsSuccess(String username,String password) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getConn();
        Statement stmt = conn.createStatement();
        String sql = "SELECT  * FROM admin";
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            String usernameInDB = rs.getString("AdminName");
            String passwordInDB = rs.getString("AdminPwd");

            if (username.equals(usernameInDB) && password.equals(passwordInDB)) {
                return true;
            }
        }
        conn.close();
        return false;
    }

    //判断是否成功添加学生信息
    public boolean IsAdd(String s1, int s2, String s3, String s4) throws SQLException, ClassNotFoundException {
            Connection conn = DBConnection.getConn();
            Statement stmt = conn.createStatement();
            String sql1 = "SELECT * FROM student WHERE StudentNumber='"+s3+"'";
            ResultSet rs = stmt.executeQuery(sql1);
            if(rs.next()){
                return false;
            }

            String sql = "INSERT INTO student(StudentName,StudentAge,StudentNumber,StudentMajor) VALUES (?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, s1);
            pstmt.setInt(2, s2);
            pstmt.setString(3, s3);
            pstmt.setString(4, s4);

            int len = pstmt.executeUpdate();
            return len > 0;

    }

    //判断是否成功删除学生信息
    public boolean IsDelete(String stdNumber) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getConn();
        Statement stmt = conn.createStatement();
        String sql1 = "SELECT * FROM student WHERE StudentNumber='"+stdNumber+"'";
        ResultSet rs = stmt.executeQuery(sql1);
        if(!rs.next()){
            return false;
        }
        String sql = "DElETE FROM student WHERE studentNumber = ? ";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,stdNumber);
        int len = pstmt.executeUpdate();
        conn.close();
        return len>0;
    }

    //判断是否成功修改学生信息
    public boolean IsModify(String name, int age, String stdNumber, String major) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getConn();
        Statement stmt = conn.createStatement();
        String sql1 = "SELECT * FROM student WHERE StudentNumber='"+stdNumber+"'";
        ResultSet rs = stmt.executeQuery(sql1);
        if(!rs.next()){
            return false;
        }
        String sql = "UPDATE student SET StudentName=?,StudentAge=?,StudentMajor=? WHERE StudentNumber=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, name);
        pstmt.setInt(2, age);
        pstmt.setString(3, major);
        pstmt.setString(4, stdNumber);

        int len = pstmt.executeUpdate();
        conn.close();
        return len>0;
    }

    //查询功能
    public ResultSet search(String sql)  {
        try{
            Connection conn = DBConnection.getConn();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("数据库连接失败。");
        }
        return null;
    }
}
