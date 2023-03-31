/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Project;
import util.ConnectionFactory;

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
            connection = ConnectionFactory.getConnection();
            // Cria um PreparedStatement, classe usada para executar a query
            statement = connection.prepareStatement(sql);
            
            
        }
    }
    
}
