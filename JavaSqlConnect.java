package com.prodapt.basics;
import java.sql.*;

public class JavaConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("We Are Connecting Soon ....With Database mysql");

        try {
//step1 load the driver class  
            Class.forName("com.mysql.cj.jdbc.Driver");    

//step2 create  the connection object  
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root"); // your
                                                                            //database name        ID            PWD                        // MySQL
                                                                                                                        // PWD

//step3 create the statement object  
            Statement stmt = con.createStatement();

//step4 execute query and generate the resultset  
            ResultSet rs = stmt.executeQuery("select * from Employeedata1");  //todo -->Table Name  --Read Operation  
            while (rs.next()) {

            //    System.out.println(rs.next());
            System.out.println("Data base connected");
                System.out.println(rs.getInt(1)+ "  " + rs.getString(2) +" "+rs.getInt(3)+" "+rs.getFloat(4)+" "+rs.getString(5));
            }
//step5 close the connection object  
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

}

	}

