/**
 * @author Leonny Sousa
 */

package controller;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Project;
import util.ConnectionFactory;



public class ProjectController {

    public void save(Project project){
        String sql = "INSERT INTO projects"
                + "(name,"
                + "description,"
                + "createdAt,"
                + "updatedAt)"
                + "VALUES(?, ?, ?, ?)";
        
        Connection connection  = null;
        PreparedStatement statement = null;
        
        try{
             
            // Creating connection:
            connection = ConnectionFactory.getConnection();
            
            // Creating a PreparedStatement, class used to execute Query:
            statement = connection.prepareStatement(sql);
            
            // Sending values ​​to statement
            statement.setString(1,project.getName());
            statement.setString(2,project.getDescription());
            statement.setDate(3,new Date(project.getCreatedAt().getTime()));
            statement.setDate(4,new Date(project.getUpdatedAt().getTime()));
            
            // Executing SQL command;
            statement.execute();
            
        }catch(SQLException ex){
            throw new RuntimeException("Erro ao Salvar o Projeto!!", ex);
        }finally{
            ConnectionFactory.closeConnection(connection,statement);
        }
        
    }    
 
    public void update(Project project){
        
        String sql = "UPDATE projects SET "
                + "name = ?,"
                + "description = ?,"
                + "createdAt = ?,"
                + "updatedAt = ?"
                + "WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            // Creating connection:
            connection = ConnectionFactory.getConnection();
            
            // Creating a PreparedStatement, class used to execute Query:
            statement = connection.prepareStatement(sql);
            
            // Sending values ​​to statement
            statement.setString(1,project.getName());
            statement.setString(2,project.getDescription());
            statement.setDate(3,new Date(project.getCreatedAt().getTime()));
            statement.setDate(4,new Date(project.getUpdatedAt().getTime()));
            statement.setInt(5,project.getId());
            
            // Executing SQL command;
            statement.execute();
                  
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao realizar Update do Projeto!!", ex);
        }finally{
            ConnectionFactory.closeConnection(connection, statement);
        }
        
    }
    
    
    
    public void removeById(int idProject){
        
        String sql = "DELETE FROM projects WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try{
            // Creating connection:
            connection = ConnectionFactory.getConnection();
            
            // Creating a PreparedStatement, class used to execute Query:
            statement = connection.prepareStatement(sql);
            
            // Set idProject:
            statement.setInt(1,idProject);
            
            // Executing SQL command;
            statement.execute();
            
        } catch(SQLException ex){       
            throw new RuntimeException("Erro ao deletar O Projeto", ex); 
        } finally{            
            ConnectionFactory.closeConnection(connection, statement);            
        }
    }
    
    
    

    public List<Project> getAll(){
        
        String sql = "SELECT * FROM projects";
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        // Projects List returned after SQL command:
        List<Project> projects = new ArrayList<Project>();
                
        try{
            // Creating connection:
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            // result after SQL command:
            resultSet = statement.executeQuery();
            
            // As long as there are projects ​​to be read by the resultSet:
            while(resultSet.next()){
                Project project = new Project();
                
                project.setId(resultSet.getInt("id"));
                project.setName(resultSet.getString("name"));
                project.setDescription(resultSet.getString("description"));
                project.setCreatedAt(resultSet.getDate("createdAt"));
                project.setUpdatedAt(resultSet.getDate("updatedAt"));
                
                projects.add(project);
            }
        }catch(SQLException ex){
            throw new RuntimeException("Erro ao Buscar os projetos", ex);
        }finally{
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }
        
        // returning projects list:
        return projects;
    }
        
 
}
    
    
    
    
    

