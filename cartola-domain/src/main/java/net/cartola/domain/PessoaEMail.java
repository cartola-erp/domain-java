package net.cartola.domain;

import java.util.Objects;

/**
 * 25/10/2015 00:37:23
 * //@author murilo
 */
//@Entity
//@Table(name = "pess_mail")
////@Audited //Hibernate Envers
public class PessoaEMail extends RegistroBase {
    private static final long serialVersionUID = 1632L;
    private Long id;
    private Pessoa pessoa;
    private PessoaEMailTipo pessoaEMailTipo = PessoaEMailTipo.PRINCIPAL;
    private boolean recebeDocumentoFiscal = true;
    private boolean recebePedido = true;
    private boolean recebeCobranca = true;
    private String email;
    private String obs;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pess_mail_id")
    //@SequenceGenerator(name = "seq_pess_mail_id", sequenceName = "seq_pess_mail_id", allocationSize = 1)
    //@Column(name = "pess_mail_id")
    //@Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "pess_id", referencedColumnName = "pess_id", nullable = false)
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    //@Enumerated(EnumType.STRING)
    //@Column(name="pess_mail_tipo", nullable = false, length = 10, 
  //  columnDefinition = "character varying(10) default 'PRINCIPAL'")
    public PessoaEMailTipo getPessoaEMailTipo() {
        return pessoaEMailTipo;
    }

    public void setPessoaEMailTipo(PessoaEMailTipo pessoaEMailTipo) {
        this.pessoaEMailTipo = pessoaEMailTipo;
    }
    
    //@Transient
    public String getPessoaEMailTipoString() {
        switch (this.pessoaEMailTipo) {
            case PRINCIPAL:
                return "Principal";
            case COBRANCA:
                return "Cobran�a";
            case COMERCIAL:
                return "Comercial";
            case PESSOAL:
                return "Pessoal";
            default:
                return "-";
        }
    }

    //@Column(name="rece_docu_fisc", nullable = false)
    public boolean isRecebeDocumentoFiscal() {
        return recebeDocumentoFiscal;
    }

    public void setRecebeDocumentoFiscal(boolean recebeDocumentoFiscal) {
        this.recebeDocumentoFiscal = recebeDocumentoFiscal;
    }

    //@Column(name="rece_pedi", nullable = false)
    public boolean isRecebePedido() {
        return recebePedido;
    }

    public void setRecebePedido(boolean recebePedido) {
        this.recebePedido = recebePedido;
    }

    //@Column(name="rece_cobr", nullable = false)
    public boolean isRecebeCobranca() {
        return recebeCobranca;
    }

    public void setRecebeCobranca(boolean recebeCobranca) {
        this.recebeCobranca = recebeCobranca;
    }

    //@Email
    //@Column(name="mail", nullable = false, length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //@Column(name="obs")
    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    //@Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.id);
        return hash;
    }

    //@Override
    public boolean equals(Object object) {
        if (!(object instanceof PessoaEMail)) {
            return false;
        }
        PessoaEMail other = (PessoaEMail) object;
        if(this.id == null && other.id == null){
            return super.equals(other);
        } else
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    //@Override
    public String toString() {
        return "PessoaEMail[id=" + id + ", email=\"" + this.email + "\"]";
    }
    
    //@Override
    public PessoaEMail clone() throws CloneNotSupportedException {
        PessoaEMail clone = (PessoaEMail) super.clone();
        clone.pessoaEMailTipo = this.pessoaEMailTipo;
        clone.email = this.email;
        clone.obs = this.obs;
        clone.recebeCobranca = this.recebeCobranca;
        clone.recebeDocumentoFiscal = this.recebeDocumentoFiscal;
        clone.recebePedido = this.recebePedido;
        return clone;
    }

}
