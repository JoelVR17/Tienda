/*By:JoelVR*/
package com.tienda.service;

import java.util.List;
import com.tienda.domain.Articulo;

public interface ArticuloService {
    
    public List<Articulo> getArticulos(boolean activos);
    
    public void save(Articulo articulo);
    
    public void delete(Articulo articulo);
    
    public Articulo getArticulo(Articulo articulo);
    
}
