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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartidaDAO {

    public static int adicionarPartida(Partida partida) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Connection conn = Conexao.getConnection();
        PreparedStatement st = null;
        ResultSet chaveGerada = null;
        int id_partida = 0;

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
                id_partida = chaveGerada.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id_partida;
    }

    public static int associarTimePartida(int id_partida, int id_time, int gols) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
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
        return 0;
    }

    public static List<Partida> todasAsPartidas() {
    List<Partida> listaPartidas = new ArrayList<>();
    Connection conn = Conexao.getConnection();

    try {
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT p.id_partida, p.data, p.melhor_jogador, p.melhor_gol, pt.id_time, pt.gols, t.nome "
                + "FROM partida p "
                + "INNER JOIN partida_time pt ON p.id_partida = pt.id_partida "
                + "INNER JOIN time t ON pt.id_time = t.id_time");

        Partida partidaExistente = null;

        while (rs.next()) {
            long idPartida = rs.getLong("id_partida");

            if (partidaExistente == null || partidaExistente.getId_partida() != idPartida) {
                partidaExistente = new Partida();
                partidaExistente.setId_partida(idPartida);
                partidaExistente.setData(rs.getDate("data"));
                partidaExistente.setMelhor_jogador(rs.getString("melhor_jogador"));
                partidaExistente.setMelhor_gol(rs.getString("melhor_gol"));
                listaPartidas.add(partidaExistente);
            }

            int gols = rs.getInt("gols");
            int idTime = rs.getInt("id_time");
            String nomeTime = rs.getString("nome");

            Time time = new Time();
            time.setId_time(idTime);
            time.setNome(nomeTime);

            if (partidaExistente.getTimeCasa() == null) {
                partidaExistente.setTimeCasa(time);
                partidaExistente.setGolsTimeCasa((byte) gols);
            } else {
                partidaExistente.setTimeVisitante(time);
                partidaExistente.setGolsTimeVisitante((byte) gols);
            }
        }

        conn.close();
    } catch (Exception e) {
        e.printStackTrace();
    }

    return listaPartidas;
}
}
