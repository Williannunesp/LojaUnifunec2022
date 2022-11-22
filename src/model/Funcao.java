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
@Table(name = "funcao")
public class Funcao  implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codfuncao;
    
    @Column
    private String nomefuncao;

    public Funcao() {
    }
    
    

    public Integer getCodfuncao() {
        return codfuncao;
    }

    public void setCodfuncao(Integer codfuncao) {
        this.codfuncao = codfuncao;
    }

    public String getNomefuncao() {
        return nomefuncao;
    }

    public void setNomefuncao(String nomefuncao) {
        this.nomefuncao = nomefuncao;
    }

    @Override
    public String toString() {
        return  nomefuncao;
    }
    
    
}
