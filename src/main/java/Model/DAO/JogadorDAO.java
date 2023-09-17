/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Model.Jogador;
import db.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author fabio
 */
public class JogadorDAO {
    
    public static boolean verificaCadastro(Jogador jogador){
        Connection conn = Conexao.getConnection();
        PreparedStatement st;
        ResultSet rs;
        
        try {
            st = conn.prepareStatement("SELECT cpf FROM Jogadores WHERE cpf = ?");
            st.setString(1, jogador.getCpf());
            rs = st.executeQuery();
            
            if(rs.next()){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static void inserirJogador(Jogador jogador) {
        Connection conn = Conexao.getConnection();
 
        try {
            
            PreparedStatement st = conn.prepareStatement("INSERT INTO Jogadores" +
                    "(nome, cpf, numero, posicao, senha)"+
                    "VALUES"+
                    "(?, ?, ?, ?, ?)");
            st.setString(1, jogador.getName());
            st.setString(2, jogador.getCpf());
            st.setInt(3, jogador.getNumero());
            st.setString(4, jogador.getPosicao());
            st.setString(5, jogador.getSenha());

            st.executeUpdate();
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public static boolean verificarJogador(String cpf, String senha){
        
        Connection conn = Conexao.getConnection();
        PreparedStatement st = null;
        ResultSet rs = null;
        
        try {
            st = conn.prepareStatement("SELECT cpf, senha FROM Jogadores WHERE cpf = ? AND senha = ?");
            st.setString(1, cpf);
            st.setString(2, senha);
            rs = st.executeQuery();
            
            if(rs.next() ){
                return true;
            }else{
                return false;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public static boolean excluirJogador(String cpf, String senha){
        Connection conn = Conexao.getConnection();
        PreparedStatement st = null;
         
        try {
            st = conn.prepareStatement("DELETE FROM jogadores WHERE cpf = ? AND senha = ?");
            st.setString(1, cpf);
            st.setString(2, senha);
            
            int linhasExcluidas = st.executeUpdate();
            
            if(linhasExcluidas == 1){
                return true;
            }else{
                return false;
            }
            
        } catch (Exception e) {
        }
        return false;
    }
    public static Jogador buscarCpf(String cpf){
        
        Connection conn = Conexao.getConnection();
        PreparedStatement st = null;
        ResultSet rs; 
        
        try {
            st = conn.prepareStatement("SELECT nome, numero, posicao FROM Jogadores WHERE cpf = ?");
            st.setString(1, cpf);
            rs = st.executeQuery();
            
            if(rs.next()){
                String nome = rs.getString("nome");
                int numero = rs.getInt("numero");
                String posicao = rs.getString("posicao");
                return new Jogador(nome, numero, posicao);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void atualizarJogador(String cpf, Jogador jogador){
        
        Connection conn = Conexao.getConnection();
        PreparedStatement st = null;
        
        try {
            st = conn.prepareStatement("UPDATE Jogadores SET nome = ?, numero = ?, posicao = ? WHERE cpf = ?");
            st.setString(1, jogador.getName());
            st.setInt(2, jogador.getNumero());
            st.setString(3, jogador.getPosicao());
            st.setString(4, cpf);
            
            st.executeUpdate();
            
        } catch (Exception e) {
        }
        
        
    }
    public static List<Jogador> listaTodosJogadores(){
        List<Jogador> list = new ArrayList<>();
        try {
            Connection conn = Conexao.getConnection();
            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM jogadores");
            while (rs.next()){
                list.add(new Jogador(rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getInt("numero"),
                        rs.getString("posicao")));
            }
        return list;

        } catch (SQLException e){
            System.out.println(e.getMessage());
            return null;
        }

    }
        
}
