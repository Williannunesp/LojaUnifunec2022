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
public class ItensTelClienteID implements Serializable{
    
    @ManyToOne
    @JoinColumn(name = "codtelefone_fk", referencedColumnName = "codtelefone")
    private Telefone telefone;
    
    @ManyToOne
    @JoinColumn(name = "codcliente_fk", referencedColumnName = "codcliente")
    private Cliente cliente;

    public ItensTelClienteID() {
    }

    
    
    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "ItensTelClienteID{" + "telefone=" + telefone + ", cliente=" + cliente + '}';
    }
    
    
}
