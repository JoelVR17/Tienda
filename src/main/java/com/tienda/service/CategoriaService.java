/*By:JoelVR*/
package com.tienda.service;

import java.util.List;
import com.tienda.domain.Categoria;

public interface CategoriaService {
    
    public List<Categoria> getCategorias(boolean activos);
    
    public void save(Categoria categoria);
    
    public void delete(Categoria categoria);
    
    public Categoria getCategoria(Categoria categoria);
    
}
