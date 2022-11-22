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
public class ItensTelFornecedorID implements Serializable{
    
    @ManyToOne
    @JoinColumn(name = "codtelefone_fk", referencedColumnName = "codtelefone")
    private Telefone telefone;
    
    @ManyToOne
    @JoinColumn(name = "codfornecedor_fk", referencedColumnName = "codfornecedor")
    private Fornecedor fornecedor;

    public ItensTelFornecedorID() {
    }
    

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return "ItenTelFornecedorID{" + "telefone=" + telefone + ", fornecedor=" + fornecedor + '}';
    }
    
}
