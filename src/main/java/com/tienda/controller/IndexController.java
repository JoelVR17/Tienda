/*By:JoelVR*/
package com.tienda.controller;

import com.tienda.ClienteDao.ClienteDao;
import com.tienda.domain.cliente;
import com.tienda.service.ClienteService;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping("/")
    public String inicio(Model model){
        
        var clientes = clienteService.getClientes();
        model.addAttribute("clientes",clientes);
        return "index";
    }
    
    @GetMapping("/nuevoCliente")
    public String nuevoCliente(cliente cliente){
        
        return"modificarCliente";
    }
    
    @PostMapping("/guardarCliente")
    public String guardarCliente(cliente cliente){
        
        clienteService.save(cliente);
        return"redirect:/";
    }
    
    @GetMapping("/modificarCliente/{idcliente}")
    public String modificarCliente(cliente cliente, Model model){
        
        cliente = clienteService.getCliente(cliente);
        model.addAttribute("cliente",cliente);
        return"modificarCliente";
    }
    
    @GetMapping("/eliminarCliente/{idcliente}")
    public String eliminarCliente(cliente cliente){
        
        clienteService.delete(cliente);
        return"redirect:/";
    }
    
}
