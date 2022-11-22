/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author willi
 */
@Entity
@Table(name = "fornecedor")
public class Fornecedor implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codfornecedor;
    
    @Column
    private String nomefornecedor;
    
    @Column
    private String numerocasa;
    
    @ManyToOne
    @JoinColumn(name = "codrua_fk", referencedColumnName = "codrua")
    private Rua rua;
    
    @ManyToOne
    @JoinColumn(name = "codbairro_fk", referencedColumnName = "codbairro")
    private Bairro bairro;
    
    @ManyToOne
    @JoinColumn(name = "codcep_fk", referencedColumnName = "codcep")
    private Cep cep;
    
    @ManyToOne
    @JoinColumn(name = "codcidade_fk", referencedColumnName = "codcidade")
    private Cidade cidade;
    
    @ManyToMany 
    @JoinTable(name = "itenstelfornecedor", 
            joinColumns = @JoinColumn(name = "codfornecedor_fk"), 
            inverseJoinColumns = @JoinColumn(name = "codtelefone_fk"))
    private List<Telefone> telefone = new ArrayList<>();

    public Fornecedor() {
    }
    
    

    public Integer getCodfornecedor() {
        return codfornecedor;
    }

    public void setCodfornecedor(Integer codfornecedor) {
        this.codfornecedor = codfornecedor;
    }

    public String getNomefornecedor() {
        return nomefornecedor;
    }

    public void setNomefornecedor(String nomefornecedor) {
        this.nomefornecedor = nomefornecedor;
    }

    public String getNumerocasa() {
        return numerocasa;
    }

    public void setNumerocasa(String numerocasa) {
        this.numerocasa = numerocasa;
    }

    public Rua getRua() {
        return rua;
    }

    public void setRua(Rua rua) {
        this.rua = rua;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Cep getCep() {
        return cep;
    }

    public void setCep(Cep cep) {
        this.cep = cep;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public List<Telefone> getTelefone() {
        return telefone;
    }

    public void setTelefone(List<Telefone> telefone) {
        this.telefone = telefone;
    }
    
}
