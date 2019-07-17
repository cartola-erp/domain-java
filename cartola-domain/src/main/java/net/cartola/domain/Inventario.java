package net.cartola.domain;

import java.util.Date;

/**
 * 23/03/2016 10:42:13
 * //@author murilo
 */
//@Entity
//@Table(name = "inve")
//@XmlRootElement
//@NamedQueries({
    //@NamedQuery(name = "Inventario.findAll", query = "SELECT i FROM Inventario i")})
public class Inventario extends RegistroBase {
    
    private static final long serialVersionUID = 177372546362L;
    
    private Long id;
    private Date inicio;
    private Date fim;
    private InventarioTipo inventarioTipo;
    private InventarioSituacao inventarioSituacao;
    

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_inve_id")
    //@SequenceGenerator(name = "seq_inve_id", sequenceName = "seq_inve_id", allocationSize = 1)
    //@Column(name = "inve_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@Temporal(TemporalType.TIMESTAMP)
    //@Column(name = "inic")
    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    //@Temporal(TemporalType.TIMESTAMP)
    //@Column(name = "fim")
    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }

    //@Enumerated(EnumType.STRING)
    //@Column(name = "inve_tipo", length = 14, nullable = false, 
    //columnDefinition = "character varying(14) default 'GERAL'")
    public InventarioTipo getInventarioTipo() {
        return inventarioTipo;
    }

    public void setInventarioTipo(InventarioTipo inventarioTipo) {
        this.inventarioTipo = inventarioTipo;
    }

    //@Enumerated(EnumType.STRING)
    //@Column(name = "inve_situ", length = 14, nullable = false, 
    //columnDefinition = "character varying(14) default 'EXECUCAO'")
    public InventarioSituacao getInventarioSituacao() {
        return inventarioSituacao;
    }

    public void setInventarioSituacao(InventarioSituacao inventarioSituacao) {
        this.inventarioSituacao = inventarioSituacao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Inventario)) {
            return false;
        }
        Inventario other = (Inventario) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "Inventario[id=" + id + ", tipo=" + inventarioTipo + ", situacao=" + inventarioSituacao + "]";
    }

}
