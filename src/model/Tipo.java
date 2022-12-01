
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo")

public class Tipo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codtipo;
    
    @Column
    private String nometipo;

    public Tipo() {
    }
    
    
    public Integer getCodtipo() {
        return codtipo;
    }

    
    public void setCodtipo(Integer codtipo) {
        this.codtipo = codtipo;
    }

    
    public String getNometipo() {
        return nometipo;
    }

    
    public void setNometipo(String nometipo) {
        this.nometipo = nometipo;
    }

    @Override
    public String toString() {
        return nometipo;
    }
    
    
    
    
}
