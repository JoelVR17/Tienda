/*By:JoelVR*/
package com.tienda.service;

import java.util.List;
import com.tienda.domain.cliente;

public interface ClienteService {
    
    public List<cliente> getClientes();
    
    public void save(cliente cliente);
    
    public void delete(cliente cliente);
    
    public cliente getCliente(cliente cliente);
    
}
