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
@Table(name = "itenscompraproduto")
public class ItensCompraProduto implements Serializable {

    @Id
    @EmbeddedId
    
    
    private ItensCompraProdutoID ItensCompraProdutoID;

    public ItensCompraProdutoID getItensCompraProdutoID() {
        return ItensCompraProdutoID;
    }

    public void setItensCompraProdutoID(ItensCompraProdutoID ItensCompraProdutoID) {
        this.ItensCompraProdutoID = ItensCompraProdutoID;
    }
    
}
