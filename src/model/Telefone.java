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
 * @author willi
 */
@Entity
@Table(name = "telefone")
public class Telefone implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codtelefone;
    
    @Column
    private String numero;
    
    @ManyToOne
    @JoinColumn(name = "codoperadora_fk", referencedColumnName = "codoperadora")
    private Operadora operadora;

    public Telefone() {
    }
    
    

    public Integer getCodtelefone() {
        return codtelefone;
    }

    public void setCodtelefone(Integer codtelefone) {
        this.codtelefone = codtelefone;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Operadora getOperadora() {
        return operadora;
    }

    public void setOperadora(Operadora operadora) {
        this.operadora = operadora;
    }

    @Override
    public String toString() {
        return numero;
    }
    
    
}
