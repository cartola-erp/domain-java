package net.cartola.domain;

import java.io.Serializable;

/**
 * 23/03/2016 11:01:47
 * //@author murilo
 */
//@Entity
//@Table(name = "inve_arma_ende")
//@XmlRootElement
//@NamedQueries({
    //@NamedQuery(name = "InventarioArmazemEndereco.findAll", query = "SELECT i FROM InventarioArmazemEndereco i")})
public class InventarioArmazemEndereco extends RegistroBase implements Serializable {
    private static final long serialVersionUID = 122341441515536637L;

    private Long id;
    private Inventario inventario;
    private ArmazemEndereco armazemEndereco;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_inve_arma_ende_id")
    //@SequenceGenerator(name = "seq_inve_arma_ende_id", sequenceName = "seq_inve_arma_ende_id", allocationSize = 1)
    //@Column(name = "inve_arma_ende_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "inve_id", nullable = false, updatable = false)
    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    //@ManyToOne
    //@JoinColumn(name = "arma_ende_id", nullable = false, updatable = false)
    public ArmazemEndereco getArmazemEndereco() {
        return armazemEndereco;
    }

    public void setArmazemEndereco(ArmazemEndereco armazemEndereco) {
        this.armazemEndereco = armazemEndereco;
    }

   @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof InventarioArmazemEndereco)) {
            return false;
        }
        InventarioArmazemEndereco other = (InventarioArmazemEndereco) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "InventarioArmazemEndereco[id=" + id + "]";
    }

}
