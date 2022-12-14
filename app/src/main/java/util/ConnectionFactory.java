/**
 * @author Leonny Sousa
 */

package util;

/*
 To Connect Java Application with mysql database:

 - Connection: represents the connection to the database.

 - The DriverManager: class acts as an interface between users and drivers.

 - PreparedStatement: object provides a feature to execute a parameterized query.

 - ResultSet: object is a table of data representing a database result set, 
   which is usually generated by executing a statement that queries the database.

*/

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class ConnectionFactory {
    
    /*
        The static keyword means the value is the same for every instance of the class. 
        The final keyword means once the variable is assigned a value it can never be changed.
    */
    
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/taskdatabase";
    public static final String USER = "root";
    public static final String PASS = "";
    
    
    public static Connection getConnection(){
        
         // Connecting to Database 
         try{
             Class.forName(DRIVER);
             return DriverManager.getConnection(URL,USER,PASS);
         } catch(Exception ex){
             throw new RuntimeException("Error connecting to Database!!");
         }    
    }
    
    public static void closeConnection(Connection connection){
    
         // Closing connection 
         try{
             if(connection != null){
                 connection.close();
             }
         } catch(Exception ex){
             throw new RuntimeException("Error closing connection!!");
         }    
    }


    public static void closeConnection(Connection connection, PreparedStatement statement){
    
         // closing connection and statement 
         try{
             if(connection != null){
                 connection.close();
             }
             
             if(statement != null){
                statement.close();
             }
         } catch(Exception ex){
             throw new RuntimeException("Error closing connection and statement!!");
         }    
    }
    

    public static void closeConnection(Connection connection, PreparedStatement statement, ResultSet resultSet){
    
         // closing connection, statement and resultSet
         try{
             if(connection != null){
                 connection.close();
             }
             
             if(statement != null){
                statement.close();
             }
             
             if(resultSet != null){
                 resultSet.close();
             }
             
         } catch(Exception ex){
             throw new RuntimeException("Error closing connection, statement and resultSet!!");
         }    
    }
    
}
