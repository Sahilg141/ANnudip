//2.Write a JDBC program to select  a record from a database (Table:Student: id,name,age,phone_no,email) 

import java.sql.*;

public class SelectStudent {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database";
        String user = "root";
        String password = "your_password";

        String query = "SELECT id, name, age, phone_no, email FROM Student";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            System.out.println("ID | Name | Age | Phone | Email");
            System.out.println("--------------------------------------------------");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String phone = rs.getString("phone_no");
                String email = rs.getString("email");

                System.out.printf("%d | %s | %d | %s | %s%n", id, name, age, phone, email);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

//output
ID | Name | Age | Phone | Email
--------------------------------------------------
101 | Alice Johnson | 20 | 9876543210 | alice@example.com