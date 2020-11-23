package com.lhh.springboot.commons.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *  jdbc 连接池
 *
 * @author lhh
 * @Date 2019/10/29 0:20
 */
public class DbJdbcUtils {

    public static final String DRIVER_CLASS_NAME_MYSQL="com.mysql.jdbc.Driver";
    public static final String DRIVER_CLASS_NAME_ORACLE="oracle.jdbc.driver.OracleDriver";
    public static final String URL_LOCALHOST_MYSQL="jdbc:mysql://127.0.0.1:3306/mango?useUnicode=true&zeroDateTimeBehavior=convertToNull&autoReconnect=true&characterEncoding=utf-8";
    public static final String URL_LOCALHOST_ORACLE="jdbc:oracle:thin:@127.0.0.1:1521:orcl";
    /**
     * 要连接的数据库
     */
    private String url;
    /**
     * 你的账号
     */
    private String  username;
    /**
     * 你的密码
     */
    private String password;

    /**
     * 数据源 ：mysql  oracle
     */
    private String driverClassName;

    Connection conn=null;
    PreparedStatement ps = null;
    ResultSet rs=null;


    public DbJdbcUtils() {
        super();
    }
    public DbJdbcUtils( String driverClassName,String url, String username, String password) {
        super();
        this.driverClassName=driverClassName;
        this.url = url;
        this.username = username;
        this.password = password;
    }
    /**
     *连接数据库
     *
     **/
    public Connection getCon() {
        try {
            Class.forName(driverClassName);
            conn=DriverManager.getConnection(url,username,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     *增刪改功能
     */
    public boolean update(String sql,Object... obj) {
        conn = getCon();
        boolean flag=false;
        try {
            ps = conn.prepareStatement(sql);
            for(int i=0;i<obj.length;i++){
                ps.setObject(i+1,obj[i]);
            }
            int i = ps.executeUpdate();
            if(i>0){
                flag=true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return flag;

    }
    /**
     *查询功能
     *
     **/

    public ResultSet query(String sql,Object... obj) {
        conn = getCon();
        try {
            ps = conn.prepareStatement(sql);

            for (int i = 0; i <obj.length; i++) {
                ps.setObject(i + 1, obj[i]);
            }

            rs = ps.executeQuery();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;

    }

    /**
     *关闭数据流
     *
     **/
    public void close() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        DbJdbcUtils i=new DbJdbcUtils(DbJdbcUtils.DRIVER_CLASS_NAME_MYSQL,DbJdbcUtils.URL_LOCALHOST_MYSQL,"root", "root");

        ResultSet rs = i.query("select * from sys_user ");
        try {
            while (rs.next()) {
                String name = rs.getString("u_name");
                String pwd = rs.getString("u_pwd");
                String qq = rs.getString("u_id");
                System.out.println(name);
                System.out.println(pwd);
                System.out.println(qq);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            i.close();
        }
    }
}
