package mypack;

import java.sql.*;

public class DBConnection {
    private static final String DBDriver = "com.mysql.jdbc.Driver";  //mysql驱动程序
    private static final String DBUser = "root";
    private static final String DBPassword = "chen6104!@#$";
    private static final String DBUrl = "jdbc:mysql://localhost:3306/stu_adm?useSSL=true&useUnicode=true&characterEncoding=utf8";  //mysql连接字符串
    private static Connection conn;

    public DBConnection()
    {
        conn = null;
    }
    //获取数据库对象
    public static Connection getConn()  {

        try {
            Class.forName(DBDriver);
            conn = DriverManager.getConnection(DBUrl, DBUser, DBPassword);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("数据库连接失败。");
        }
         return conn;
        }

    }


