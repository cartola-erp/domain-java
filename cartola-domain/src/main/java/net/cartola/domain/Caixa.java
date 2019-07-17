package net.cartola.domain;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
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
//import javax.xml.bind.annotation.XmlRootElement;

/**
 * 14/04/2016 19:50:29
 *
 * //@author murilo
 */
//@Entity
//@Table(name = "caix")
//@XmlRootElement
//@NamedQueries({
    //@NamedQuery(name = "Caixa.findAll", query = "SELECT c FROM Caixa c")})
public class Caixa extends RegistroBase {

    private static final long serialVersionUID = 9573824920384612L;

    private Long id;
    private CaixaEstacao caixaEstacao;
    private Usuario usuario;
    private BigDecimal saldoAbertura;
    private BigDecimal saldoFechamento;
    private BigDecimal dinheiroavista;
    private BigDecimal debito;
    private BigDecimal credito;
    private BigDecimal cheque;
    private BigDecimal chequeVista;
    private BigDecimal aPrazo;
    private BigDecimal adiantamentoCliente;
    private BigDecimal depositoEmConta;
    private BigDecimal cartaoRefeicao;
    private BigDecimal valereReicao;
    private Set<CaixaModoPagamento> formasPagamentos;
    private List<CaixaSuprimentoSangria> sangrias;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_caix_id")
    //@SequenceGenerator(name = "seq_caix_id", sequenceName = "seq_caix_id", allocationSize = 1)
    //@Column(name = "caix_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    //@ManyToOne
    //@JoinColumn(name = "caix_esta_id", nullable = false, updatable = false)
    public CaixaEstacao getCaixaEstacao() {
        return caixaEstacao;
    }

    public void setCaixaEstacao(CaixaEstacao caixaEstacao) {
        this.caixaEstacao = caixaEstacao;
    }
    
    //@ManyToOne
    //@JoinColumn(name = "usua_id", nullable = false, updatable = false)
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    //@Column(name="sald_aber", precision = 13, scale = 4, nullable = false)
    public BigDecimal getSaldoAbertura() {
        return saldoAbertura;
    }

    public void setSaldoAbertura(BigDecimal saldoAbertura) {
        this.saldoAbertura = saldoAbertura;
    }

    //@Column(name="sald_fech", precision = 13, scale = 4, nullable = false)
    public BigDecimal getSaldoFechamento() {
        return saldoFechamento;
    }

    public void setSaldoFechamento(BigDecimal saldoFechamento) {
        this.saldoFechamento = saldoFechamento;
    }

    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "caixa")
    public Set<CaixaModoPagamento> getFormasPagamentos() {
        return formasPagamentos;
    }

    public void setFormasPagamentos(Set<CaixaModoPagamento> formasPagamentos) {
        this.formasPagamentos = formasPagamentos;
    }

    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "caixa")
    public List<CaixaSuprimentoSangria> getSangrias() {
        return sangrias;
    }

    public void setSangrias(List<CaixaSuprimentoSangria> sangrias) {
        this.sangrias = sangrias;
    }

    //@Column(name="dinh", precision = 13, scale = 4)
    public BigDecimal getDinheiroavista() {
        return dinheiroavista;
    }

    public void setDinheiroavista(BigDecimal dinheiroavista) {
        this.dinheiroavista = dinheiroavista;
    }

    //@Column(name="debi", precision = 13, scale = 4)
    public BigDecimal getDebito() {
        return debito;
    }

    public void setDebito(BigDecimal debito) {
        this.debito = debito;
    }

    //@Column(name="cred", precision = 13, scale = 4)
    public BigDecimal getCredito() {
        return credito;
    }

    public void setCredito(BigDecimal credito) {
        this.credito = credito;
    }

    //@Column(name="cheq", precision = 13, scale = 4)
    public BigDecimal getCheque() {
        return cheque;
    }

    public void setCheque(BigDecimal cheque) {
        this.cheque = cheque;
    }

    //@Column(name="cheq_vist", precision = 13, scale = 4)
    public BigDecimal getChequeVista() {
        return chequeVista;
    }

    public void setChequeVista(BigDecimal chequeVista) {
        this.chequeVista = chequeVista;
    }

    //@Column(name="a_praz", precision = 13, scale = 4)
    public BigDecimal getAPrazo() {
        return aPrazo;
    }

    public void setAPrazo(BigDecimal aPrazo) {
        this.aPrazo = aPrazo;
    }

    //@Column(name="adia_clie", precision = 13, scale = 4)
    public BigDecimal getAdiantamentoCliente() {
        return adiantamentoCliente;
    }

    public void setAdiantamentoCliente(BigDecimal adiantamentoCliente) {
        this.adiantamentoCliente = adiantamentoCliente;
    }

    //@Column(name="depo_cont", precision = 13, scale = 4)
    public BigDecimal getDepositoEmConta() {
        return depositoEmConta;
    }

    public void setDepositoEmConta(BigDecimal depositoEmConta) {
        this.depositoEmConta = depositoEmConta;
    }

    //@Column(name="cart_refe", precision = 13, scale = 4)
    public BigDecimal getCartaoRefeicao() {
        return cartaoRefeicao;
    }

    public void setCartaoRefeicao(BigDecimal cartaoRefeicao) {
        this.cartaoRefeicao = cartaoRefeicao;
    }

    //@Column(name="vale_refe", precision = 13, scale = 4)
    public BigDecimal getValereReicao() {
        return valereReicao;
    }

    public void setValereReicao(BigDecimal valereReicao) {
        this.valereReicao = valereReicao;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Caixa)) {
            return false;
        }
        Caixa other = (Caixa) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "Caixa[id=" + id + "]";
    }

}
