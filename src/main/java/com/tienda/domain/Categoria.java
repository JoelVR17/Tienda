/*By:JoelVR*/
package com.tienda.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="Categoria")
public class Categoria implements Serializable{
    
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_Categoria")
    
    //SE ESTABLECEN LOS ATRIBUTOS
    private Long idCategoria;
    private boolean activo;
    private String descripcion;
    
    
    //SE ESTABLECEN CONSTRUCTORES
    public Categoria(boolean activo, String descripcion){
        this.activo = activo;
        this.descripcion = descripcion;
        
    }

    public Categoria() {
    }
    
}
