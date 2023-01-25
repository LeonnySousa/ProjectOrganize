/**
 * @author Leonny Sousa
 */

package model;
// importing Date: Class represents date and time in java.
import java.util.Date;

public class Project {
    
    // Project Entity Class. Private Attributes: 
    private int id; // Primary key
    private int idUser;
    private String name;
    private String description;
    private Date createdAt;
    private Date updatedAt;
    
    // Construtor 1: Creates object receiving attributes as parameters
    public Project(int id, int idUser, String name, String description, 
            Date createdAt, Date updatedAt) {
        
        this.id = id;
        this.idUser = idUser;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        
    }
    
    // Constructor 2: Creates object with creation and update date only
    public Project(){
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }
    
    
    // GET and SET: Accessors and Modifiers methods
    
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    
    
    // The toString method:
    // returns a string representation of an object
    @Override
    public String toString() {
        return this.name;
    }
  
}
