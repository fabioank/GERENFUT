package Model.DAO;

import Model.Time;
import db.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class TimeDAO {
    
    
    public static void cadastrarTime(Time time){
        
        Connection conn = Conexao.getConnection();
        PreparedStatement st = null;
        
        try {
            
            st = conn.prepareStatement("INSERT INTO Time " +
                    "(nome)" +
                    " VALUES(?)");
            st.setString(1, time.getNome());
            
        } catch (Exception e) {
            
        }
    }
}
