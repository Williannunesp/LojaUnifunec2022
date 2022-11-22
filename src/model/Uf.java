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
@Table(name = "uf")
public class Uf implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer coduf;
    
    @Column
    private String nomeuf;
    
    @Column
    private String sigla;

    public Uf() {
    }
    
    

    public Integer getCoduf() {
        return coduf;
    }

    public void setCoduf(Integer coduf) {
        this.coduf = coduf;
    }

    public String getNomeuf() {
        return nomeuf;
    }

    public void setNomeuf(String nomeuf) {
        this.nomeuf = nomeuf;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return nomeuf + sigla;
    }
    
}
