package module10.homework1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/skillbox";
        String user = "root";
        String pass = "password";

        try {
            Connection connection = DriverManager.getConnection(url, user, pass);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT course_name, \n" +
                    "(count(course_name) / (MAX(month(subscription_date)) - MIN(month(subscription_date)) + 1)) AS middle_sells\n" +
                    "FROM purchaselist\n" +
                    "GROUP BY course_name;");
            while(resultSet.next()){
                String courseName = resultSet.getString("course_name");
                double middleDouble = resultSet.getDouble("middle_sells");
                System.out.println(courseName + " " + middleDouble);
            }
            resultSet.close();
            statement.close();
            connection.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
