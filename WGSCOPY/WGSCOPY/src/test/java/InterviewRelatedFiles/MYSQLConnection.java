package InterviewRelatedFiles;

import java.sql.*;

public class MYSQLConnection {

    public static void main(String[] args) throws SQLException {

        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/datasheet","root","root");
        Statement statement=connection.createStatement();
        String gettingTableRecord="select * from wesley;";
        ResultSet resultSet=statement.executeQuery(gettingTableRecord);
        while(resultSet.next()){
            System.out.println(resultSet.getString("SC_No") + " -- "+resultSet.getString("SC_Desc"));

        }

        connection.close();
        System.out.println("Query executed");


    }
}






