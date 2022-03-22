
package com.tienda.service;

import com.tienda.dao.CategoriaDao;
import com.tienda.domain.Categoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaDao aategoriaDao;
    
    @Override
    public List<Categoria> getCategorias(boolean activos) {
        var lista = (List<Categoria>)aategoriaDao.findAll();
        
        if(activos){
            lista.removeIf(e -> e.isActivo());
        }
        
        return(List<Categoria>)aategoriaDao.findAll();
    }

    @Override
    public void save(Categoria aategoria) {
        
        aategoriaDao.save(aategoria);
    }

    @Override
    public void delete(Categoria aategoria) {
        
       aategoriaDao.delete(aategoria);
    }

    @Override
    public Categoria getCategoria(Categoria aategoria) {
        
        return aategoriaDao.findById(aategoria.getIdCategoria()).orElse(null);
    }
    
}