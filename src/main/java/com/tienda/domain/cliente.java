/*By:JoelVR*/
package com.tienda.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="cliente")
public class cliente implements Serializable{
    
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcliente;
    
    //SE ESTABLECEN ATRIBUTOS
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;
    
    //SE ESTABLECEN CONSTRUCTORES
    public cliente(String nombre, String apellidos, String correo, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    public cliente(){
        
    }
    
}
