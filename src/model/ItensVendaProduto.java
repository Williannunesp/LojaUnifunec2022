/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author olivi
 */

@Entity
@Table(name = "itensvendaproduto")
public class ItensVendaProduto implements Serializable {

    @Id
    @EmbeddedId
    
    private ItensVendaProduto ItensVendaProdutoID;

    public ItensVendaProduto getItensVendaProdutoID() {
        return ItensVendaProdutoID;
    }

    public void setItensVendaProdutoID(ItensVendaProduto ItensVendaProdutoID) {
        this.ItensVendaProdutoID = ItensVendaProdutoID;
    }

    public void setQuantv(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setQuantidade(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
