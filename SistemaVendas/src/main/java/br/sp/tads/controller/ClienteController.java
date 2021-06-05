package br.sp.tads.controller;

import br.sp.senac.tads.model.Cliente;
import br.sp.tads.dao.ClienteDAO;
import java.util.ArrayList;

/**
 *
 * @author Jeferson Davi
 */
public class ClienteController {

    public ClienteController() {
    }
    
    ClienteDAO clienteDAO = new ClienteDAO();
    
    public  boolean cadastrarController(Cliente clienteBean) {
        
       boolean status = false;
       
       status = clienteDAO.cadastrar(clienteBean);
       
       return status;
        
    }
    
    public  boolean editarController(Cliente clienteBean) {
        
       boolean status = false;
       
       return status = clienteDAO.editar(clienteBean);
        
    }
    
    public  boolean statusController(Cliente clienteBean) {
        
       boolean status = false;
       
       return status = clienteDAO.desativarAtivar(clienteBean);
        
    }
    
    public ArrayList<Cliente> consultarController(Cliente clienteBean) {
        
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        
        return listaCliente = clienteDAO.consultar(clienteBean);
        
    }
    
    public ArrayList<Cliente> listarController(Cliente clienteBean) {
        
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        
        return listaCliente = clienteDAO.listar(clienteBean);
        
    }
    
    public ArrayList<Cliente> listarNomeController(Cliente clienteBean) {
        
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        
        return listaCliente = clienteDAO.listarNome(clienteBean);
        
    }
    
    public int pegarIdController(int cod) {
        
        int codigo;
        
        return codigo = clienteDAO.pegarId(cod);
        
    }
    
}
