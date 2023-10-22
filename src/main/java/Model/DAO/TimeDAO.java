package Model.DAO;

import Model.Time;
import db.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TimeDAO {

    public static void cadastrarTime(Time time) {

        Connection conn = Conexao.getConnection();
        PreparedStatement st = null;

        try {

            st = conn.prepareStatement("INSERT INTO Time "
                    + "(nome, pontos)"
                    + " VALUES(?, ?)");
            st.setString(1, time.getNome());
            st.setInt(2, time.getPontos());
            st.executeUpdate();

        } catch (Exception e) {

        }
    }

    public static List<Time> todosOsTimes() {

        Connection conn = Conexao.getConnection();
        PreparedStatement st = null;
        ResultSet rs = null;

        List<Time> lista = new ArrayList<>();

        try {
            st = conn.prepareStatement("SELECT * FROM Time");
            rs = st.executeQuery();
            while (rs.next()) {
                lista.add(new Time(rs.getInt("id_time"),
                        rs.getString("nome"),
                        rs.getInt("pontos")));
            }
            return lista;
        } catch (Exception e) {

        }
        return null;
    }

    public static void associarJogador(int id_time, int id_jogador) {

        Connection conn = Conexao.getConnection();
        PreparedStatement st = null;

        try {

            st = conn.prepareStatement("INSERT INTO Jogador_Time"
                    + "(id_time, id_jogador)"
                    + "VALUES"
                    + "(?, ?)");
            st.setInt(1, id_time);
            st.setInt(2, id_jogador);
            
            st.executeUpdate();
            
        } catch (Exception e) {
        }
    }
    public static List<Integer> carregarJogadores(Time time){
        
        List<Integer> lista = new ArrayList<>();
        Connection conn = Conexao.getConnection();
        PreparedStatement st = null;
        ResultSet rs = null;
        
        try {
            st = conn.prepareStatement("SELECT id_jogador FROM Jogador_Time WHERE id_time = ? ");
            st.setInt(1, time.getId_time());
            rs = st.executeQuery();
            
            while(rs.next()){
                lista.add(rs.getInt("id_jogador"));
            }
            
            return lista;
        } catch (Exception e) {
        }
        return null;
    }
    public static boolean jaAssociado(Time time){
        
        Connection conn = Conexao.getConnection();
        PreparedStatement st = null;
        ResultSet rs = null;
        
        try {
            st = conn.prepareStatement("SELECT * FROM Jogador_Time WHERE id_time = ?");
            st.setInt(1, time.getId_time());
            
            rs = st.executeQuery();
            
            if(rs.next()){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
        }
        return false;
    }
    public static void deletarTime(int id_time){
        
        Connection conn = Conexao.getConnection();
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("DELETE * FROM Jogador_Time WHERE id_time = ?");
            st.setInt(1, id_time);
            st.executeUpdate();
        } catch (Exception e) {
        }
    }
}
