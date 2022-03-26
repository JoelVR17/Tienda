/*By:JoelVR*/
package com.tienda.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="credito")
public class Credito implements Serializable{
    
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_credito")
    
    //SE ESTABLECEN LOS ATRIBUTOS
    private Long idCredito;
    private Long limite;
    
    //SE ESTABLECEN CONSTRUCTORES
    public Credito(Long limite) {
        this.limite = limite;
    }
    
    public Credito(){
        
    }
    
}
