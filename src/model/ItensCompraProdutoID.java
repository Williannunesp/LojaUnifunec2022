/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

/**
 *
 * @author olivi
 */
//ITENSCOMPRAPRODUTO = {CODCOMPRA, CODPRODUTO, QUANTIDADE, VALORC}

class ItensCompraProdutoID {
    
    @ManyToMany
    @JoinColumn(name = "codcompra_fk", referencedColumnName = "codcompra")
    private Compra compra;
    
    @ManyToMany
    @JoinColumn(name = "codproduto_fk", referencedColumnName = "codproduto")
    private Produto produto;
    
    public ItensCompraProdutoID() {
    }

    /**
     * @return the compra
     */
    public Compra getCompra() {
        return compra;
    }

    /**
     * @param compra the compra to set
     */
    public void setCompra(Compra compra) {
        this.compra = compra;
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
    
    @Override
    public String toString() {
        return "ItensCompraProdutoID{" + "compra=" + compra + ", produto=" + produto + '}';
    }
}
