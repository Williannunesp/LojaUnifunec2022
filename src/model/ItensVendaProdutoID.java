/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author olivi
 */
@Entity
@Table(name="itensvendaproduto")
public class ItensVendaProdutoID {
    
    @Id
    @EmbeddedId
    
    @ManyToOne
    @JoinColumn(name = "codvenda_fk", referencedColumnName = "codvenda")
    private Venda venda;
    
    @ManyToOne
    @JoinColumn(name = "codproduto_fk", referencedColumnName = "codproduto")
    private Produto produto;
    
    private ItensVendaProduto ItensVendaProdutoID;

    public ItensVendaProduto getItensVendaProdutoID() {
        return ItensVendaProdutoID;
    }

    public void setItensVendaProdutoID(ItensVendaProduto ItensVendaProdutoID) {
        this.ItensVendaProdutoID = ItensVendaProdutoID;
    }

    /**
     * @return the venda
     */
    public Venda getVenda() {
        return venda;
    }

    /**
     * @param venda the venda to set
     */
    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    /**
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setVenda(VendaProduto venda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
