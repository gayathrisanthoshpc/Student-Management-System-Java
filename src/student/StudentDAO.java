package student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDAO {

    // VIEW ALL STUDENTS
    public void getAllStudents() {

        String sql = "SELECT * FROM students";

        try {
            Connection con = DBConnection.getConnection();

            if (con == null) {
                System.out.println("Database connection failed!");
                return;
            }

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("\nID | Name | Email | Age");
            System.out.println("----------------------------");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getString("email") + " | " +
                                rs.getInt("age")
                );
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
