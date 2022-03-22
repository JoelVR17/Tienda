/*By:JoelVR*/
package com.tienda.service;

import java.util.List;
import com.tienda.domain.Cliente;

public interface ClienteService {
    
    public List<Cliente> getClientes();
    
    public void save(Cliente cliente);
    
    public void delete(Cliente cliente);
    
    public Cliente getCliente(Cliente cliente);
    
}
