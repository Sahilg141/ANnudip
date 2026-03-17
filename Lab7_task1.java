//1.Write a JDBC program to insert a record into a database (Table:Student: id,name,age,phone_no,email)

import java.sql.*;

public class InsertStudent {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database";
        String user = "root";
        String password = "your_password";

        String query = "INSERT INTO Student (id, name, age, phone_no, email) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            // Setting parameters
            pstmt.setInt(1, 101);
            pstmt.setString(2, "Alice Johnson");
            pstmt.setInt(3, 20);
            pstmt.setString(4, "9876543210");
            pstmt.setString(5, "alice@example.com");

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new student was inserted successfully!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

//output 

A new student was inserted successfully!