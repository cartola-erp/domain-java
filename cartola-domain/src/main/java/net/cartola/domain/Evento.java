package net.cartola.domain;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.ForeignKey;
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
//import javax.validation.constraints.Size;
//import javax.xml.bind.annotation.XmlRootElement;

/**
 * 17/12/2015 13:22:16
 *
 * //@author murilo
 */
//@Entity
//@Table(name = "even")
//@XmlRootElement
//@NamedQueries({
    //@NamedQuery(name = "Evento.findAll", query = "SELECT e FROM Evento e")})
public class Evento extends RegistroBase {

    private static final long serialVersionUID = 178931820374802391L;
    private Long id;
    private String descricao;
    private TransacaoComercial transacaoComercial;
    private PessoaEndereco local;
    private PessoaCadastro anfitriao;
    private Date data;
    private EventoTipo eventoTipo = EventoTipo.ENTREGA;
    private BigDecimal valorFrete = BigDecimal.ZERO;
    private String obs;
    private boolean ativo = true;
    private List<PedidoItem> pedidoItens;
    
    private boolean incluso = false; //transient, utilizado em pedidoBean
    
    //private PessoaCadastro proprietario;
    //private Date retiradaMontagem;
    //private Date entregaDesmontagem;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_even_id")
    //@SequenceGenerator(name = "seq_even_id", sequenceName = "seq_even_id", allocationSize = 1)
    //@Column(name = "even_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    //@Column(name = "dscr", nullable = false, length = 30)
    //@Size(min=1,max=30, message = "tamanho da descri��o deve conter entre 1 e 30")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    //@ManyToOne
    //@JoinColumn(name = "tran_come_id", nullable = false)
    public TransacaoComercial getTransacaoComercial() {
        return transacaoComercial;
    }

    public void setTransacaoComercial(TransacaoComercial transacaoComercial) {
        this.transacaoComercial = transacaoComercial;
    }

    //@ManyToOne
    //@JoinColumn(name = "pess_ende_id", nullable = false)
    public PessoaEndereco getLocal() {
        return local;
    }

    public void setLocal(PessoaEndereco local) {
        this.local = local;
    }
    
    /**
     * Proprietario do evento, quem paga as contas.
     *
     * //@return
     */
    /*
    //@ManyToOne
    //@JoinColumn(name = "prop_id" ,nullable = false)
    public PessoaCadastro getProprietario() {
        return proprietario;
    }

    public void setProprietario(PessoaCadastro proprietario) {
        this.proprietario = proprietario;
    }
    */
    

    //@ManyToOne
    //@JoinColumn(name = "anfi_id")
    public PessoaCadastro getAnfitriao() {
        return anfitriao;
    }

    public void setAnfitriao(PessoaCadastro anfitriao) {
        this.anfitriao = anfitriao;
    }

    //@Temporal(TemporalType.TIMESTAMP)
    //@Column(name = "data", nullable = false)
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    //@Enumerated(EnumType.STRING)
    //@Column(name = "even_tipo", length = 30, nullable = false, 
//    columnDefinition = "character varying(30) default 'ENTREGA'")
    public EventoTipo getEventoTipo() {
        return eventoTipo;
    }

    public void setEventoTipo(EventoTipo eventoTipo) {
        this.eventoTipo = eventoTipo;
    }

    //@Column(name = "valo_fret", precision = 13, scale = 4, nullable = false, 
  //  columnDefinition = "Numeric(13,4) default '0.00'")
    public BigDecimal getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(BigDecimal valorFrete) {
        this.valorFrete = valorFrete;
    }
 
    //@Column(name = "obs")
    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    //@Column(name="ativ", nullable = false)
    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    //@OneToMany(mappedBy = "evento")    
    public List<PedidoItem> getPedidoItens() {
        return pedidoItens;
    }

    public void setPedidoItens(List<PedidoItem> pedidoItens) {
        this.pedidoItens = pedidoItens;
    }

    public void add(PedidoItem pedimentoItem) {
        if (this.pedidoItens == null) {
            this.pedidoItens = new ArrayList<>();
        }
        pedimentoItem.setEvento(this);
        this.pedidoItens.add(pedimentoItem);
    }
    
    //@Transient
    public String getDataEventoString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        if (this.data == null) {
            return "";
        } else {
            return sdf.format(this.data);
        }
    }
    
    //@Transient
    private String getDadosEvento() {
        if(descricao == null || descricao.equals("")){
            return getDataHorarioEventoString();
        } else {
            return descricao+", "+getDataHorarioEventoString();
        }
    }

    //@Transient
    public String getDataHorarioEventoString() {
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat horaFormat = new SimpleDateFormat("HH:mm");
        if (this.data == null) {
            return "";
        } else {
            return dataFormat.format(this.data) + " �s " + horaFormat.format(this.data);
        }
    }
    
    //@Transient
    public String getLocalDataEventoString(){

        if(local != null){
            return this.descricao+" em "+this.local.getEnderecoParcial()+" dia "+getDataHorarioEventoString();
        } else 
        return getDataHorarioEventoString();
    }
    
    //transient, utilizado em pedidoBean
    //@Transient 
    public boolean isIncluso() {
        return incluso;
    }

    public void setIncluso(boolean incluso) {
        this.incluso = incluso;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Evento other = (Evento) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.transacaoComercial, other.transacaoComercial)) {
            return false;
        }
        return true;
    }

    
/*
    //@Temporal(TemporalType.TIMESTAMP)
    //@Column(name = "retr_mont_data")
    public Date getRetiradaMontagem() {
        return retiradaMontagem;
    }

    public void setRetiradaMontagem(Date retiradaMontagem) {
        this.retiradaMontagem = retiradaMontagem;
    }

    //@Temporal(TemporalType.TIMESTAMP)
    //@Column(name = "entr_desm_data")
    public Date getEntregaDesmontagem() {
        return entregaDesmontagem;
    }

    public void setEntregaDesmontagem(Date entregaDesmontagem) {
        this.entregaDesmontagem = entregaDesmontagem;
    }

    /**
     * o remetente precisa entregar os materiais/servicos
     *
     * //@return
     */
    /*//@Column(name = "entr", nullable = false)
    public boolean isEntregar() {
        return entregar;
    }

    public void setEntregar(boolean entregar) {
        this.entregar = entregar;
    }
     */
    /**
     * <br>Se houver restricao quanto ao horario de inicio da entrega</br>
     * <br>este campo dervera conter o horario a partir do qual podemos</br>
     * <br>comercar a realizar a entrega</br>
     *
     * //@return
     */
    /*
    //@Temporal(TemporalType.TIMESTAMP)
    //@Column(name = "entr_inic")
    public Date getEntregaInicio() {
        return entregaInicio;
    }

    public void setEntregaInicio(Date entregaInicio) {
        this.entregaInicio = entregaInicio;
    }
     */
    /**
     * <br>Se houver restricao quanto ao horario de termino da entrega</br>
     * <br>este campo dervera conter o horario a partir do qual precisamos</br>
     * <br>terminar de realizar a entrega</br>
     *
     * //@return
     */
    /*
    //@Temporal(TemporalType.TIMESTAMP)
    //@Column(name = "entr_term")
    public Date getEntregaTermino() {
        return entregaTermino;
    }

    public void setEntregaTermino(Date entregaTermino) {
        this.entregaTermino = entregaTermino;
    }

    //@Column(name = "reti", nullable = false)
    public boolean isRetirar() {
        return retirar;
    }

    public void setRetirar(boolean retirar) {
        this.retirar = retirar;
    }

    //@Temporal(TemporalType.TIMESTAMP)
    //@Column(name = "reti_inic")
    public Date getRetirarInicio() {
        return retirarInicio;
    }

    public void setRetirarInicio(Date retirarInicio) {
        this.retirarInicio = retirarInicio;
    }

    //@Temporal(TemporalType.TIMESTAMP)
    //@Column(name = "reti_term")
    public Date getRetirarTermino() {
        return retirarTermino;
    }

    public void setRetirarTermino(Date retirarTermino) {
        this.retirarTermino = retirarTermino;
    }

    //@Column(name = "mont", nullable = false)
    public boolean isMontagem() {
        return montagem;
    }

    public void setMontagem(boolean montagem) {
        this.montagem = montagem;
    }

    //@Temporal(TemporalType.TIMESTAMP)
    //@Column(name = "mont_inic")
    public Date getMontagemInicio() {
        return montagemInicio;
    }

    public void setMontagemInicio(Date montagemInicio) {
        this.montagemInicio = montagemInicio;
    }

    //@Temporal(TemporalType.TIMESTAMP)
    //@Column(name = "mont_term")
    public Date getMontagemTermino() {
        return montagemTermino;
    }

    public void setMontagemTermino(Date montagemTermino) {
        this.montagemTermino = montagemTermino;
    }

    //@Column(name = "desm", nullable = false)
    public boolean isDesmontagem() {
        return desmontagem;
    }

    public void setDesmontagem(boolean desmontagem) {
        this.desmontagem = desmontagem;
    }
    
    //@Temporal(TemporalType.TIMESTAMP)
    //@Column(name = "desm_inic")
    public Date getDesmontagemInicio() {
        return desmontagemInicio;
    }

    public void setDesmontagemInicio(Date desmontagemInicio) {
        this.desmontagemInicio = desmontagemInicio;
    }
    
    //@Temporal(TemporalType.TIMESTAMP)
    //@Column(name = "desm_term")
    public Date getDesmontagemTermino() {
        return desmontagemTermino;
    }

    public void setDesmontagemTermino(Date desmontagemTermino) {
        this.desmontagemTermino = desmontagemTermino;
    }
    
    //@OneToMany(mappedBy = "evento")
    public List<Orcamento> getOrcamentos() {
        return orcamentos;
    }

    public void setOrcamentos(List<Orcamento> orcamentos) {
        this.orcamentos = orcamentos;
    }

    //@OneToMany(mappedBy = "evento")
    public List<Pedido> getPedidos() {
        if(this.pedidos == null){
            pedidos = new ArrayList<>();
        }
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
 
    //@OneToMany(mappedBy = "evento")
    public List<Movimento> getMovimentos() {
        return movimentos;
    }

    public void setMovimentos(List<Movimento> movimentos) {
        this.movimentos = movimentos;
    }

    //os m�todos getHorarioInicio e getHorarioTermino determinam qual 
    //sera a data comprometida na grade da Agenda
    //@Transient
    public Date getHorarioInicio() {
        if (this.tipoEnvio.equals(TipoEnvio.RETIRADA)) {
            return this.dataEvento;
        } else if (this.tipoEnvio.equals(TipoEnvio.MONTAGEM)) {
            return this.retiradaMontagem;
        }
        return null;
    }

    //@Transient
    public Date getHorarioTermino() {
        if (this.tipoEnvio.equals(TipoEnvio.RETIRADA)) {
            return this.dataEvento;
        } else if (this.tipoEnvio.equals(TipoEnvio.MONTAGEM)) {
            return this.entregaDesmontagem;
        }
        return null;
    }

    
    
    //@Transient
    public String getRetiradaMontagemString() {
        return this.getDataHorarioString(this.retiradaMontagem);
    }
    
    //@Transient
    public String getEntregaDesmontagemString() {
        return this.getDataHorarioString(this.entregaDesmontagem);
    }
*/

    

    @Override
    public String toString() {
        return "Evento{" + "id=" + id + ", descricao=" + descricao + ", local=" + local + ", data=" + data + ", tipo=" + eventoTipo + '}';
    }


    
}
