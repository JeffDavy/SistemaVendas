package teste;

import br.sp.senac.tads.model.Cliente;
import br.sp.tads.controller.ClienteController;
import br.sp.tads.dao.ClienteDAO;

/**
 *
 * @author Administrador
 */
public class Teste {
    
    public static void main(String[] args){
        
        ClienteDAO cli = new ClienteDAO();
        ClienteController cliControl = new ClienteController();
        Cliente clienteBean = new Cliente();
        
        clienteBean.setNomeFantasia("fantasia");
        clienteBean.setNome("scoail");        
        clienteBean.setCnpj("cnpj");
        clienteBean.setEmail("email");
        clienteBean.setContato1("111111");
        clienteBean.setContato2("22222");
        clienteBean.setUsuario("usuario");
        clienteBean.setSenha("senha");
        clienteBean.setRua("rua");
        clienteBean.setNumero("155");
        clienteBean.setBairro("baritto");
        clienteBean.setCidade("cidade");
        clienteBean.setEstado("sp");
        clienteBean.setComplemento("comple");
        
        cliControl.cadastrarController(clienteBean);
        
        
    } 
    
}
