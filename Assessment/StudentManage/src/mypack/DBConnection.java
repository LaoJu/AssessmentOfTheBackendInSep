package mypack;

import java.sql.*;

public class DBConnection {
    private static final String DBDriver = "com.mysql.jdbc.Driver";
    private static final String DBUser = "root";
    private static final String DBPassword = "chen6104!@#$";
    private static final String DBUrl = "jdbc:mysql://localhost:3306/stu_adm?useSSL=true&useUnicode=true&characterEncoding=utf8";

    //获取数据库对象
    public static Connection getConn()  {
        try {
            Class.forName(DBDriver);
            Connection conn = DriverManager.getConnection(DBUrl, DBUser, DBPassword);
            return conn;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("数据库连接失败。");
        }
         return null;
        }

    }


