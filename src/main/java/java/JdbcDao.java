package java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author: LiGX
 * @Date: 2019/3/6 0006
 * 8.0Jdbc可以不需要加载驱动
 * 5.0需要加载驱动
 * 5.1驱动可加可不加
 */
public class JdbcDao {
    public static void main(String[] args){
        String driverClassName ="com.mysql.cj.jdbc.Driver";
        String url ="jdbc:mysql:///mydb?serverTimezone=UTC";
        String user ="root";
        String password="1234";
        try {
            Class.forName(driverClassName);
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println(con);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
