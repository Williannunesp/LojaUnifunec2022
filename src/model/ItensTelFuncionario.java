/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author willi
 */
@Entity
@Table(name = "itenstelfuncionario")
public class ItensTelFuncionario  implements Serializable{
    @EmbeddedId
    private ItensTelFuncionarioID itensTelFuncionario;

    public ItensTelFuncionario() {
    }

    public ItensTelFuncionarioID getItensTelFuncionario() {
        return itensTelFuncionario;
    }

    public void setItensTelFuncionario(ItensTelFuncionarioID itensTelFuncionario) {
        this.itensTelFuncionario = itensTelFuncionario;
    }
    
    
    
}
