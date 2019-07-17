package net.cartola.domain;

import java.io.Serializable;
import java.util.Objects;
;

/**
 * 25/10/2015 19:33:52
 * //@author murilo
 */
//@Entity
//@Table(name = "codi_tipo", uniqueConstraints = {
     ////@UniqueConstraint(columnNames = "dscr", name = "unk_codi_tipo")
 //  //,//@UniqueConstraint(columnNames = "sigl", name = "unk_codi_sigl")
////})
//@XmlRootElement
//@NamedQueries({
    //@NamedQuery(name = "CodigoTipo.findAll", query = "SELECT c FROM CodigoTipo c")
  // //,@NamedQuery(name = "CodigoTipo.findAllBySigla", query = "SELECT c FROM CodigoTipo c WHERE c.sigla=:sigla")//})
public class CodigoTipo extends RegistroBase implements Comparable<CodigoTipo>, Serializable {
    private static final long serialVersionUID = 99999981L;
    private Long id;
    private TipoCodigo sigla;    
    private String descricao;
    private String mascara;
    private String classeValidacao;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_codigo_tipo_id")
    //@SequenceGenerator(name = "seq_codigo_tipo_id", sequenceName = "seq_codigo_tipo_id", allocationSize = 1)
    //@Column(name = "codi_tipo_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@Column(name = "sigl", nullable = false, length = 10)
    //////@NotNull(message = "Informe alguma sigla.")
    ////@Size(min = 2, max = 10, message = "O tamanho da sigla deve possuir entre 2 e 10 caracteres.")
     public TipoCodigo getSigla() {
        return sigla;
    }

    public void setSigla(TipoCodigo sigla) {
        this.sigla = sigla;
    }

    //@Column(name = "dscr", nullable = false)
    //////@NotNull(message = "Informe alguma descri//o.")
    ////@Size(min=2,max=255, message = "O tamanho da descri//o deve conter entre 2 e 255.")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //@Column(name = "masc")
    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    //@Column(name = "clas_vali")
    public String getClasseValidacao() {
        return classeValidacao;
    }

    public void setClasseValidacao(String classeValidacao) {
        this.classeValidacao = classeValidacao;
    }

    //@Override
    public boolean equals(Object object) {
        if (!(object instanceof CodigoTipo)) {
            return false;
        }
        CodigoTipo other = (CodigoTipo) object;
            if(this.id == null && other.id == null){
            return super.equals(other);
        } else
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    //@Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.id);
        return hash;
    }

    //@Override
    public String toString() {
        return "CodigoTipo[ id=" + id + ", sigla=" + sigla + ", descricao=" + descricao + "]";
    }

    //@Override
    public int compareTo(CodigoTipo o) {
        if (o == null || o.sigla == null) {
            return 1;
        }
        if (this.sigla == null) {
            return -1;
        }
        return this.sigla.compareTo(o.sigla);
    }

}
