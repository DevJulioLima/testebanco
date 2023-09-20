package repositorio;

import conexao.Conexao;
import entidade.Pessoa;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Teste {
    public void cadastrarPessoa(Pessoa pessoa){
        String sql = "INSERT INTO PESSOA (CPF, NOME,  RG,  TELEFONE, EMAIL) VALUES (?, ?, ?, ?, ?);";

        PreparedStatement ps = null;
        try{
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, pessoa.getCpf());
            ps.setString(2 , pessoa.getNome());
            ps.setInt(3, pessoa.getRg());
            ps.setInt(4, pessoa.getTelefone());
            ps.setString(5, pessoa.getEmail());

            ps.execute();
            ps.close();

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
