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
@Table(name = "cep")
public class Cep implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codcep;
    
    @Column
    private String nomecep;

    public Cep() {
    }
    
    
    
    public Integer getCodcep() {
        return codcep;
    }

    public void setCodcep(Integer codcep) {
        this.codcep = codcep;
    }

    public String getNomecep() {
        return nomecep;
    }

    public void setNomecep(String nomecep) {
        this.nomecep = nomecep;
    }

    @Override
    public String toString() {
        return  nomecep;
    }
    
    
}
