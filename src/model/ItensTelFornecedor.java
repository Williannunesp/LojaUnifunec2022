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
@Table(name = "itenstelfornecedor")
public class ItensTelFornecedor implements Serializable{
    
    @EmbeddedId
    private ItensTelFornecedorID itensTelFornecedorID;

    public ItensTelFornecedor() {
    }

    public ItensTelFornecedorID getItensTelFornecedorID() {
        return itensTelFornecedorID;
    }

    public void setItensTelFornecedorID(ItensTelFornecedorID itensTelFornecedorID) {
        this.itensTelFornecedorID = itensTelFornecedorID;
    }
    
    
    
}
