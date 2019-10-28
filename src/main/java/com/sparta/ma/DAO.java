package com.sparta.ma;

import java.sql.*;

public class DAO {
    private final String QUERY = "select first_name,last_name from actor where actor_id = ?";
    private final String URL = "jdbc:mysql://localhost/sakila?user=root&password=mayowa123";


    public void runSQLQuery(String id){
        try(Connection connection = DriverManager.getConnection(URL)){
            PreparedStatement statement = connection.prepareStatement(QUERY);
            statement.setString(1,id);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                System.out.println("First_name is "+ resultSet.getString(1));
                System.out.println("Last_ name is "+ resultSet.getString(2));

            }
        } catch (SQLException e){

        }
    }



}
