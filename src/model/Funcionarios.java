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
@Table(name = "funcionarios")
public class Funcionarios implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codfuncionario;
    
    @Column
    private String nomefuncionario;
    
    @Column
    private String numerocasa;
    
    @Column
    private String salario;
    
    @ManyToOne
    @JoinColumn(name = "codbairro_fk", referencedColumnName = "codbairro")
    private Bairro bairro;
    
    @ManyToOne
    @JoinColumn(name = "codcep_fk", referencedColumnName = "codcep")
    private Cep cep;
    
    @ManyToOne
    @JoinColumn(name = "codcidade_fk", referencedColumnName = "codcidade")
    private Cidade cidade;
    
    @ManyToOne
    @JoinColumn(name = "codrua_fk", referencedColumnName = "codrua")
    private Rua rua;
    
    @ManyToOne
    @JoinColumn(name = "codfuncao_fk", referencedColumnName = "codfuncao")
    private Funcao funcao;
    
    @ManyToOne
    @JoinColumn(name = "codloja_fk", referencedColumnName = "codloja")
    private Loja loja;
    
    @ManyToMany 
    @JoinTable(name = "itenstelfuncionario", 
            joinColumns = @JoinColumn(name = "codcliente_fk"), 
            inverseJoinColumns = @JoinColumn(name = "codtelefone_fk"))
    private List<Telefone> telefone = new ArrayList<>();

    public Funcionarios() {
    }

    public Integer getCodfuncionario() {
        return codfuncionario;
    }

    public void setCodfuncionario(Integer codfuncionario) {
        this.codfuncionario = codfuncionario;
    }

    public String getNomefuncionario() {
        return nomefuncionario;
    }

    public void setNomefuncionario(String nomefuncionario) {
        this.nomefuncionario = nomefuncionario;
    }

    public String getNumerocasa() {
        return numerocasa;
    }

    public void setNumerocasa(String numerocasa) {
        this.numerocasa = numerocasa;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
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

    public Rua getRua() {
        return rua;
    }

    public void setRua(Rua rua) {
        this.rua = rua;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public List<Telefone> getTelefone() {
        return telefone;
    }

    public void setTelefone(List<Telefone> telefone) {
        this.telefone = telefone;
    }
    
}
