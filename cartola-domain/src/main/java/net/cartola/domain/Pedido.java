package net.cartola.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
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
//import javax.persistence.Transient;
//import javax.xml.bind.annotation.XmlRootElement;

/**
 * 23/12/2015 08:51:31
 *
 * //@author DavidWD
 */
//@Entity
//@Table(name = "pedi")
//@XmlRootElement
//@NamedQueries({
    //@NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p")})
public class Pedido extends RegistroBase {

    private Long id;
    private TransacaoComercial transacaoComercial;
    private PedidoStatus pedidoStatus = PedidoStatus.ABERTO;
    private Pessoa vendedor;
    private String vendedorNome;
    private BigDecimal valorItens = BigDecimal.ZERO;
    private BigDecimal valorFrete = BigDecimal.ZERO;
    private BigDecimal valorTotal = BigDecimal.ZERO;
    private DescontoSobre descontoSobre = DescontoSobre.ITEM;
    private DescontoTipo descontoTipo = DescontoTipo.VALOR;
    private BigDecimal descontoValor = BigDecimal.ZERO;
    private BigDecimal descontoPorcentagem = BigDecimal.ZERO;
    private String obs;
    private Set<PedidoItem> pedidoItens;
    private List<PedidoPagamento> pedidoPagamentos;
    private List<Movimento> movimentos;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pedi_id")
    //@SequenceGenerator(name = "seq_pedi_id", sequenceName = "seq_pedi_id", allocationSize = 1)
    //@Column(name = "pedi_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "tran_id", nullable = false)
    public TransacaoComercial getTransacaoComercial() {
        return transacaoComercial;
    }

    public void setTransacaoComercial(TransacaoComercial transacaoComercial) {
        this.transacaoComercial = transacaoComercial;
    }
    
    //@Enumerated(EnumType.STRING)
    //@Column(name = "pedi_stat", length = 14, nullable = false, 
    //columnDefinition = "character varying(14) default 'ABERTO'")
    public PedidoStatus getPedidoStatus() {
        return pedidoStatus;
    }

    public void setPedidoStatus(PedidoStatus pedidoStatus) {
        this.pedidoStatus = pedidoStatus;
    }

    //@ManyToOne
    //@JoinColumn(name = "vend_id")
    public Pessoa getVendedor() {
        return vendedor;
    }

    public void setVendedor(Pessoa vendedor) {
        this.vendedor = vendedor;
    }

    //@Column(name = "vend_nome", length = 255)
    public String getVendedorNome() {
        return vendedorNome;
    }

    public void setVendedorNome(String vendedorNome) {
        this.vendedorNome = vendedorNome;
    }

    //@Column(name = "valo_iten", precision = 13, scale = 4, nullable = false, 
    //columnDefinition = "Numeric(13,4) default '0.00'")
    public BigDecimal getValorItens() {
        if(valorItens == null){
            valorItens = BigDecimal.ZERO;
        }
        return valorItens;
    }

    public void setValorItens(BigDecimal valorItens) {
        this.valorItens = valorItens;
    }

    //@Column(name = "valo_fret", precision = 13, scale = 4, nullable = false, 
    //columnDefinition = "Numeric(13,4) default '0.00'")
    public BigDecimal getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(BigDecimal valorFrete) {
        this.valorFrete = valorFrete;
    }
    
    //@Enumerated(EnumType.STRING)
    //@Column(name = "desc_sobr", length = 30, nullable = false, 
    //columnDefinition = "character varying(30) default 'VALOR_TOTAL'")
    public DescontoSobre getDescontoSobre() {
        return descontoSobre;
    }

    public void setDescontoSobre(DescontoSobre descontoSobre) {
        this.descontoSobre = descontoSobre;
    }

    //@Enumerated(EnumType.STRING)
    //@Column(name = "desc_tipo", length = 11, nullable = false, 
    //columnDefinition = "character varying(11) default 'VALOR'")
    public DescontoTipo getDescontoTipo() {
        return descontoTipo;
    }

    public void setDescontoTipo(DescontoTipo descontoTipo) {
        this.descontoTipo = descontoTipo;
    }

    //@Column(name = "desc_valo", precision = 13, scale = 4, nullable = false, 
    //columnDefinition = "Numeric(13,4) default '0.00'")
    public BigDecimal getDescontoValor() {
        if(descontoValor == null){
            descontoValor = BigDecimal.ZERO;
        }
        return descontoValor;
    }

    public void setDescontoValor(BigDecimal descontoValor) {
        this.descontoValor = descontoValor;
    }

    //@Column(name = "desc_perc", precision = 5, scale = 4, nullable = false, 
    //columnDefinition = "Numeric(5,4) default '0.00'")
    public BigDecimal getDescontoPorcentagem() {
        if(descontoPorcentagem == null){
            descontoPorcentagem = BigDecimal.ZERO;
        }
        return descontoPorcentagem;
    }

    public void setDescontoPorcentagem(BigDecimal descontoPorcentagem) {
        this.descontoPorcentagem = descontoPorcentagem;
    }

    //@Column(name = "valo_tota", precision = 13, scale = 4, nullable = false, 
    //columnDefinition = "Numeric(13,4) default '0.00'")
    public BigDecimal getValorTotal() {
        if(valorTotal == null){
            valorTotal = BigDecimal.ZERO;
        }
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    //@Column(name = "obs")
    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    //@OneToMany(mappedBy = "pedido")
    public Set<PedidoItem> getPedidoItens() {
        if(pedidoItens == null){
            pedidoItens = new TreeSet<>();
        }
        return pedidoItens;
    }
    
    public void setPedidoItens(Set<PedidoItem> pedidoItens) {
        this.pedidoItens = pedidoItens;
    }
    
    public void add(PedidoItem pedimentoItem) {
        if (this.pedidoItens == null) {
            this.pedidoItens = new TreeSet<>();
        }
        pedimentoItem.setPedido(this);
        this.pedidoItens.add(pedimentoItem);
    }

    //@OneToMany(mappedBy = "pedido")
    public List<PedidoPagamento> getPedidoPagamentos() {
        if(this.pedidoPagamentos == null){
            this.pedidoPagamentos = new ArrayList<>();
        }
        return pedidoPagamentos;
    }

    public void setPedidoPagamentos(List<PedidoPagamento> pedidoPagamentos) {
        this.pedidoPagamentos = pedidoPagamentos;
    }
    
    public void add(PedidoPagamento pedimentoPagamento) {
        if (this.pedidoPagamentos == null) {
            this.pedidoPagamentos = new ArrayList<>();
        }
        pedimentoPagamento.setPedido(this);
        this.pedidoPagamentos.add(pedimentoPagamento);
    }

    //@Transient
    public String getPedidoString(){
        if(this.id != null){
            return "Pedido "+this.getId();
        } else {
            return "Novo Pedido";
        }
    }
    
    //@OneToMany(mappedBy = "pedido")
    public List<Movimento> getMovimentos() {
        return movimentos;
    }

    public void setMovimentos(List<Movimento> movimentos) {
        this.movimentos = movimentos;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.transacaoComercial);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pedido other = (Pedido) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.transacaoComercial, other.transacaoComercial)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", transacao=" + transacaoComercial + ", pedidoStatus=" + pedidoStatus + ", vendedor=" + vendedor + ", vendedorNome=" + vendedorNome + ", valorItens=" + valorItens + ", valorFrete=" + valorFrete + ", valorTotal=" + valorTotal + ", descontoSobre=" + descontoSobre + ", descontoTipo=" + descontoTipo + ", descontoValor=" + descontoValor + ", descontoPorcentagem=" + descontoPorcentagem + ", obs=" + obs + '}';
    }
}
