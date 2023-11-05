package Model.DAO;

import Model.Partida;
import Model.Time;
import db.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class PartidaDAO {

    public static int adicionarPartida(Partida partida) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Connection conn = Conexao.getConnection();
        PreparedStatement st = null;
        ResultSet chaveGerada = null;

        try {
            st = conn.prepareStatement("INSERT INTO partida"
                    + "(data, melhor_jogador, melhor_gol)"
                    + "VALUES"
                    + "(?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            st.setDate(1, java.sql.Date.valueOf(sdf.format(partida.getData())));
            st.setString(2, partida.getMelhor_jogador());
            st.setString(3, partida.getMelhor_gol());

            st.executeUpdate();
            
            chaveGerada = st.getGeneratedKeys();
            if (chaveGerada.next()) {
                int id_partida = chaveGerada.getInt(1);
                return id_partida;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    public static void associarTimePartida(int id_partida,int id_time,int gols) {
        Connection conn = Conexao.getConnection();
        PreparedStatement st = null;
        ResultSet chaveGerada = null;

        try {
            st = conn.prepareStatement("INSERT INTO partida_time"
                    + "(id_partida, id_time, gols)"
                    + "VALUES"
                    + "(?, ?, ?)");
            st.setInt(1, id_partida);
            st.setInt(2, id_time);
            st.setInt(3, gols);
            
            st.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Partida> todasAsPartidas() {
        List<Partida> listaPartidas = new ArrayList<>();
        Connection conn = Conexao.getConnection();

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM partida");
            while (rs.next()) {

                Time timeCasa = new Time(rs.getString("time_1"));
                Time timeVisitante = new Time(rs.getString("time_2"));

                listaPartidas.add(new Partida(
                        rs.getLong("id_partida"),
                        rs.getDate("data"),
                        rs.getByte("gols_time_1"),
                        rs.getByte("gols_time_2"),
                        rs.getString("melhor_jogador"),
                        rs.getString("melhor_gol"),
                        timeCasa,
                        timeVisitante));
            }
            conn.close(); // Não esqueça de fechar a conexão quando não for mais utilizada.
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaPartidas;
    }

    public static void addRanking(Long id_jogador, short gols_marcados, short melhor_jogador, short melhor_gol) {

        Connection conn = Conexao.getConnection();
        PreparedStatement st = null;

        try {
            st = conn.prepareStatement("INSERT INTO ranking"
                    + "(id_jogador, gols_marcados, melhor_jogador, melhor_gol)"
                    + "VALUES"
                    + "(?, ?, ?, ?)");

            st.setLong(1, id_jogador);
            st.setShort(2, gols_marcados);
            st.setShort(3, melhor_jogador);
            st.setShort(4, melhor_gol);

            st.executeUpdate();

        } catch (Exception e) {
        }
    }

}
