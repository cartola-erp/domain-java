package net.cartola.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//import javax.persistence.CascadeType;
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
 * O processo de aquisicao comeca com a solicitacao de compra
 * 05/11/2015 15:15:51
 * //@author murilo
 */
//////@Entity
//////////@Table(name = "comp_soli")
//////////@XmlRootElement
//////////@NamedQueries({
//    ////////@NamedQuery(name = "CompraSolicitacao.findAll", query = "SELECT c FROM CompraSolicitacao c"),
//    ////////@NamedQuery(name = "CompraSolicitacao.findById", query = "SELECT c FROM CompraSolicitacao c WHERE c.id = :id")
//})
public class CompraSolicitacao extends RegistroBase {
    
    private static final long serialVersionUID = 12121212134343431L;
    
    private Long id;
    private CompraSolicitacaoSituacao compraSolicitacaoSituacao = CompraSolicitacaoSituacao.PENDENTE;
    private CompraPedidoTipo compraPedidoTipo;
    private CompraSolicitacaoTipo compraSolicitacaoTipo;
    private PessoaFuncionario solicitante;
    private PessoaFuncionario gestor;
    private PessoaFuncionario comprador;
    private Date prazoSolicitante;
    private Date prazoFornecedor;
    private List<CompraSolicitacaoItem> itens = new ArrayList<>();

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_comp_soli_id")
    //@SequenceGenerator(name = "seq_comp_soli_id", sequenceName = "seq_comp_soli_id", allocationSize = 1)
    //@Column(name = "comp_soli_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@Enumerated(EnumType.STRING)
    //@Column(name="comp_soli_situ", length = 30)
    public CompraSolicitacaoSituacao getCompraSolicitacaoSituacao() {
        return compraSolicitacaoSituacao;
    }

    public void setCompraSolicitacaoSituacao(CompraSolicitacaoSituacao compraSolicitacaoSituacao) {
        this.compraSolicitacaoSituacao = compraSolicitacaoSituacao;
    }


    //@Enumerated(EnumType.STRING)
    //@Column(name="comp_pedi_tipo", length = 10)
    public CompraPedidoTipo getCompraPedidoTipo() {
        return compraPedidoTipo;
    }

    public void setCompraPedidoTipo(CompraPedidoTipo compraPedidoTipo) {
        this.compraPedidoTipo = compraPedidoTipo;
    }

    //@Enumerated(EnumType.STRING)
    //@Column(name="comp_soli_tipo", length = 10)
    public CompraSolicitacaoTipo getCompraSolicitacaoTipo() {
        return compraSolicitacaoTipo;
    }

    public void setCompraSolicitacaoTipo(CompraSolicitacaoTipo compraSolicitacaoTipo) {
        this.compraSolicitacaoTipo = compraSolicitacaoTipo;
    }

    //@ManyToOne
    //@JoinColumn(name = "pess_func_soli_id", nullable = false)
    public PessoaFuncionario getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(PessoaFuncionario solicitante) {
        this.solicitante = solicitante;
    }

    //@ManyToOne
    //@JoinColumn(name = "pess_func_gest_id", nullable = false)
    public PessoaFuncionario getGestor() {
        return gestor;
    }

    public void setGestor(PessoaFuncionario gestor) {
        this.gestor = gestor;
    }

    //@ManyToOne
    //@JoinColumn(name = "pess_func_comp_id", nullable = false)
    public PessoaFuncionario getComprador() {
        return comprador;
    }

    public void setComprador(PessoaFuncionario comprador) {
        this.comprador = comprador;
    }
    
    //@Transient
    public String getPrazoSolicitanteString() {
        
        String prazoSolicitanteString = "";
        if (null != this.prazoSolicitante) {
            SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
            prazoSolicitanteString = formater.format(this.prazoSolicitante);
        }
        
        return prazoSolicitanteString;
    }
    
    public void setPrazoSolicitanteString(String prazoSolicitanteString) throws ParseException {
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        
        this.prazoSolicitante = formater.parse(prazoSolicitanteString);
    }

    /**
     * Prazo que o solicitante pede para ser entregue.
     * //@return 
     */
    //@Temporal(TemporalType.DATE)
    //@Column(name = "praz_soli")
    public Date getPrazoSolicitante() {
        return prazoSolicitante;
    }

    public void setPrazoSolicitante(Date prazoSolicitante) {
        this.prazoSolicitante = prazoSolicitante;
    }
    
    //@Transient
    public String getPrazoFornecedorString() {
        
        String prazoFornecedorString = "";
        if (null != this.prazoFornecedor) {
            SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
            prazoFornecedorString = formater.format(this.prazoFornecedor);
        }
        
        return prazoFornecedorString;
    }
    
    public void setPrazoFornecedorString(String prazoFornecedorString) throws ParseException {
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        
        this.prazoFornecedor = formater.parse(prazoFornecedorString);
    }
    
    /**
     * Prazo que o comprador garante para o solicitante.
     * //@return 
     */
    //@Temporal(TemporalType.DATE)
    //@Column(name = "praz_forn")
    public Date getPrazoFornecedor() {
        return prazoFornecedor;
    }

    public void setPrazoFornecedor(Date prazoFornecedor) {
        this.prazoFornecedor = prazoFornecedor;
    }

    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "compraSolicitacao")
    public List<CompraSolicitacaoItem> getItens() {
        return itens;
    }

    public void setItens(List<CompraSolicitacaoItem> itens) {
        this.itens = itens;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CompraSolicitacao)) {
            return false;
        }
        CompraSolicitacao other = (CompraSolicitacao) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "CompraSolicitacao[id=" + id + "]";
    }

}
