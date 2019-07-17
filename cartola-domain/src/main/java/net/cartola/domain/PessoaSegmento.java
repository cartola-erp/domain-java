package net.cartola.domain;

import java.io.Serializable;

/**
 * 24/10/2015 18:09:54
 * //@author murilo
 */
//@Entity
//@Cacheable(true)
//@Table(name = "pess_segm", uniqueConstraints = {
    //@UniqueConstraint(name = "unk_pess_segm_dscr", columnNames = "descricao")})
public class PessoaSegmento extends RegistroBase implements Comparable<PessoaSegmento>, Serializable {

    private static final long serialVersionUID = 234085712839L;

    private Long id;
    private String descricao;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pess_segm_id")
    //@SequenceGenerator(name = "seq_pess_segm_id", sequenceName = "seq_pess_segm_id", allocationSize = 1)
    //@Column(name = "pess_segm_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@Column(name = "dscr", nullable = false)
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof PessoaSegmento)) {
            return false;
        }
        PessoaSegmento other = (PessoaSegmento) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return "PessoaSegmento[ id=" + id + ", descricao=" + descricao + "]";
    }

    @Override
    public int compareTo(PessoaSegmento o) {
        if (o == null || o.descricao == null) {
            return 1;
        }
        if (this.descricao == null) {
            return -1;
        }
        return this.descricao.compareTo(o.descricao);
    }
    
    @Override
    public PessoaSegmento clone() throws CloneNotSupportedException {
        PessoaSegmento clone = (PessoaSegmento) super.clone();
        clone.descricao = this.descricao;
        return clone;
    }

}
