/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author willi
 */
@Embeddable
public class ItensTelFuncionarioID implements Serializable{
    
    @ManyToOne
    @JoinColumn(name = "codtelefone_fk", referencedColumnName = "codtelefone")
    private Telefone telefone;
    
    @ManyToOne
    @JoinColumn(name = "codfuncionario_fk", referencedColumnName = "codfuncionario")
    private Funcionarios funcionarios;

    public ItensTelFuncionarioID() {
    }
    

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Funcionarios getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionarios funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public String toString() {
        return "ItensTelFuncionarioID{" + "telefone=" + telefone + ", funcionarios=" + funcionarios + '}';
    }
    
    
}
