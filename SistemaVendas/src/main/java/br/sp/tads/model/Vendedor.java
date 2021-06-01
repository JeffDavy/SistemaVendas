package br.sp.tads.model;

import br.sp.tads.classeMae.Pessoa;
import br.sp.tads.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Jeferson Davi
 */
public class Vendedor  extends Pessoa {
    
    Connection conexao;

    /**
     * Driver do MySQL a partir da versão 8.0
     */
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    
    /**
     * MÉTODOS COM ACESSO AO BANCO DE DADOS
     */

    /**
     * CADASTRO DE CLIENTE
     * @param vendedorBean
     * @return boolean
     */
    public boolean cadastrar(Vendedor vendedorBean) {

        boolean status = false;

        try {

            Class.forName(DRIVER);
            conexao = Conexao.abrirConexao();

            String sql = "insert into Vendedores (nome, cpf, dataNascimento, email, contato1, contato2, usuario, senha) values (?,?,?,?,?,?,?,?)";

            PreparedStatement instrucaoSQL = conexao.prepareStatement(sql);

            instrucaoSQL.setString(1, vendedorBean.getNome());
            instrucaoSQL.setString(2, vendedorBean.getCpf());
            instrucaoSQL.setString(3, vendedorBean.getDataNascimento());
            instrucaoSQL.setString(4, vendedorBean.getEmail());
            instrucaoSQL.setString(5, vendedorBean.getContato1());
            instrucaoSQL.setString(6, vendedorBean.getContato2());
            instrucaoSQL.setString(7, vendedorBean.getUsuario());
            instrucaoSQL.setString(8, vendedorBean.getSenha());


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
     * EDIÇÃO DE CLIENTE
     * @param vendedorBean
     * @return boolean
     */
    public boolean editar(Vendedor vendedorBean) {

        boolean status = false;

        try {

            Class.forName(DRIVER);
            conexao = Conexao.abrirConexao();

            String sql = "update Vendedores set nome = ?, dataNascimento = ?, email = ?, contato1 = ?, contato2 = ?, usuario = ?, senha = ? where  cpf = ?";

            PreparedStatement instrucaoSQL = conexao.prepareStatement(sql);

            instrucaoSQL.setString(1, vendedorBean.getNome());
            instrucaoSQL.setString(2, vendedorBean.getDataNascimento());
            instrucaoSQL.setString(3, vendedorBean.getEmail());
            instrucaoSQL.setString(4, vendedorBean.getContato1());
            instrucaoSQL.setString(5, vendedorBean.getContato2());
            instrucaoSQL.setString(6, vendedorBean.getUsuario());
            instrucaoSQL.setString(7, vendedorBean.getSenha());
            instrucaoSQL.setString(8, vendedorBean.getCpf());
 

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
     * DESATIVAÇÃO e ATIVAÇÃO DE VENDEDOR
     * @param vendedorBean
     * @return boolean
     */
    public boolean desativarAtivar(Vendedor vendedorBean) {

        boolean status = false;

        try {

            Class.forName(DRIVER);
            conexao = Conexao.abrirConexao();

            String sql = "update Vendedores set estadoAtual = ? where cpf = ?";

            PreparedStatement instrucaoSQL = conexao.prepareStatement(sql);

            instrucaoSQL.setString(1, vendedorBean.getEstadoAtual());
            instrucaoSQL.setString(2, vendedorBean.getCpf());

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
    
    
    /** CONSULTAR 1 CLIENTE
     * @param vendedorBean
     * @return ArrayList
     */
    public ArrayList<Vendedor> consultar(Vendedor vendedorBean) {

        ResultSet rs = null;
        PreparedStatement instrucaoSQL = null;
        
        ArrayList<Vendedor> listaVendedor = new ArrayList<Vendedor>();
        
        try {
            
            Class.forName(DRIVER);
            conexao = Conexao.abrirConexao();

            String sql = "select * from Vendedores where cpf = ?";
            
            instrucaoSQL = conexao.prepareStatement(sql);

            instrucaoSQL.setString(1, vendedorBean.getCpf());
            
            rs = instrucaoSQL.executeQuery();
            
            while (rs.next()) {
                
                Vendedor vendedor = new Vendedor();
                
                vendedor.setCodVendedor(rs.getInt("codVendedor"));
                vendedor.setNome(rs.getString("nome"));
                vendedor.setCpf(rs.getString("cpf"));
                vendedor.setDataNascimento(rs.getString("dataNascimento"));
                vendedor.setEmail(rs.getString("email"));
                vendedor.setContato1(rs.getString("contato1"));
                vendedor.setContato2(rs.getString("contato2"));
                vendedor.setUsuario(rs.getString("usuario"));
                vendedor.setSenha(rs.getString("senha"));
                vendedor.setTipo(rs.getString("tipo"));
                vendedor.setEstadoAtual(rs.getString("estadoAtual"));
                vendedor.setComissao(rs.getDouble("comissao"));

                
                listaVendedor.add(vendedor);
                
            }
            
        } catch (Exception e) {
        }
        
        return listaVendedor;
        
    }
    
    
    /** LISTAR TODOS OS CLIENTES
     * @param vendedorBean
     * @return ArrayList
     */
    public ArrayList<Vendedor> listar(Vendedor vendedorBean) {

        ResultSet rs = null;
        PreparedStatement instrucaoSQL = null;
        
        ArrayList<Vendedor> listaVendedor = new ArrayList<Vendedor>();
        
        try {
            
            Class.forName(DRIVER);
            conexao = Conexao.abrirConexao();

            String sql = "select * from Vendedores where estadoAtual = ?";
            
            instrucaoSQL = conexao.prepareStatement(sql);
            
            instrucaoSQL.setString(1, vendedorBean.getEstadoAtual());
           
            rs = instrucaoSQL.executeQuery();
            
            while (rs.next()) {
                
                Vendedor vendedor = new Vendedor();
                
                vendedor.setCodVendedor(rs.getInt("codVendedor"));
                vendedor.setNome(rs.getString("nome"));
                vendedor.setCpf(rs.getString("cpf"));
                vendedor.setDataNascimento(rs.getString("dataNascimento"));
                vendedor.setEmail(rs.getString("email"));
                vendedor.setContato1(rs.getString("contato1"));
                vendedor.setContato2(rs.getString("contato2"));
                vendedor.setUsuario(rs.getString("usuario"));
                vendedor.setSenha(rs.getString("senha"));
                vendedor.setTipo(rs.getString("tipo"));
                vendedor.setEstadoAtual(rs.getString("estadoAtual"));
                vendedor.setComissao(rs.getDouble("comissao"));
                
                listaVendedor.add(vendedor);
                
            }
            
        } catch (Exception e) {
        }
        
        return listaVendedor;
        
    }
    
    
    /** PEGAR CÓDIGO DO VENDEDOR
     * @param cod
     * @return int
     */
    @Override
    public int pegarId(int cod) {
        
        ResultSet rs = null;
        PreparedStatement instrucaoSQL = null;
        
        int id = 0;
        
        try {
            
            Class.forName(DRIVER);
            conexao = Conexao.abrirConexao();

            String sql = "select codCliente from Vendedores where cpf = ?";
            
            instrucaoSQL = conexao.prepareStatement(sql);

            instrucaoSQL.setInt(1, cod);
            
            rs = instrucaoSQL.executeQuery();
            
            while (rs.next()) {
                
                id = rs.getInt("codVendedor");
                
            }
            
        } catch (Exception e) {
        }
        
        return id;

    }
    
    
    
    /** GETTERS E SETTERS */
    
    public Vendedor(String nome, String email, String contato1, String contato2, String usuario, String senha, String tipo, String estadoAtual) {
        super(nome, email, contato1, contato2, usuario, senha, tipo, estadoAtual);
    }

    public Vendedor() {
    }

    private int codVendedor;
    private String cpf;
    private String dataNascimento;
    private double comissao;

    public int getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(int codVendedor) {
        this.codVendedor = codVendedor;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContato1() {
        return contato1;
    }

    public void setContato1(String contato1) {
        this.contato1 = contato1;
    }

    public String getContato2() {
        return contato2;
    }

    public void setContato2(String contato2) {
        this.contato2 = contato2;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(String estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    

       
}
