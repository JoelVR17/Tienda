/*By:JoelVR*/
package com.tienda.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="articulo")
public class Articulo implements Serializable{
    
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_articulo")
    
    //SE ESTABLECEN LOS ATRIBUTOS
    private Long idArticulo;
    private Long idCategoria;
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    private boolean activo;
    
    
    //SE ESTABLECEN CONSTRUCTORES 
    public Articulo(Long idCategoria, String descripcion, String detalle, double precio, int existencias, boolean activo) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencias = existencias;
        this.activo = activo;
    }

    public Articulo() {
    }
    
}
