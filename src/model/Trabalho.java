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
@Table(name = "trabalho")
public class Trabalho implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codtrabalho;
    
    @Column
    private String nometrabalho;

    public Trabalho() {
    }
    
    

    public Integer getCodtrabalho() {
        return codtrabalho;
    }

    public void setCodtrabalho(Integer codtrabalho) {
        this.codtrabalho = codtrabalho;
    }

    public String getNometrabalho() {
        return nometrabalho;
    }

    public void setNometrabalho(String nometrabalho) {
        this.nometrabalho = nometrabalho;
    }

    @Override
    public String toString() {
        return  nometrabalho;
    }
    
    
}
