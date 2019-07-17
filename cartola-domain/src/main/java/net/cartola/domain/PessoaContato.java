package net.cartola.domain;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * 25/10/2015 00:37:07
 * //@author murilo
 */
//@Entity
//@Table(name = "pess_cont")
////@Audited //Hibernate Envers
public class PessoaContato extends RegistroBase implements Serializable {

    private static final long serialVersionUID = 2341211L;

    private Long id;
    private Pessoa pessoa;
    private PessoaContatoTipo pessoaContatoTipo = PessoaContatoTipo.COMERCIAL;
    private boolean autorizadoComprar = false;
    private String nome;
    private String apelido;
    private String cpf;
    private String rg;
    private String email;
    private String celular;
    private String telefoneComercial;
    private String telefoneResidencial;
    private String nextel;
    private Date nascimento;
    private String obs;
    
    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pess_cont_id")
    //@SequenceGenerator(name = "seq_pess_cont_id", sequenceName = "seq_pess_cont_id", allocationSize = 1)
    //@Column(name = "pess_cont_id")
    //@Override
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

    //@Enumerated(EnumType.STRING)
    //@Column(name = "pess_cont_tipo", length = 45, nullable = false, 
   //olumnDefinition = "character varying(45) default 'COMERCIAL'")
    public PessoaContatoTipo getPessoaContatoTipo() {
        return pessoaContatoTipo;
    }

    public void setPessoaContatoTipo(PessoaContatoTipo pessoaContatoTipo) {
        this.pessoaContatoTipo = pessoaContatoTipo;
    }
    
    //@Transient    
    public String getPessoaContatoTipoString() {
        switch (this.pessoaContatoTipo) {
            case COMERCIAL:
                return "Comercial";
            case ADMINISTRACAO:
                return "Administra//o";
            case PROPRIETARIO:
                return "Propriet�rio";
            case COMPRAS:
                return "Compras";
            case VENDEDOR:
                return "Vendedor";
            case REPRESENTANTE:
                return "Representante";
            case ASSISTENCIA_TECNICA:
                return "Assist�ncia T�cnica";
            case CONTAS_A_PAGAR:
                return "Contas a Pagar";
            case CONTAS_A_RECEBER:
                return "Contas a Receber";
            case FINANCEIRO:
                return "Financeiro";
            case MAE_OU_PAI:
                return "M�e ou Pai";
            case IRMAO:
                return "Irm�o";
            case FILHO:
                return "Filho";
            case PRIMO:
                return "Primo";
            case TIO:
                return "Tio";    
            case CUNHADO:
                return "Cunhado";
            case MECANICO:
                return "Mec�nico";
            case OUTROS:
                return "Outros";     
            default:
                return "-";
        }
    }

    //@Column(name = "auto_comp")
    public boolean isAutorizadoComprar() {
        return autorizadoComprar;
    }

    public void setAutorizadoComprar(boolean autorizadoComprar) {
        this.autorizadoComprar = autorizadoComprar;
    }
    
    //@Column(name = "nome", nullable = false, length = 255)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //@Column(name = "apel", length = 255)
    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    //@Column(name = "cpf", length = 14)
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    //@Column(name = "rg", length = 12)
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    //@Column(name = "mail", length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //@Column(name = "celu", length = 20)
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    //@Column(name = "fone_come", length = 20)
    public String getTelefoneComercial() {
        return telefoneComercial;
    }

    public void setTelefoneComercial(String telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }

    //@Column(name = "fone_resi", length = 20)
    public String getTelefoneResidencial() {
        return telefoneResidencial;
    }

    public void setTelefoneResidencial(String telefoneResidencial) {
        this.telefoneResidencial = telefoneResidencial;
    }

    //@Column(name = "nxtl", length = 20)
    public String getNextel() {
        return nextel;
    }

    public void setNextel(String nextel) {
        this.nextel = nextel;
    }

    //@Past
    //@Temporal(TemporalType.DATE)
    //@Column(name = "nasc")
    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    
    //@Transient
    public String getNascimentoString() {
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
        if (this.nascimento == null) {
            return "";
        } else {
            return dataFormat.format(this.nascimento);
        }
    }

    //@Column(name = "obs", length = 255)
    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    //@Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.id);
        return hash;
    }

//    //@Override
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
//        final PessoaContato other = (PessoaContato) obj;
//        if (this.autorizadoComprar != other.autorizadoComprar) {
//            return false;
//        }
//        if (!Objects.equals(this.nome, other.nome)) {
//            return false;
//        }
//        if (!Objects.equals(this.apelido, other.apelido)) {
//            return false;
//        }
//        if (!Objects.equals(this.cpf, other.cpf)) {
//            return false;
//        }
//        if (!Objects.equals(this.rg, other.rg)) {
//            return false;
//        }
//        if (!Objects.equals(this.id, other.id)) {
//            return false;
//        }
//        if (!Objects.equals(this.pessoa, other.pessoa)) {
//            return false;
//        }
//        if (this.pessoaContatoTipo != other.pessoaContatoTipo) {
//            return false;
//        }
//        if (!Objects.equals(this.nascimento, other.nascimento)) {
//            return false;
//        }
//        return true;
//    }

    //@Override
    public boolean equals(Object object) {
        if (!(object instanceof PessoaContato)) {
            return false;
        }
        PessoaContato other = (PessoaContato) object;
        if(this.id == null && other.id == null){
            return super.equals(other);
        } else
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    //@Override
    public String toString() {
        return "PessoaContato[id=" + id + ", nome=" + nome + ", tipo=" + pessoaContatoTipo + "]";
    }
    
    //@Override
    public PessoaContato clone() throws CloneNotSupportedException {
        PessoaContato clone = (PessoaContato) super.clone();
        return clone;
    }

}
