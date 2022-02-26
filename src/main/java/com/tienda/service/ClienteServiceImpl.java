
package com.tienda.service;

import com.tienda.ClienteDao.ClienteDao;
import com.tienda.domain.cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteDao clienteDao;
    
    @Override
    public List<cliente> getClientes() {
        
        return(List<cliente>)clienteDao.findAll();
    }

    @Override
    public void save(cliente cliente) {
        
        clienteDao.save(cliente);
    }

    @Override
    public void delete(cliente cliente) {
        
       clienteDao.delete(cliente);
    }

    @Override
    public cliente getCliente(cliente cliente) {
        
        return clienteDao.findById(cliente.getIdcliente()).orElse(null);
    }
    
}
