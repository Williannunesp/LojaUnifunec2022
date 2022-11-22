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
import javax.persistence.Table;

/**
 *
 * @author willi
 */
@Entity
@Table(name = "operadora")
public class Operadora implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codoperadora;
    
    @Column
    private String nomeoperadora;

    public Operadora() {
    }
    
    

    public Integer getCodoperadora() {
        return codoperadora;
    }

    public void setCodoperadora(Integer codoperadora) {
        this.codoperadora = codoperadora;
    }

    public String getNomeoperadora() {
        return nomeoperadora;
    }

    public void setNomeoperadora(String nomeoperadora) {
        this.nomeoperadora = nomeoperadora;
    }

    @Override
    public String toString() {
        return nomeoperadora;
    }
    
    
}
