/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author olivi
 */

//PRODUTO = {CODPRODUTO, NOMEPRODUTO, QUANTIDADE, VALOR, CODMARCA, CODTIPO }

@Entity
@Table(name = "produto")
public class Produto implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codproduto;
    
    @Column
    private String nomeproduto;
    
    @Column
    private int quantidade;
    
    @Column
    private double valor;
    
    @ManyToOne
    @JoinColumn(name = "codmarca_fk", referencedColumnName = "codmarca")
    private Marca marca;
    
    @ManyToOne
    @JoinColumn(name = "codtipo_fk", referencedColumnName = "codtipo")
    private Tipo tipo;
    
    
    
    
    @ManyToOne
    private Produto ID;

    public Produto getID() {
        return ID;
    }

    public void setID(Produto ID) {
        Produto oldID = this.ID;
        this.ID = ID;
        changeSupport.firePropertyChange("ID", oldID, ID);
    }

    private static class Marca {

        public Marca() {
        }
    }

    private static class Tipo {

        public Tipo() {
        }
    }

    /**
     * @return the codproduto
     */
    public Integer getCodproduto() {
        return codproduto;
    }

    /**
     * @param codproduto the codproduto to set
     */
    public void setCodproduto(Integer codproduto) {
        Integer oldCodproduto = this.codproduto;
        this.codproduto = codproduto;
        changeSupport.firePropertyChange("codproduto", oldCodproduto, codproduto);
    }

    /**
     * @return the nomeproduto
     */
    public String getNomeproduto() {
        return nomeproduto;
    }

    /**
     * @param nomeproduto the nomeproduto to set
     */
    public void setNomeproduto(String nomeproduto) {
        String oldNomeproduto = this.nomeproduto;
        this.nomeproduto = nomeproduto;
        changeSupport.firePropertyChange("nomeproduto", oldNomeproduto, nomeproduto);
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        int oldQuantidade = this.quantidade;
        this.quantidade = quantidade;
        changeSupport.firePropertyChange("quantidade", oldQuantidade, quantidade);
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        double oldValor = this.valor;
        this.valor = valor;
        changeSupport.firePropertyChange("valor", oldValor, valor);
    }

    /**
     * @return the marca
     */
    public Marca getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(Marca marca) {
        Marca oldMarca = this.marca;
        this.marca = marca;
        changeSupport.firePropertyChange("marca", oldMarca, marca);
    }

    /**
     * @return the tipo
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(Tipo tipo) {
        Tipo oldTipo = this.tipo;
        this.tipo = tipo;
        changeSupport.firePropertyChange("tipo", oldTipo, tipo);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
