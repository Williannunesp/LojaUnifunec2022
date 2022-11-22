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
@Table(name = "cliente")
public class Cliente implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codcliente;
    
    @Column
    private String nomecliente;
    
    @Column
    private String data_nasc;
    
    @Column
    private String numerocasa;
    
    @ManyToOne
    @JoinColumn(name = "codsexo_fk", referencedColumnName = "codsexo")
    private Sexo sexo;
    
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
    @JoinColumn(name = "codtrabalho_fk", referencedColumnName = "codtrabalho")
    private Trabalho trabalho;
   
    @ManyToMany 
    @JoinTable(name = "itenstelcliente", 
            joinColumns = @JoinColumn(name = "codcliente_fk"), 
            inverseJoinColumns = @JoinColumn(name = "codtelefone_fk"))
    private List<Telefone> telefone = new ArrayList<>();

    public Cliente() {
    }
    
    

    public Integer getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(Integer codcliente) {
        this.codcliente = codcliente;
    }

    public String getNomecliente() {
        return nomecliente;
    }

    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getNumerocasa() {
        return numerocasa;
    }

    public void setNumerocasa(String numerocasa) {
        this.numerocasa = numerocasa;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
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

    public Trabalho getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(Trabalho trabalho) {
        this.trabalho = trabalho;
    }

    public List<Telefone> getTelefone() {
        return telefone;
    }

    public void setTelefone(List<Telefone> telefone) {
        this.telefone = telefone;
    }
}
