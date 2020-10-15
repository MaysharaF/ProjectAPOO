/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author wirll
 */
public class Database {
    private static final String DRIVER= "com.mysql.jdbc.Driver";
    private static final String URL= "jdbc:mysql://localhost:3306/denuncias?autoReconnect=true&useSSL=false";
    private static final String USER= "root";
    private static final String PASS= "123456";
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL, USER, PASS);
    }
    
    public static void closeConnection(Connection conn) throws SQLException{
        if(conn!=null){
            conn.close();
        }
    }
    
        
    public static void closeConnection(Connection conn, PreparedStatement stmt) throws SQLException{
        closeConnection(conn);
        if(stmt != null){
            stmt.close();
        }
    }
    
      public static void closeConnection(Connection conn, PreparedStatement stmt, ResultSet rs) throws SQLException{
        closeConnection(conn, stmt);
        if(rs != null){
            rs.close();
        }
    }
    
}
