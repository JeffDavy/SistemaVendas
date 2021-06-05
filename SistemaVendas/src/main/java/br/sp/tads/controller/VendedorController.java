package br.sp.tads.controller;

import br.sp.senac.tads.model.Vendedor;
import br.sp.tads.dao.VendedorDAO;
import java.util.ArrayList;

/**
 *
 * @author Jeferson Davi
 */
public class VendedorController {

    public VendedorController() {
    }
    
    VendedorDAO vendedorDAO = new VendedorDAO();
    
    public boolean cadastrarController(Vendedor vendedorBean) {
        
        boolean status = false;
        
        return status = vendedorDAO.cadastrar(vendedorBean);
        
    }
    
    public boolean editarController(Vendedor vendedorBean) {
        
        boolean status = false;
        
        return status = vendedorDAO.editar(vendedorBean);
        
    }
    
    public boolean statusController(Vendedor vendedorBean) {
        
        boolean status = false;
        
        return status = vendedorDAO.desativarAtivar(vendedorBean);
        
    }
    
    public ArrayList<Vendedor> consultarController(Vendedor vendedorBean) {
        
        ArrayList<Vendedor> listaVendedor = new ArrayList<Vendedor>();
        
        return listaVendedor = vendedorDAO.consultar(vendedorBean);
        
    }
    
    public ArrayList<Vendedor> listarController(Vendedor vendedorBean) {
        
        ArrayList<Vendedor> listaVendedor = new ArrayList<Vendedor>();
        
        return listaVendedor = vendedorDAO.listar(vendedorBean);
        
    }
    
    public ArrayList<Vendedor> listarNomeController(Vendedor vendedorBean) {
        
        ArrayList<Vendedor> listaVendedor = new ArrayList<Vendedor>();
        
        return listaVendedor = vendedorDAO.listarNome(vendedorBean);
        
    }
    
    public int pegarIdController(int cod) {
        
        int cpf;
        
        return cpf = vendedorDAO.pegarId(cod);
        
    }
    
}
