/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.User;
import util.ConnectionFactory;

/**
 *
 * @author Leonny Sousa
 */
public class UserController {
    
    public void save(User user){
        String sql = "INSERT INTO users"
                + "(email,"
                + "senha)"
                + "VALUES(?, ?)";
        
        Connection connection  = null;
        PreparedStatement statement = null;
        
        try{
             
            // Creating connection:
            connection = ConnectionFactory.getConnection();
            
            // Creating a PreparedStatement, class used to execute Query:
            statement = connection.prepareStatement(sql);
            
            // Sending values ​​to statement
            statement.setString(1,user.getEmail());
            statement.setString(2,user.getSenha());
            
            // Executing SQL command;
            statement.execute();
            
        }catch(SQLException ex){
            throw new RuntimeException("Erro ao Salvar o Usuário!!", ex);
        }finally{
            ConnectionFactory.closeConnection(connection,statement);
        }
        
     } 
        
        
        
     public List<User> getAll(){
        
        String sql = "SELECT * FROM users";
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        // Projects List returned after SQL command:
        List<User> users = new ArrayList<User>();
                
        try{
            // Creating connection:
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            // result after SQL command:
            resultSet = statement.executeQuery();
            
            // As long as there are projects ​​to be read by the resultSet:
            while(resultSet.next()){
                User user = new User();
                
                user.setId(resultSet.getInt("userID"));
                user.setEmail(resultSet.getString("email"));
                user.setSenha(resultSet.getString("senha"));
                
                users.add(user);
            }
        }catch(SQLException ex){
            throw new RuntimeException("Erro ao Buscar os usuários", ex);
        }finally{
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }
        
        // returning projects list:
        return users;
    }
    
}
