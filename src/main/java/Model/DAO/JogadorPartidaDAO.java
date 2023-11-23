package Model.DAO;

import Model.Jogador;
import Model.JogadorPartida;
import db.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JogadorPartidaDAO {

    public static void criarRegistro(Long id) {
        Connection conn = Conexao.getConnection();
        PreparedStatement st = null;

        try {
            st = conn.prepareStatement("INSERT INTO jogador_partida "
                    + "(id_jogador, titulos_melhor_jogador, titulos_melhor_gol, gols)"
                    + " VALUES "
                    + "(?, ?, ?, ?)");
            st.setLong(1, id);
            st.setShort(2, (short) 0);
            st.setShort(3, (short) 0);
            st.setShort(4, (short) 0);

            st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fechar recursos (PreparedStatement e Connection) aqui
        }
    }

    public static void atualizarGols(JogadorPartida jogador) {
        Connection conn = Conexao.getConnection();
        PreparedStatement st = null;

        try {
            st = conn.prepareStatement("UPDATE jogador_partida SET gols = gols + ? WHERE id_jogador = ?");
            st.setShort(1, jogador.getGolsMarcados());
            st.setLong(2, jogador.getJogador().getId());

            st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void addMelhorGol(Jogador jogador) {
        Connection conn = Conexao.getConnection();
        PreparedStatement st = null;

        try {
            st = conn.prepareStatement("UPDATE jogador_partida SET titulos_melhor_gol = titulos_melhor_gol + 1 WHERE id_jogador = ?");
            st.setLong(1, jogador.getId());

            st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void addMelhorJogador(Jogador jogador) {
        Connection conn = Conexao.getConnection();
        PreparedStatement st = null;

        try {
            st = conn.prepareStatement("UPDATE jogador_partida SET titulos_melhor_jogador = titulos_melhor_jogador + 1 WHERE id_jogador = ?");
            st.setLong(1, jogador.getId());

            st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static List<JogadorPartida> todosOsRegistros() {
    List<JogadorPartida> lista = new ArrayList<>();
    Connection conn = Conexao.getConnection();
    PreparedStatement st = null;
    ResultSet rs = null;

    try {
        st = conn.prepareStatement("SELECT jp.*, j.nome FROM jogador_partida jp INNER JOIN jogador j ON jp.id_jogador = j.id_jogador");
        rs = st.executeQuery();

        while (rs.next()) {
            Long idJogador = rs.getLong("id_jogador");
            String nomeJogador = rs.getString("nome");
            short titulosMelhorJogador = rs.getShort("titulos_melhor_jogador");
            short titulosMelhorGol = rs.getShort("titulos_melhor_gol");
            short gols = rs.getShort("gols");

            Jogador jogador = new Jogador(idJogador, nomeJogador);
            JogadorPartida jogadorPartida = new JogadorPartida(jogador, gols, titulosMelhorJogador, titulosMelhorGol );
            lista.add(jogadorPartida);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
    }

    return lista;
}

}
