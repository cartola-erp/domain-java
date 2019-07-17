package net.cartola.domain;


/**
 * 22/07/2015 23:58:06
 * //@author murilo
 */
//@Entity
//@Table(name = "unid", uniqueConstraints = {
    //@UniqueConstraint(columnNames = "sigla", name = "unk_unid_sigl"),
    //@UniqueConstraint(columnNames = "descricao", name = "unk_unid_desc")
//})
//@XmlRootElement
//@NamedQueries({
          //@NamedQuery(name = "Unidade.findAll", query = "SELECT u FROM Unidade u")
   //     , //@NamedQuery(name = "Unidade.findBySigla", query = "SELECT u FROM Unidade u WHERE u.sigla=:sigla")
//})
public class Unidade extends RegistroBase {

    private static final long serialVersionUID = 7438739L;
    private Long id;
    private String sigla;
    private String descricao;
    
    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_unid_id")
    //@SequenceGenerator(name = "seq_unid_id", sequenceName = "seq_unid_id", allocationSize = 1)
    //@Column(name = "unid_id")    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@Column(name = "sigl", nullable = false)
    ////@NotNull(message = "Informe alguma sigla.")
    ////@Size(min=2,max=10, message = "O tamanho da sigla deve conter entre 2 e 10 caracteres.")
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    //@Column(name = "dscr", nullable = false, length = 255)
    ////@NotNull(message = "Informe alguma descri//o.")
    ////@Size(min=2,max=255, message = "O tamanho da descri//o deve conter entre 2 e 255 caracteres.")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
       this.descricao = descricao;
    }   

 

    //@Override
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    //@Override
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Unidade)) {
            return false;
        }
        Unidade other = (Unidade) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    //@Override
    @Override
    public String toString() {
        return "Unidade[ id=" + id + ", sigla=" + sigla + ", descricao=\"" + descricao + "\"]";
    }
    
    //@Override
    @Override
    public Unidade clone() throws CloneNotSupportedException {
        Unidade clone = (Unidade) super.clone();
        clone.descricao = this.descricao;
        clone.sigla = this.sigla;
        return clone;
    }
}