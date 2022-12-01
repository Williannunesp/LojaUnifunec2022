
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "marca")

public class Marca implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codmarca;
    
    @Column
    private String nomemarca;

    public Marca() {
    }

    /**
     * @return the codmarca
     */
    public Integer getCodmarca() {
        return codmarca;
    }

    /**
     * @param codmarca the codmarca to set
     */
    public void setCodmarca(Integer codmarca) {
        this.codmarca = codmarca;
    }

    /**
     * @return the nomemarca
     */
    public String getNomemarca() {
        return nomemarca;
    }

    /**
     * @param nomemarca the nomemarca to set
     */
    public void setNomemarca(String nomemarca) {
        this.nomemarca = nomemarca;
    }

    @Override
    public String toString() {
        return nomemarca;
    }
    
}

    
    