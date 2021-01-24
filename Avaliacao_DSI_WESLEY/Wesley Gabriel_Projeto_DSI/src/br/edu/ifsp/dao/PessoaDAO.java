package br.edu.ifsp.dao;

import br.edu.ifsp.conexao.Conexao;
import br.edu.ifsp.modelo.Pessoa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PessoaDAO {

    public Conexao con = null;
    ResultSet rs;

    public void salvarPessoa(Pessoa pessoa) {

        try {
            this.con = Conexao.getInstance();

            String sql = "INSERT INTO pessoa (nomecompleto, idade) VALUES (?, ?)";
            PreparedStatement pstm = con.getConexao().prepareStatement(sql);
            pstm.setInt(2, pessoa.getIdade());
            pstm.setString(1, pessoa.getNome());
            pstm.executeUpdate();

            System.out.println("Pessoa inserida!!");
            JOptionPane.showMessageDialog(null, "Pessoa inserida");
            
        } catch (SQLException e) {
            System.err.println("Erro,ao inserir uma pessoa");
            JOptionPane.showMessageDialog(null, "Pessoa inserida");
            e.printStackTrace();
        }
    }

    public ArrayList<Pessoa> consultarTodos() {

        ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
        try {
            this.con = Conexao.getInstance();
            String sql = "SELECT * FROM pessoa";

            PreparedStatement pstm = con.getConexao().prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                Pessoa p = new Pessoa();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nomecompleto"));
                p.setIdade(rs.getInt("idade"));

                listaPessoas.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaPessoas;
    }

    public void removerID(Pessoa p) {

        try {
            this.con = Conexao.getInstance();
            String sql = "DELETE FROM pessoa WHERE id = ?";
            PreparedStatement pstm = con.getConexao().prepareStatement(sql);
            pstm.setInt(1, p.getId());

            pstm.executeUpdate();
            System.out.println("Identificação removida com sucesso");
            JOptionPane.showMessageDialog(null, "Identificação removida com sucesso");

        } catch (SQLException e) {
            System.out.println("Erro! Remoção negada");
            JOptionPane.showMessageDialog(null, "Erro! Remoção negada");
            e.printStackTrace();
        }
    }

    public void updateId(Pessoa p) {

        try {
            this.con = Conexao.getInstance();
            String sql = "UPDATE pessoa SET "
                    + "nomecompleto = ?, "
                    + "idade = ? "
                    + "WHERE id = ? ";
            PreparedStatement pstm = con.getConexao().prepareStatement(sql);
            pstm.setString(1, p.getNome());
            pstm.setInt(2, p.getIdade());
            pstm.setInt(3, p.getId());
            pstm.executeUpdate();

            System.out.println("Pessoa atualizada com sucesso");
            JOptionPane.showMessageDialog(null, "Pessoa atualizada com sucesso");

        } catch (SQLException e) {
            System.out.println("Erro! Atualização negada");
            JOptionPane.showMessageDialog(null, "Erro! Atualização negada");
            e.printStackTrace();

        }
    }

    public Pessoa consultarId(int id) {

        Pessoa p = new Pessoa();

        try {

            this.con = Conexao.getInstance();
            String sql = "SELECT * FROM pessoa WHERE id = ?";

            PreparedStatement pstm = con.getConexao().prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nomecompleto"));
                p.setIdade(rs.getInt("idade"));
            }
        } catch (SQLException e) {
            System.out.println("Erro! Identificação não encontrada");
            JOptionPane.showMessageDialog(null, "Erro! Identificação naõ encontrada");
            e.printStackTrace();
        }

        return p;
    }
}
