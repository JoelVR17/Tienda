/*By:JoelVR*/
package com.tienda.controller;

import com.tienda.ClienteDao.ClienteDao;
import com.tienda.domain.cliente;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private ClienteDao clienteDao;
    
    @GetMapping("/")
    public String inicio(Model model){
        log.info("Estamos usando spring");
        
        var clientes = clienteDao.findAll();
        model.addAttribute("clientes",clientes);
        
        return "index";
        
    }
}
