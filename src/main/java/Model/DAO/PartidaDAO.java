package Model.DAO;

import Model.Partida;
import db.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

public class PartidaDAO {
    
    public static void adicionarPartida(Partida partida){
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Connection conn = Conexao.getConnection();
        PreparedStatement st = null;
        
        try {
            st = conn.prepareStatement("INSERT INTO partida" +
                    "(data, time_1, gols_time_1, time_2, gols_time_2, melhor_jogador, melhor_gol)" +
                    "VALUES" +
                    "(?, ?, ?, ?, ?, ?, ?)");
            st.setDate(1, java.sql.Date.valueOf(sdf.format(partida.getData())));
            st.setString(2, partida.getTimeCasa().getNome());
            st.setByte(3, partida.getGolsTimeCasa());
            st.setString(4, partida.getTimeVisitante().getNome());
            st.setByte(5, partida.getGolsTimeVisitante());
            st.setString(6, partida.getMelhor_jogador());
            st.setString(7, partida.getMelhor_gol());
            
            st.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
