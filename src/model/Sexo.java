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
@Table(name = "sexo")
public class Sexo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codsexo;
    
    @Column
    private String nomesexo;

    public Sexo() {
    }

    
    
    public Integer getCodsexo() {
        return codsexo;
    }

    public void setCodsexo(Integer codsexo) {
        this.codsexo = codsexo;
    }

    public String getNomesexo() {
        return nomesexo;
    }

    public void setNomesexo(String nomesexo) {
        this.nomesexo = nomesexo;
    }

    @Override
    public String toString() {
        return nomesexo;
    }
    

}
