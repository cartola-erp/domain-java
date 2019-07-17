package net.cartola.domain;

import java.util.List;
//import javax.persistence.Column;
//import javax.persistence.DiscriminatorValue;
//import javax.persistence.Entity;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;

/**
 * 07/11/2015 00:17:10
 * //@author murilo
 */
//@Entity
//@DiscriminatorValue("FORNECEDOR")
//@Table(name = "forn")
public class Fornecedor extends PessoaCadastro {
    private List<FornecedorItem> itens;
    private static final long serialVersionUID = 123435214134321L;
    private Integer leadTimePadrao;

    //@Column(name="lead_time_padr")
    public Integer getLeadTimePadrao() {
        return leadTimePadrao;
    }

    public void setLeadTimePadrao(Integer leadTimePadrao) {
        this.leadTimePadrao = leadTimePadrao;
    }

    //@OneToMany(mappedBy = "fornecedor")
    public List<FornecedorItem> getItens() {
        return itens;
    }

    public void setItens(List<FornecedorItem> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "Fornecedor[id=" + getId() + ", nome=\"" + getNomeRazaoSocial() + "\"]";
    }

}
