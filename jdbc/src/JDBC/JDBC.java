package JDBC;

import java.sql.*;

public class JDBC {
    public static void main(String args[]) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/customerdb";
        String uname = "root";
        String password = System.getenv("SQLPassword");
        String query = "select * from engineeringstudents";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection con = DriverManager.getConnection(url, uname, password );
            Statement statement = con.createStatement();

            ResultSet result= statement.executeQuery(query);

            while(result.next()) {
                String UniversityData =  "";
                for(int i=1; i <= 6; i++) {
                    UniversityData += result.getString(i) + ":";
                }
                System.out.println(UniversityData);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
