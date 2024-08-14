package JDBC;

import java.sql.*;

public class jdbc {
    public static void main(String[] args) {

//        try {
//            // Step 1
//            // Deprecated - com.mysql.jdbc.Driver
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            // Step 2
//            Connection con = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/temp"
//                    , "root", "harsh");
////here sonoo is database name, root is username and password
//
//            // Step 3
////            PreparedStatement ps =
////                    con.prepareStatement("insert into student value (3,'Deepak','rdeepak28051@gmail.com');");
////            PreparedStatement ps1 = con.prepareStatement("Delete from student where id=3;");
////            PreparedStatement ps2 = con.prepareStatement("Delete from student where name='dilbar';");
////            PreparedStatement ps3 = con.prepareStatement("Delete from student;");
//            PreparedStatement ps4 = con.prepareStatement("select* from student");
//            ResultSet rs = ps4.executeQuery();
//
//            while(rs.next()){
//                int id = rs.getInt("id");
//                String name = rs.getString("email");
//                String name1 = rs.getString("name");
//                System.out.print(id+" ");
//                System.out.print(name1+" ");
//                System.out.println(name);
//            }
//            // Step 4
////            ps.execute();
////            ps1.execute();
////            ps2.execute();
////            ps3.execute();
//
//            // Step 5
//            con.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
        try {
            // Step 1
            // Deprecated - com.mysql.jdbc.Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/temp"
                    , "root", "harsh");
//here sonoo is database name, root is username and password

            // Step 3
            PreparedStatement ps =
                    con.prepareStatement("insert into student value (3,'Deepak','rdeepak28051@gmail.com');");
            // Step 4
            //ps.execute();

            PreparedStatement ps1 = con.prepareStatement("delete from student where id = 1;");
            //ps1.execute();

            PreparedStatement ps2 = con.prepareStatement("select * from student;");
            ResultSet rs = ps2.executeQuery();

            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("email");

                System.out.print(id+" ");
                System.out.println(name);
            }

            // Step 5
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        }
    }

