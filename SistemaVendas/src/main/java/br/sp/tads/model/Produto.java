package br.sp.tads.model;

import br.sp.tads.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Jeferson Davi
 */
public class Produto {
    
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
    
    
    /** GETTERS E SETTERS */
    
    private int codProduto;
    private String nome;
    private double valor;
    private String unidade;
    private String descricao;
    private String imagem;

    public Produto() {
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    
    
    
}
