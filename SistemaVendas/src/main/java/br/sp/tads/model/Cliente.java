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
public class Cliente extends Pessoa {

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
     * @param clienteBean
     * @return boolean
     */
    public boolean cadastrar(Cliente clienteBean) {

        boolean status = false;

        try {

            Class.forName(DRIVER);
            conexao = Conexao.abrirConexao();

            String sql = "insert into Clientes (nomeFantasia, razaoSocial, cnpj, email, contato1, contato2, usuario, senha, rua, numero, bairro, cidade, estado, complemento) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement instrucaoSQL = conexao.prepareStatement(sql);

            instrucaoSQL.setString(1, clienteBean.getNomeFantasia());
            instrucaoSQL.setString(2, clienteBean.getNome());
            instrucaoSQL.setString(3, clienteBean.getCnpj());
            instrucaoSQL.setString(4, clienteBean.getEmail());
            instrucaoSQL.setString(5, clienteBean.getContato1());
            instrucaoSQL.setString(6, clienteBean.getContato2());
            instrucaoSQL.setString(7, clienteBean.getUsuario());
            instrucaoSQL.setString(8, clienteBean.getSenha());
            instrucaoSQL.setString(9, clienteBean.getRua());
            instrucaoSQL.setString(10, clienteBean.getNumero());
            instrucaoSQL.setString(11, clienteBean.getBairro());
            instrucaoSQL.setString(12, clienteBean.getCidade());
            instrucaoSQL.setString(13, clienteBean.getEstado());
            instrucaoSQL.setString(14, clienteBean.getComplemento());

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
     * @param clienteBean
     * @return boolean
     */
    public boolean editar(Cliente clienteBean) {

        boolean status = false;

        try {

            Class.forName(DRIVER);
            conexao = Conexao.abrirConexao();

            String sql = "update Clientes set nomeFantasia = ?, razaoSocial = ?, email = ?, contato1 = ?, contato2 = ?, usuario = ?, senha = ?, rua = ?, numero = ?, bairro = ?, cidade = ?, estado = ?, complemento = ? where cnpj = ?";

            PreparedStatement instrucaoSQL = conexao.prepareStatement(sql);

            instrucaoSQL.setString(1, clienteBean.getNomeFantasia());
            instrucaoSQL.setString(2, clienteBean.getNome());
            instrucaoSQL.setString(3, clienteBean.getEmail());
            instrucaoSQL.setString(4, clienteBean.getContato1());
            instrucaoSQL.setString(5, clienteBean.getContato2());
            instrucaoSQL.setString(6, clienteBean.getUsuario());
            instrucaoSQL.setString(7, clienteBean.getSenha());
            instrucaoSQL.setString(8, clienteBean.getRua());
            instrucaoSQL.setString(9, clienteBean.getNumero());
            instrucaoSQL.setString(10, clienteBean.getBairro());
            instrucaoSQL.setString(11, clienteBean.getCidade());
            instrucaoSQL.setString(12, clienteBean.getEstado());
            instrucaoSQL.setString(13, clienteBean.getComplemento());
            instrucaoSQL.setString(14, clienteBean.getCnpj());

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
     * DESATIVAÇÃO e ATIVAÇÃO DE CLIENTE
     * @param clienteBean
     * @return boolean
     */
    public boolean desativarAtivar(Cliente clienteBean) {

        boolean status = false;

        try {

            Class.forName(DRIVER);
            conexao = Conexao.abrirConexao();

            String sql = "update Clientes set estadoAtual = ? where cnpj = ?";

            PreparedStatement instrucaoSQL = conexao.prepareStatement(sql);

            instrucaoSQL.setString(1, clienteBean.getEstadoAtual());
            instrucaoSQL.setString(2, clienteBean.getCnpj());

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
     * @param clienteBean
     * @return ArrayList
     */
    public ArrayList<Cliente> consultar(Cliente clienteBean) {

        ResultSet rs = null;
        PreparedStatement instrucaoSQL = null;
        
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        
        try {
            
            Class.forName(DRIVER);
            conexao = Conexao.abrirConexao();

            String sql = "select * from Clientes where cnpj = ?";
            
            instrucaoSQL = conexao.prepareStatement(sql);

            instrucaoSQL.setString(1, clienteBean.getCnpj());
            
            rs = instrucaoSQL.executeQuery();
            
            while (rs.next()) {
                
                Cliente cliente = new Cliente();
                
                cliente.setCodCliente(rs.getInt("codCliente"));
                cliente.setNomeFantasia(rs.getString("nomeFantasia"));
                cliente.setNome(rs.getString("razaoSocial"));
                cliente.setCnpj(rs.getString("cnpj"));
                cliente.setEmail(rs.getString("email"));
                cliente.setContato1(rs.getString("contato1"));
                cliente.setContato2(rs.getString("contato2"));
                cliente.setUsuario(rs.getString("usuario"));
                cliente.setSenha(rs.getString("senha"));
                cliente.setTipo(rs.getString("tipo"));
                cliente.setEstadoAtual(rs.getString("estadoAtual"));
                cliente.setRua(rs.getString("rua"));
                cliente.setNumero(rs.getString("numero"));
                cliente.setBairro(rs.getString("bairro"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setEstado(rs.getString("estado"));
                cliente.setComplemento(rs.getString("complemento"));
                
                listaCliente.add(cliente);
                
            }
            
        } catch (Exception e) {
        }
        
        return listaCliente;
        
    }
    
    
    /** LISTAR TODOS OS CLIENTES
     * @param clienteBean
     * @return ArrayList
     */
    public ArrayList<Cliente> listar(Cliente clienteBean) {

        ResultSet rs = null;
        PreparedStatement instrucaoSQL = null;
        
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        
        try {
            
            Class.forName(DRIVER);
            conexao = Conexao.abrirConexao();

            String sql = "select * from Clientes where estadoAtual = ?";
            
            instrucaoSQL = conexao.prepareStatement(sql);
            
            instrucaoSQL.setString(1, clienteBean.getEstadoAtual());
           
            rs = instrucaoSQL.executeQuery();
            
            while (rs.next()) {
                
                Cliente cliente = new Cliente();
                
                cliente.setCodCliente(rs.getInt("codCliente"));
                cliente.setNomeFantasia(rs.getString("nomeFantasia"));
                cliente.setNome(rs.getString("razaoSocial"));
                cliente.setCnpj(rs.getString("cnpj"));
                cliente.setEmail(rs.getString("email"));
                cliente.setContato1(rs.getString("contato1"));
                cliente.setContato2(rs.getString("contato2"));
                cliente.setUsuario(rs.getString("usuario"));
                cliente.setSenha(rs.getString("senha"));
                cliente.setTipo(rs.getString("tipo"));
                cliente.setEstadoAtual(rs.getString("estadoAtual"));
                cliente.setRua(rs.getString("rua"));
                cliente.setNumero(rs.getString("numero"));
                cliente.setBairro(rs.getString("bairro"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setEstado(rs.getString("estado"));
                cliente.setComplemento(rs.getString("complemento"));
                
                listaCliente.add(cliente);
                
            }
            
        } catch (Exception e) {
        }
        
        return listaCliente;
        
    }
    
    
    /** PEGAR CÓDIGO DO CLIENTE
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

            String sql = "select codCliente from Clientes where cnpj = ?";
            
            instrucaoSQL = conexao.prepareStatement(sql);

            instrucaoSQL.setInt(1, cod);
            
            rs = instrucaoSQL.executeQuery();
            
            while (rs.next()) {
                
                id = rs.getInt("codCliente");
                
            }
            
        } catch (Exception e) {
        }
        
        return id;

    }
    
    
    

    /** GETTERS E SETTERS */
         
    public Cliente(String nome, String email, String contato1, String contato2, String usuario, String senha, String tipo, String estadoAtual) {
        super(nome, email, contato1, contato2, usuario, senha, tipo, estadoAtual);

    }
    
    public Cliente() {
    
    }

    private int codCliente;
    private String nomeFantasia;
    private String cnpj;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String complemento;

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
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
