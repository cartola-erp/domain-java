package net.cartola.domain;

 import java.util.Objects;
//  //javax.persistence.Column;
 //javax.persistence.Entity;
 //javax.persistence.EnumType;
 //javax.persistence.Enumerated;
 //javax.persistence.ForeignKey;
 //javax.persistence.GeneratedValue;
 //javax.persistence.GenerationType;
 //javax.persistence.Id;
 //javax.persistence.JoinColumn;
 //javax.persistence.ManyToOne;
 //javax.persistence.SequenceGenerator;
 //javax.persistence.Table;

/**
 * 25/10/2015 00:37:14
 * @author murilo
 */
//////@Entity
//@Table(name = "pess_tele")
public class PessoaTelefone extends RegistroBase {

    private static final long serialVersionUID = 122111111L;

    private Long id;
    private Pessoa pessoa;
    private PessoaTelefoneTipo pessoaTelefoneTipo = PessoaTelefoneTipo.PRINCIPAL;
    private String telefone;
    private String obs;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pess_tele_id")
   // @SequenceGenerator(name = "seq_pess_tele_id", sequenceName = "seq_pess_tele_id", allocationSize = 1)
    //@Column(name = "pess_tele_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne(optional = false)
    //@JoinColumn(name = "pess_id", referencedColumnName = "pess_id", nullable = false)
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    //@Enumerated(EnumType.STRING)
    ////@Column(name = "telefone_tipo", nullable = false//,//columnDefinition = "enum('PRINCIPAL', 'COMERCIAL', 'RESIDENCIAL') NOT NULL")
    //@Column(name = "pess_tele_tipo", nullable = false, length = 20//,//columnDefinition = "character varying(20) default 'PRINCIPAL'")
    public PessoaTelefoneTipo getPessoaTelefoneTipo() {
        return pessoaTelefoneTipo;
    }

    public void setPessoaTelefoneTipo(PessoaTelefoneTipo pessoaTelefoneTipo) {
        System.out.println("pessoaTelefoneTipo:"+pessoaTelefoneTipo);
        this.pessoaTelefoneTipo = pessoaTelefoneTipo;
    }

    public String getPessoaTelefoneTipoString() {
        switch (this.pessoaTelefoneTipo) {
            case PRINCIPAL:
                return "Principal";
            case CELULAR:
                return "Celular";
            case CELULAR_COMERCIAL:
                return "Celular Comercial";
            case CELULAR_PESSOAL:
                return "Celular Pessoal";
            case PAGER:
                return "Pager";
            case COMERCIAL:
                return "Comercial";
            case RESIDENCIAL:
                return "Residencial";
            case RECADOS:
                return "Recados";
            case FAX:
                return "Fax";
            case FAX_RESIDENCIAL:
                return "Fax Residencial";
            case FAX_COMERCIAL:
                return "Fax Comercial";
            case OUTROS:
                return "Outros";    
            default:
                return "-";
        }
    }
 
    //@Column(name = "tele", length = 15)
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        System.out.println("set:"+telefone);
        this.telefone = telefone;
    }

    //@Column(name = "obs", length = 255)
    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        System.out.println("obs:"+obs);
        this.obs = obs;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final PessoaTelefone other = (PessoaTelefone) obj;
//        if (!Objects.equals(this.telefone, other.telefone)) {
//            return false;
//        }
//        if (!Objects.equals(this.id, other.id)) {
//            return false;
//        }
//        if (!Objects.equals(this.pessoa, other.pessoa)) {
//            return false;
//        }
//        if (this.pessoaTelefoneTipo != other.pessoaTelefoneTipo) {
//            return false;
//        }
//        return true;
//    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof PessoaTelefone)) {
            return false;
        }
        PessoaTelefone other = (PessoaTelefone) object;
        if(this.id == null && other.id == null){
            return super.equals(other);
        } else
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "Telefone[ id=" + id + ", telefone=\"" + telefone + "\" ]";
    }
    
    @Override
    public PessoaTelefone clone() throws CloneNotSupportedException {
        PessoaTelefone clone = (PessoaTelefone) super.clone();
        clone.pessoaTelefoneTipo = this.pessoaTelefoneTipo;
        clone.telefone = this.telefone;
        clone.obs = this.obs;
        return clone;
    }

}
