/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author willi
 */
@Entity
@Table(name = "itenstelcliente")
public class itensTelCliente implements Serializable{
    
    @EmbeddedId
    private ItensTelClienteID itensClienteID;

    public itensTelCliente() {
    }

    public ItensTelClienteID getItensClienteID() {
        return itensClienteID;
    }

    public void setItensClienteID(ItensTelClienteID itensClienteID) {
        this.itensClienteID = itensClienteID;
    }
    
    
}
