package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {
    
   public static Connection getConnection() {
       try {
           Connection conn = DriverManager.getConnection(
        "jdbc:mysql://127.0.0.1:3306/gerenfut",
        "developer",
        "19781107");
        return conn;
       } catch (Exception e) {
           System.out.println("Erro: " + e.getMessage());
       }
       return null;
   }
   public static void createDataBase(){

        try (Connection conn =  DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306",
                "developer",
                "19781107");

             Statement statement = conn.createStatement()) {

            statement.executeUpdate("CREATE DATABASE gerenfut");

            statement.executeUpdate("USE gerenfut");

            statement.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS Jogadores (" +
                    "id_jogador INT AUTO_INCREMENT PRIMARY KEY," +
                    "nome VARCHAR(15),"+
                    "cpf VARCHAR (11)," +
                    "numero INT," +
                    "posicao VARCHAR(20)," + 
                    "senha VARCHAR(20)," +
                    "situacao BIT)");
            statement.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS Time (" +
                    "id_time INT AUTO_INCREMENT PRIMARY KEY," +
                    "nome VARCHAR(50),"+
                    "pontos INT)");
            System.out.println("Tabela criada com sucesso.");

        } catch (java.sql.SQLException e) {
            System.out.println("Erro ao criar banco ou tabela: " + e.getMessage());
        }
    }
}
    

