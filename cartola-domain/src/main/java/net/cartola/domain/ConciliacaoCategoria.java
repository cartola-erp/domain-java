package net.cartola.domain;

/**
 * 13/09/2016 11:19:28
 *
 * //@author ALEXANDRE.SCAVACINI
 */
//@Entity
//@Table(name = "conc_cate")
//@XmlRootElement(name = "conc_cate")
//@XmlAccessorType(XmlAccessType.FIELD)
public class ConciliacaoCategoria extends RegistroBase {

    private static final long serialVersionUID = 2930447128352490132L;
    private Long id;
    private int codigoCategoria;
    private String descricaoCategoria;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_conc_cate_id")
    //@SequenceGenerator(name = "seq_conc_cate_id", sequenceName = "seq_conc_cate_id", allocationSize = 1)
    //@Column(name = "conc_cate_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@Column(name = "cod_cate")
    public int getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(int codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    //@Column(name = "desc_cate")
    public String getDescricaoCategoria() {
        return descricaoCategoria;
    }

    public void setDescricaoCategoria(String descricaoCategoria) {
        this.descricaoCategoria = descricaoCategoria;
    }

}
