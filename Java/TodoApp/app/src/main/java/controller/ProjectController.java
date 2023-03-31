/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Project;

/**
 *
 * @author d311r
 */
public class ProjectController {
    
    public void save(Project project) {
        
        String sql = "INSERT INTO projects (name, description, createAt,"
                + "updatedAt) VALUES (?, ?, ?, ?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            // Cria uma conexão com o banco de dados
            
        }
    }
    
}
