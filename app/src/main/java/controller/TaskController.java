
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
import model.Task;
import util.ConnectionFactory;


public class TaskController {
    
    public void save(Task task){
        String sql = "INSERT INTO tasks"
                + "(idProject,"
                + "name,"
                + "description,"
                + "completed,"
                + "notes,"
                + "deadline,"
                + "createdAt,"
                + "updatedAt) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection connection  = null;
        PreparedStatement statement = null;
        
        try{
            // Creating connection and statement:
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            // Sending values ​​to statement:
            statement.setInt(1,task.getIdProject());
            statement.setString(2,task.getName());
            statement.setString(3,task.getDescription());
            statement.setBoolean(4,task.isIsCompleted());
            statement.setString(5,task.getNotes());
            statement.setDate(6,new Date(task.getDeadline().getTime()));
            statement.setDate(7,new Date(task.getCreatedAt().getTime()));
            statement.setDate(8,new Date(task.getUpdatedAt().getTime()));
            
            // Executing SQL Query:
            statement.execute();
            
        }catch(Exception ex){
            throw new RuntimeException("Erro ao Salvar a tarefa!!" + ex.getMessage(), ex);
        }finally{
            ConnectionFactory.closeConnection(connection,statement);
        }   
        
        
    }
    
    public void update(Task task){
        
        String sql = "UPDATE tasks SET "
                + "idProject = ?, "
                + "name = ?, "
                + "description = ?, "
                + "notes = ?, "
                + "completed = ?, "
                + "deadline = ?, "
                + "createdAt = ?, "
                + "updatedAt = ? "
                + "WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            // Creating connection:
            connection = ConnectionFactory.getConnection();
            
            // Sending values ​​to statement:
            statement = connection.prepareStatement(sql);
            statement.setInt(1,task.getIdProject());
            statement.setString(2,task.getName());
            statement.setString(3,task.getDescription());
            statement.setString(4,task.getNotes());
            statement.setBoolean(5,task.isIsCompleted());
            statement.setDate(6,new Date(task.getDeadline().getTime()));
            statement.setDate(7,new Date(task.getCreatedAt().getTime()));
            statement.setDate(8,new Date(task.getUpdatedAt().getTime()));
            statement.setInt(9,task.getId());
            
            // // Executing SQL Query;
            statement.execute();
                  
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao realizar Update!!" + ex.getMessage(),ex);
        }finally{
            ConnectionFactory.closeConnection(connection, statement);
        }
        
    }
    
    public void removeById(int taskId){
        String sql = "DELETE FROM tasks WHERE id = ?";
        Connection connection = null;
        PreparedStatement statement = null;
        
        try{
            // Creating connection and statement:
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            // Sending values ​​to statement:
            statement.setInt(1,taskId);
            
            // Executing Query:
            statement.execute();
            
        } catch(Exception ex){       
            throw new RuntimeException("Erro ao deletar a Tarefa" + ex.getMessage(),ex); 
        } finally{            
            ConnectionFactory.closeConnection(connection, statement);            
        }
    }
    
    public void removeByIdProject(int idProject){
        String sql = "DELETE FROM tasks WHERE idProject = ?";
        Connection connection = null;
        PreparedStatement statement = null;
        
        try{
            // Creating connection and statement:
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            // Sending values ​​to statement:
            statement.setInt(1,idProject);
            
            // Executing Query:
            statement.execute();
            
        } catch(Exception ex){       
            throw new RuntimeException("Erro ao deletar Tarefas" + ex.getMessage(),ex); 
        } finally{            
            ConnectionFactory.closeConnection(connection, statement);            
        }
    }
    
    public List<Task> getAll(int idProject){
        
        String sql = "SELECT * FROM tasks WHERE idProject = ?";
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        // ArrayList Tasks
        List<Task> tasks = new ArrayList<Task>();
                
        try{
            // Creating connection and statement:
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            // Sending values ​​to statement:
            statement.setInt(1, idProject);
            
            // result Query:
            resultSet = statement.executeQuery();
            
            // As long as there are Tasks ​​to be read by the resultSet:
            while(resultSet.next()){
                Task task = new Task();
                task.setId(resultSet.getInt("id"));
                task.setIdProject(resultSet.getInt("idProject"));
                task.setName(resultSet.getString("name"));
                task.setDescription(resultSet.getString("description"));
                task.setNotes(resultSet.getString("notes"));
                task.setIsCompleted(resultSet.getBoolean("completed"));
                task.setDeadline(resultSet.getDate("deadline"));
                task.setCreatedAt(resultSet.getDate("createdAt"));
                task.setUpdatedAt(resultSet.getDate("updatedAt"));
                
                tasks.add(task);
            }
        }catch(Exception ex){
            throw new RuntimeException("Erro ao Inserir a tarefa" + ex.getMessage(),ex);
        }finally{
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }
        
        // returning Tasks list:
        return tasks;
    }
       
    
}
