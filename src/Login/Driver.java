package Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.Scanner;

public  class Driver {
    private static Connection con;
    static Scanner scan = new Scanner(System.in);

    static {
        try {
            // Step 1
            // Deprecated - com.mysql.jdbc.Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2
             con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/temp"
                    , "root", "harsh");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter 1 for user creation\n2.login\n3.deletion\n4.show details");
        int option;

        do {
            option = scan.nextInt();
            if(option==1){
                createUser();
            }
        } while (option > 0 && option < 5);
    }

    public static void createUser() {
        System.out.print("enter your id:");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.print("enter your name: ");
        String name = scan.nextLine();
        System.out.print("enter email: ");
        String email = scan.nextLine();
        System.out.print("enter your phone number:");
        String phone = scan.nextLine();
        System.out.print("enter username:");
        String username = scan.nextLine();
        System.out.print("enter password:");
        String password = scan.nextLine();

        try {
            PreparedStatement statement = con.prepareStatement("insert into users(id,name,email,phone,username,password) value(?,?,?,?,?,?)");
            statement.setInt(1,id);
            statement.setString(2,name);
            statement.setString(3,email);
            statement.setString(4,phone);
            statement.setString(5,username);
            statement.setString(6,password);

            if (statement.execute()) {
                System.out.println("user created");
            } else {
                System.out.println("user not created");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}