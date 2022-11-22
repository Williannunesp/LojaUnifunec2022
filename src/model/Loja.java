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
@Table(name = "loja")
public class Loja implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codloja;
    
    @Column
    private String cnpj;
    
    @Column
    private String nomefantazia;
    
    @Column
    private String razaosocial;

    public Loja() {
    }
    
    

    public Integer getCodloja() {
        return codloja;
    }

    public void setCodloja(Integer codloja) {
        this.codloja = codloja;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomefantazia() {
        return nomefantazia;
    }

    public void setNomefantazia(String nomefantazia) {
        this.nomefantazia = nomefantazia;
    }

    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    @Override
    public String toString() {
        return cnpj + nomefantazia + razaosocial;
    }
    
    
}
