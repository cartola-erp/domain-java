package net.cartola.domain;

import java.math.BigDecimal;

/**
 * 16/05/2016 11:16:06
 * //@author murilo
 */
//@Entity
//@Table(name="logi_orde_sepa_item")
//@XmlRootElement
public class LogisticaOrdemSeparacaoItem extends RegistroBase {

    private static final long serialVersionUID = 5252356362882829998L;
    private Long id;
    private LogisticaOrdemSeparacao logisticaOrdemSeparacao;
    private int sequencia;
    private Item item;
    private BigDecimal quantidade = BigDecimal.ONE;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_logi_orde_sepa_item_id")
    //@SequenceGenerator(name = "seq_logi_orde_sepa_item_id", sequenceName = "seq_logi_orde_sepa_item_id", allocationSize = 1)
    //@Column(name = "logi_orde_sepa_item_id")
    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "logi_orde_sepa_id", nullable = false)
    public LogisticaOrdemSeparacao getLogisticaOrdemSeparacao() {
        return logisticaOrdemSeparacao;
    }

    public void setLogisticaOrdemSeparacao(LogisticaOrdemSeparacao logisticaOrdemSeparacao) {
        this.logisticaOrdemSeparacao = logisticaOrdemSeparacao;
    }

    //@Column(name = "sequ")
    public int getSequencia() {
        return sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }
    
    //@ManyToOne
    //@JoinColumn(name = "item_id", nullable = false)
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    //@Column(name = "quan", precision = 13, scale = 6, nullable = false)
    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof LogisticaOrdemSeparacaoItem)) {
            return false;
        }
        LogisticaOrdemSeparacaoItem other = (LogisticaOrdemSeparacaoItem) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "LogisticaOrdemSeparacaoItem[id=" + id + "]";
    }

}
