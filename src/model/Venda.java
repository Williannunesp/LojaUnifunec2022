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
import javax.persistence.Table;

/**
 *
 * @author olivi
 */

@Entity
@Table (name = "vendaproduto")
class Venda implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codvenda;
    
    @Column
    private Integer datavenda;
    
    @ManyToOne
    @JoinColumn (name = "codcliente_fk", referencedColumnName = "codcliente")
    private Cliente cliente;
    
    @ManyToOne
    @JoinColumn (name = "codfuncionario_fk", referencedColumnName = "codfuncionario")
    private Funcionario funcionario;
    
    @ManyToOne
    private Venda ID;

    public Venda getID() {
        return ID;
    }

    public void setID(Venda ID) {
        this.ID = ID;
    }

    /**
     * @return the codvenda
     */
    public Integer getCodvenda() {
        return codvenda;
    }

    /**
     * @param codvenda the codvenda to set
     */
    public void setCodvenda(Integer codvenda) {
        this.codvenda = codvenda;
    }

    /**
     * @return the datavenda
     */
    public Integer getDatavenda() {
        return datavenda;
    }

    /**
     * @param datavenda the datavenda to set
     */
    public void setDatavenda(Integer datavenda) {
        this.datavenda = datavenda;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
