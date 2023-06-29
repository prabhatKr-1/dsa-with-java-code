
package com;
import java.sql.*;
public class jdbc {
    public static void main(String[] args) {
        try {
//            Loading the driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
//            Creating the connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
            Statement stmt = con.createStatement();
            stmt.executeQuery("create table table1(name varchar2,id number");
            System.out.println("Table created!!");
            con.close();


        }catch(Exception e){
            System.out.println("Some error occurred!");
        }
    }
}
