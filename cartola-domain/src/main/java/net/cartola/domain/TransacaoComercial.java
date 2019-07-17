package net.cartola.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;

/**
 * 26/10/2015 22:14:41
 * //@author murilo
 */
//@Entity
//@Table(name = "tran_come")
public class TransacaoComercial extends RegistroBase {
    private static final long serialVersionUID = 772823802340L;
    private Long id;
    private Pessoa pessoa;
    private List<Evento> eventos;
    private List<Pedido> pedidos;
    private List<Movimento> movimentos;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_tran_come_id")
    //@SequenceGenerator(name = "seq_tran_come_id", sequenceName = "seq_tran_come_id", allocationSize = 1)
    //@Column(name = "tran_come_id")  
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    //@ManyToOne
    //@JoinColumn(name = "pess_id", nullable = false)
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    //@OneToMany(mappedBy = "transacaoComercial", fetch=FetchType.EAGER)
    public List<Evento> getEventos() {
        if(this.eventos == null){
            eventos = new ArrayList<>();
        }
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }
    
    public void add(Evento evento) {
        if (this.eventos == null) {
            this.eventos = new ArrayList<>();
        }
        evento.setTransacaoComercial(this);
        this.eventos.add(evento);
    }

    //@OneToMany(mappedBy = "transacaoComercial", fetch=FetchType.EAGER)
    public List<Pedido> getPedidos() {
        if(this.pedidos == null){
            this.pedidos = new ArrayList<>();
        }
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    
    public void add(Pedido pedido) {
        if (this.pedidos == null) {
            this.pedidos = new ArrayList<>();
        }
        pedido.setTransacaoComercial(this);
        this.pedidos.add(pedido);
    }

    //@OneToMany(mappedBy = "transacaoComercial", fetch=FetchType.EAGER)
    public List<Movimento> getMovimentos() {
        if(this.movimentos == null){
            this.movimentos = new ArrayList<>();
        }
        return movimentos;
    }

    public void setMovimentos(List<Movimento> movimentos) {
        this.movimentos = movimentos;
    }
    
    public void add(Movimento movimento) {
        if (this.movimentos == null) {
            this.movimentos = new ArrayList<>();
        }
        movimento.setTransacaoComercial(this);
        this.movimentos.add(movimento);
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
        final TransacaoComercial other = (TransacaoComercial) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "TransacaoComercial{" + "id=" + id + ", pessoa=" + pessoa + '}';
    }
}
