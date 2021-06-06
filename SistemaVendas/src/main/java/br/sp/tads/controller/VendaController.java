package br.sp.tads.controller;

import br.sp.senac.tads.model.Venda;
import br.sp.tads.dao.VendaDAO;

/**
 *
 * @author Administrador
 */
public class VendaController {
    
    public VendaController() {
    }
    
    VendaDAO vendaDAO = new VendaDAO();
    
    
    public boolean realizarVendaController(Venda vendaBean) {
        
        return vendaDAO.registrarVenda(vendaBean);
        
    }
    
}
