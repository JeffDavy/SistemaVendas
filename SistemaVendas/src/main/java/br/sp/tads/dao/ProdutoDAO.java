package br.sp.tads.dao;

import br.sp.senac.tads.model.Produto;
import br.sp.tads.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Jeferson Davi
 */
public class ProdutoDAO {
    
    Connection conexao;

    /**
     * Driver do MySQL a partir da versão 8.0
     */
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    
    /**
     * CADASTRO DE PRODUTO
     * @param prodBean
     * @return boolean
     */
    public boolean cadastrarProduto(Produto prodBean) {
        
        boolean status = false;
        
        try {
            
            Class.forName(DRIVER);
            conexao = Conexao.abrirConexao();

            String sql = "insert into Produtos (nome, valor, unidade, descricao, imagem) values (?,?,?,?,?)";

            PreparedStatement instrucaoSQL = conexao.prepareStatement(sql);

            instrucaoSQL.setString(1, prodBean.getNome());
            instrucaoSQL.setDouble(2, prodBean.getValor());
            instrucaoSQL.setString(3, prodBean.getUnidade());
            instrucaoSQL.setString(4, prodBean.getDescricao());
            instrucaoSQL.setString(5, prodBean.getImagem());
      
            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                status = true;

            } else {
                throw new Exception();

            }
            
        } catch (Exception e) {
        }
        
        return status;
        
    }
    
    
    /**
     * EDIÇÃO DE PRODUTO
     * @param prodBean
     * @return boolean
     */
    public boolean editarProduto(Produto prodBean) {

        boolean status = false;

        try {

            Class.forName(DRIVER);
            conexao = Conexao.abrirConexao();

            String sql = "update Produtos set nome = ?, valor = ?, unidade = ?, descricao = ?, imagem = ? where codProduto = ?";

            PreparedStatement instrucaoSQL = conexao.prepareStatement(sql);

            instrucaoSQL.setString(1, prodBean.getNome());
            instrucaoSQL.setDouble(2, prodBean.getValor());
            instrucaoSQL.setString(3, prodBean.getUnidade());
            instrucaoSQL.setString(4, prodBean.getDescricao());
            instrucaoSQL.setString(5, prodBean.getImagem());
            instrucaoSQL.setInt(6, prodBean.getCodProduto());
           
            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                status = true;

            } else {
                throw new Exception();

            }

        } catch (Exception e) {

        }

        return status;

    }
    
    
    /**
     * REMOÇÃO DE PRODUTO
     * @param prodBean
     * @return boolean
     */
    public boolean removerProduto(Produto prodBean) {

        boolean status = false;

        try {

            Class.forName(DRIVER);
            conexao = Conexao.abrirConexao();

            String sql = "delete from Produtos where codProduto = ?";

            PreparedStatement instrucaoSQL = conexao.prepareStatement(sql);

            instrucaoSQL.setInt(1, prodBean.getCodProduto());
           
            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                status = true;

            } else {
                throw new Exception();

            }

        } catch (Exception e) {

        }

        return status;

    }
    
    
    /** CONSULTAR 1 PRODUTO
     * @param prodBean
     * @return ArrayList
     */
    public ArrayList<Produto> consultarProduto(Produto prodBean) {

        ResultSet rs = null;
        PreparedStatement instrucaoSQL = null;
        
        ArrayList<Produto> listaProduto = new ArrayList<Produto>();
        
        try {
            
            Class.forName(DRIVER);
            conexao = Conexao.abrirConexao();

            String sql = "select * from Produtos where codProduto = ?";
            
            instrucaoSQL = conexao.prepareStatement(sql);

            instrucaoSQL.setInt(1, prodBean.getCodProduto());
            
            rs = instrucaoSQL.executeQuery();
            
            while (rs.next()) {
                
                Produto produto = new Produto();
                
                produto.setCodProduto(rs.getInt("codProduto"));
                produto.setNome(rs.getString("nome"));
                produto.setValor(rs.getDouble("valor"));
                produto.setUnidade(rs.getString("unidade"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setImagem(rs.getString("imagem"));

                listaProduto.add(produto);
                
            }
            
        } catch (Exception e) {
        }
        
        return listaProduto;
        
    }
    
    
    /** LISTAR TODOS OS PRODUTOS
     * @return ArrayList
     */
    public ArrayList<Produto> listarProduto() {

        ResultSet rs = null;
        PreparedStatement instrucaoSQL = null;
        
        ArrayList<Produto> listaProduto = new ArrayList<Produto>();
        
        try {
            
            Class.forName(DRIVER);
            conexao = Conexao.abrirConexao();

            String sql = "select * from Produtos";
            
            instrucaoSQL = conexao.prepareStatement(sql);
            
            rs = instrucaoSQL.executeQuery();
            
            while (rs.next()) {
                
                Produto produto = new Produto();
                
                produto.setCodProduto(rs.getInt("codProduto"));
                produto.setNome(rs.getString("nome"));
                produto.setValor(rs.getDouble("valor"));
                produto.setUnidade(rs.getString("unidade"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setImagem(rs.getString("imagem"));

                listaProduto.add(produto);
                
            }
            
        } catch (Exception e) {
        }
        
        return listaProduto;
        
    }
    
    /** LISTAR OS PRODUTOS POR NOME
     * @param prodBean
     * @return ArrayList
     */
    public ArrayList<Produto> listarNome(Produto prodBean) {

        ResultSet rs = null;
        PreparedStatement instrucaoSQL = null;
        
        ArrayList<Produto> listaProduto = new ArrayList<Produto>();
        
        try {
            
            Class.forName(DRIVER);
            conexao = Conexao.abrirConexao();

            String sql = "select * from Produtos where nome like ?";
            
            instrucaoSQL = conexao.prepareStatement(sql);

            instrucaoSQL.setString(1, prodBean.getNome() + "%");
            
            rs = instrucaoSQL.executeQuery();
            
            while (rs.next()) {
                
                Produto produto = new Produto();
                
                produto.setCodProduto(rs.getInt("codProduto"));
                produto.setNome(rs.getString("nome"));
                produto.setValor(rs.getDouble("valor"));
                produto.setUnidade(rs.getString("unidade"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setImagem(rs.getString("imagem"));

                listaProduto.add(produto);
                
            }
            
        } catch (Exception e) {
        }
        
        return listaProduto;
        
    }
    
       
    
}
