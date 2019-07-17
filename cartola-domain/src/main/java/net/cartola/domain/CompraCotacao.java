package net.cartola.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.OneToMany;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.persistence.Transient;
//import javax.xml.bind.annotation.XmlRootElement;

/**
 * 16/08/2016 14:43:53
 * //@author murilo
 * 
 * 21/09/2016 08:00:00
 * //@author luis.vaz
 */
//@Entity
//@Table(name = "comp_cota")
//@XmlRootElement
//@NamedQueries({
    //@NamedQuery(name = "CompraCotacao.findAll", query = "SELECT c FROM CompraCotacao c"),
    //@NamedQuery(name = "CompraCotacao.findById", query = "SELECT c FROM CompraCotacao c WHERE c.id = :id")
//})
public class CompraCotacao extends RegistroBase {

    private static final long serialVersionUID = 39712394723873L;
    private Long id;
    private CompraCotacaoSituacao compraCotacaoSituacao = CompraCotacaoSituacao.EM_ANDAMENTO;
    private Date prazoEntregaCotacao;
    private String descricao;
//    private CompraSolicitacao compraSolicitacao;
    private EmpresaUnidade empresaUnidadeParaCotacao;
    private List<CompraCotacaoFornecedor> compraCotacaoFornecedor;
    private List<CompraCotacaoItem> itens;
    private Usuario loginAssignee;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_comp_cota_id")
    //@SequenceGenerator(name = "seq_comp_cota_id", sequenceName = "seq_comp_cota_id", allocationSize = 1)
    //@Column(name = "comp_cota_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@Enumerated(EnumType.STRING)
    //@Column(name = "comp_cota_situ", nullable = false)
    public CompraCotacaoSituacao getCompraCotacaoSituacao() {
        return compraCotacaoSituacao;
    }

    public void setCompraCotacaoSituacao(CompraCotacaoSituacao compraCotacaoSituacao) {
        this.compraCotacaoSituacao = compraCotacaoSituacao;
    }
    
    /**
     * Prazo que o solicitante estipula para que o 
     * fornecedor responda � solicita��o de or�amento.
     * //@return 
     */
    //@Temporal(TemporalType.DATE)
    //@Column(name = "praz_entr_cota")
    public Date getPrazoEntregaCotacao() {
        return prazoEntregaCotacao;
    }

    public void setPrazoEntregaCotacao(Date prazoEntregaCotacao) {
        this.prazoEntregaCotacao = prazoEntregaCotacao;
    }
    
    //@Transient
    public String getPrazoEntregaCotacaoString() {
        
        String prazoEntregaCotacaoString = "";
        if (null != this.prazoEntregaCotacao) {
            SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
            prazoEntregaCotacaoString = formater.format(this.prazoEntregaCotacao);
        }
        
        return prazoEntregaCotacaoString;
    }
    
    public void setPrazoEntregaCotacaoString(String prazoEntregaCotacaoString) throws ParseException {
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        
        this.prazoEntregaCotacao = formater.parse(prazoEntregaCotacaoString);
    }
    
    //@Column(name="dscr", length = 255)
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

//    //@OneT
//    //@JoinColumn(name = "comp_soli_id")
//    public CompraSolicitacao getCompraSolicitacao() {
//        return compraSolicitacao;
//    }
//
//    public void setCompraSolicitacao(CompraSolicitacao compraSolicitacao) {
//        this.compraSolicitacao = compraSolicitacao;
//    }
    
    //@ManyToOne
    //@JoinColumn(name = "empr_unid_id", nullable = false)
    public EmpresaUnidade getEmpresaUnidadeParaCotacao() {
        return empresaUnidadeParaCotacao;
    }

    public void setEmpresaUnidadeParaCotacao(EmpresaUnidade empresaUnidadeParaCotacao) {
        this.empresaUnidadeParaCotacao = empresaUnidadeParaCotacao;
    }

    //@OneToMany(mappedBy = "compraCotacao")
    public List<CompraCotacaoFornecedor> getCompraCotacaoFornecedor() {
        return compraCotacaoFornecedor;
    }

    public void setCompraCotacaoFornecedor(List<CompraCotacaoFornecedor> compraCotacaoFornecedor) {
        this.compraCotacaoFornecedor = compraCotacaoFornecedor;
    }

    //@OneToMany(mappedBy = "compraCotacao")
    public List<CompraCotacaoItem> getItens() {
        return itens;
    }

    public void setItens(List<CompraCotacaoItem> itens) {
        this.itens = itens;
    }
    
     public Usuario getLoginAssignee() {
        return loginAssignee;
    }
    
    public void setLoginAssignee(Usuario loginAssignee) {
        this.loginAssignee = loginAssignee;
    }

    //@Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    //@Override
    public boolean equals(Object object) {
        if (!(object instanceof CompraCotacao)) {
            return false;
        }
        CompraCotacao other = (CompraCotacao) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    //@Override
    public String toString() {
        return "CompraCotacao[id=" + id + "]";
    }

}
