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

public class JogadorDAO {

    public static boolean verificaCadastro(Jogador jogador) {
        Connection conn = Conexao.getConnection();
        PreparedStatement st;
        ResultSet rs;

        try {
            st = conn.prepareStatement("SELECT cpf FROM Jogador WHERE cpf = ?");
            st.setString(1, jogador.getCpf());
            rs = st.executeQuery();

            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static Long inserirJogador(Jogador jogador) {
        Connection conn = Conexao.getConnection();
        Long idGerado = -1L;

        try {
            PreparedStatement st = conn.prepareStatement("INSERT INTO Jogador"
                    + "(nome, cpf, numero, posicao, senha, situacao)"
                    + "VALUES"
                    + "(?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            st.setString(1, jogador.getNome());
            st.setString(2, jogador.getCpf());
            st.setShort(3, (short) jogador.getNumero());
            st.setString(4, jogador.getPosicao());
            st.setString(5, jogador.getSenha());
            st.setBoolean(6, true);

            int linhasAfetadas = st.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();

                if (rs.next()) {
                    idGerado = rs.getLong(1);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return idGerado;
    }

    public static boolean verificarJogador(String cpf, String senha) {

        Connection conn = Conexao.getConnection();
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement("SELECT cpf, senha FROM Jogador WHERE cpf = ? AND senha = ?");
            st.setString(1, cpf);
            st.setString(2, senha);
            rs = st.executeQuery();

            if (rs.next()) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean excluirJogador(String cpf, String senha) {
        Connection conn = Conexao.getConnection();
        PreparedStatement st = null;

        try {
            st = conn.prepareStatement("DELETE FROM jogador WHERE cpf = ? AND senha = ?");
            st.setString(1, cpf);
            st.setString(2, senha);

            int linhasExcluidas = st.executeUpdate();

            if (linhasExcluidas == 1) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static Jogador buscarCpf(String cpf) {

        Connection conn = Conexao.getConnection();
        PreparedStatement st = null;
        ResultSet rs;
        Jogador jogador = null;

        try {
            st = conn.prepareStatement("SELECT id_jogador, nome, numero, posicao, situacao FROM Jogador WHERE cpf = ?");
            st.setString(1, cpf);
            rs = st.executeQuery();

            if (rs.next()) {
                Long id = rs.getLong("id_jogador");
                String nome = rs.getString("nome");
                short numero = rs.getShort("numero");
                String posicao = rs.getString("posicao");
                boolean situacao = rs.getBoolean("situacao");
                jogador = new Jogador(id, nome, numero, posicao, situacao);
            }
            return jogador;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return jogador;
    }

    public static void atualizarJogador(String cpf, Jogador jogador) {

        Connection conn = Conexao.getConnection();
        PreparedStatement st;

        try {
            st = conn.prepareStatement("UPDATE Jogador SET nome = ?, numero = ?, posicao = ?, situacao = ? WHERE cpf = ?");
            st.setString(1, jogador.getNome());
            st.setShort(2, (short) jogador.getNumero());
            st.setString(3, jogador.getPosicao());
            st.setBoolean(4, jogador.isSituacao());
            st.setString(5, cpf);

            st.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<Jogador> listaTodosJogadores() {
        List<Jogador> list = new ArrayList<>();
        Connection conn = Conexao.getConnection();

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Jogador");
            while (rs.next()) {
                list.add(new Jogador(rs.getLong("id_jogador"),
                        rs.getString("nome"),
                        null,
                        rs.getShort("numero"),
                        rs.getString("posicao"),
                        null,
                        rs.getBoolean("situacao")));
            }
            return list;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<Jogador> consultarPelaPosicao(String posicao) {

        List<Jogador> lista = new ArrayList<>();

        Connection conn = Conexao.getConnection();
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement("SELECT id_jogador, nome, numero, posicao, situacao FROM Jogador WHERE posicao = ?");
            st.setString(1, posicao);
            rs = st.executeQuery();
            while (rs.next()) {
                lista.add(new Jogador(rs.getLong("id_jogador"),
                        rs.getString("nome"),
                        rs.getShort("numero"),
                        rs.getString("posicao"),
                        rs.getBoolean("situacao")));
            }

            return lista;

        } catch (Exception e) {

        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static boolean numeroJaCadastrado(int numero) {

        Connection conn = Conexao.getConnection();
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement("SELECT numero FROM jogador WHERE numero = ?");
            st.setInt(1, numero);
            rs = st.executeQuery();

            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static Jogador encontrarPeloId(Long id) {
        Connection conn = Conexao.getConnection();
        PreparedStatement st = null;
        ResultSet rs = null;
        Jogador jogador = null;

        try {
            st = conn.prepareStatement("SELECT * FROM Jogador WHERE id_jogador = ?");
            st.setLong(1, id);
            rs = st.executeQuery();

            while (rs.next()) {
                jogador = new Jogador(rs.getLong("id_jogador"),
                        rs.getString("nome"),
                        rs.getString("cpf"),
                        rs.getShort("numero"),
                        rs.getString("posicao"),
                        rs.getString("senha"),
                        rs.getBoolean("situacao"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return jogador;
    }

    public static void atualizarGols(Jogador jogador) {
        Connection conn = Conexao.getConnection();
        PreparedStatement st = null;

        try {
            st = conn.prepareStatement("UPDATE jogador SET gols = gols + ? WHERE id_jogador = ?");
            st.setShort(1, jogador.getGolsMarcados());
            st.setLong(2, jogador.getId());

            st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void addMelhorJogador(Jogador jogador) {
        Connection conn = Conexao.getConnection();
        PreparedStatement st = null;

        try {
            st = conn.prepareStatement("UPDATE jogador SET titulos_melhor_jogador = titulos_melhor_jogador + 1 WHERE id_jogador = ?");
            st.setLong(1, jogador.getId());

            st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void addMelhorGol(Jogador jogador) {
        Connection conn = Conexao.getConnection();
        PreparedStatement st = null;

        try {
            st = conn.prepareStatement("UPDATE jogador SET titulos_melhor_gol = titulos_melhor_gol + 1 WHERE id_jogador = ?");
            st.setLong(1, jogador.getId());

            st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static Jogador obterJogadorPorNumero(short numero) {

        Connection conn = Conexao.getConnection();
        PreparedStatement st = null;
        ResultSet resultSet = null;

        try {
            st = conn.prepareStatement("SELECT * FROM jogador WHERE numero = ?");
            
           
            st.setLong(1, numero);

            resultSet = st.executeQuery();

            if (resultSet.next()) {
                Long id = resultSet.getLong("id_jogador");
                String nome = resultSet.getString("nome");
                String cpf = resultSet.getString("cpf");
                String posicao = resultSet.getString("posicao");
                boolean situacao = resultSet.getBoolean("situacao");

                return new Jogador(id, nome, numero, cpf, posicao, situacao);
            }
        } catch (SQLException e) {
           
            e.printStackTrace();
        } finally {
        }

        return null;
    }

}
