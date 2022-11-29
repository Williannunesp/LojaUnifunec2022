/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author olivi
 */

@Entity
@Table(name = "compraproduto")
class Compra implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codcompra;
    
    @Column
    private Integer datacompra;
    
    @ManyToOne
    @JoinColumn(name = "codfornecedor_fk", referencedColumnName = "codfornecedor")
    private Fornecedor fornecedor;
    
    @ManyToOne
    @JoinColumn(name = "codfuncionario_fk", referencedColumnName = "codfuncionario")
    private Funcionario funcionario;
    
    
    
    
    @OneToOne
    private Compra ID;

    public Compra getID() {
        return ID;
    }

    public void setID(Compra ID) {
        this.ID = ID;
    }

    /**
     * @return the codcompra
     */
    public Integer getCodcompra() {
        return codcompra;
    }

    /**
     * @param codcompra the codcompra to set
     */
    public void setCodcompra(Integer codcompra) {
        this.codcompra = codcompra;
    }

    /**
     * @return the datacompra
     */
    public Integer getDatacompra() {
        return datacompra;
    }

    /**
     * @param datacompra the datacompra to set
     */
    public void setDatacompra(Integer datacompra) {
        this.datacompra = datacompra;
    }

    /**
     * @return the fornecedor
     */
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    /**
     * @param fornecedor the fornecedor to set
     */
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    /**
     * @return the funcionario
     */
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
}
