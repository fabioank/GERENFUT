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
    
    
    public static void cadastrarTime(Time time){
        
        Connection conn = Conexao.getConnection();
        PreparedStatement st = null;
        
        try {
            
            st = conn.prepareStatement("INSERT INTO Time " +
                    "(nome, pontos)" +
                    " VALUES(?, ?)");
            st.setString(1, time.getNome());
            st.setInt(2, time.getPontos());
            st.executeUpdate();
            
        } catch (Exception e) {
            
        }
    }
    public static List<Time> todosOsTimes(){
        
        Connection conn = Conexao.getConnection();
        PreparedStatement st = null;
        ResultSet rs = null;
        
        List<Time> lista = new ArrayList<>();
        
        try {
            st = conn.prepareStatement("SELECT * FROM Time");
            rs = st.executeQuery();
            while(rs.next()){
                lista.add(new Time(rs.getInt("id_time"),
                        rs.getString("nome"),
                        rs.getInt("pontos")));
            }
            return lista;
        } catch (Exception e) {
            
        }
        return null;
    }
}
