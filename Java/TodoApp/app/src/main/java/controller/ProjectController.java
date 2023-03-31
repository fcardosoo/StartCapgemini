/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
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
            
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
            
            //Executa a sql para a inserção dos dados
            statement.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao salvar o projeto");        
        } finally{
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    
    public void update(Project project) {
        
        String sql = "UPDATE projects SET name = ?, description = ?,"
                + "createdAt = ?, updatedAt = ?, WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //Cria uma conexão com o banco
            connection = ConnectionFactory.getConnection();
            
        }
    }
}
