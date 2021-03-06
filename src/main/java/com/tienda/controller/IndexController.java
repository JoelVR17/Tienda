/*By:JoelVR*/
package com.tienda.controller;

import com.tienda.dao.ArticuloDao;
import com.tienda.domain.Articulo;
import com.tienda.service.ArticuloService;
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
    private ArticuloService articuloService;
    
    @GetMapping("/")
    public String inicio(Model model){
        
        var articulos = articuloService.getArticulos(true);
        
        var precioTotal = 0;
        for(var c: articulos){
            precioTotal+=c.getPrecio();
        }
        
        int productoTotal = 0;
        
        model.addAttribute("productoTotal",articulos.size());
        model.addAttribute("precioTotal",precioTotal);
        model.addAttribute("articulos",articulos);
        return "index";
    }
}
