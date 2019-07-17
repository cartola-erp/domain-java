package net.cartola.domain;

import java.util.List;
//import javax.persistence.Column;
//import javax.persistence.DiscriminatorValue;
//import javax.persistence.Entity;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//import javax.persistence.Transient;
//import javax.persistence.UniqueConstraint;
import net.cartola.util.StringUtil;

/**
 * 26/10/2015 11:48:58
 *
 * //@author murilo
 */
////@Entity
////@DiscriminatorValue("CADASTRO")
////@Table(name = "pess_cada", uniqueConstraints = {
//    //@UniqueConstraint(name = "unk_pess_cada_cnpj", columnNames = "cpfCnpj")})
////@NamedQueries({
//    //@NamedQuery(name = "PessoaCadastro.findAll", query = "SELECT p FROM PessoaCadastro p"),
//    //@NamedQuery(name = "PessoaCadastro.findAllFull", query = "SELECT p FROM PessoaCadastro p JOIN FETCH p.enderecos JOIN FETCH p.contatos JOIN FETCH p.telefones JOIN FETCH p.emails"),
//    //@NamedQuery(name = "PessoaCadastro.porCpfCnpj", query = "select p from PessoaCadastro p where p.cpfCnpj=:cpfCnpj")
//})
////@Audited //Hibernate Envers
public class PessoaCadastro extends Pessoa {

    private static final long serialVersionUID = 1372409834821131L;
    private Long cpfCnpj;
    private String rgIe;
    private List<BancoConta> bancosContas;
    
    public PessoaCadastro() {
        super();
        setCadastroTipo(CadastroTipo.CADASTRO);
    }

//    //@Column(name = "cpf_cnpj", unique = true, length = 14)
    public Long getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(Long cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    //@Column(name = "rg_ie", length = 29)
    public String getRgIe() {
        return rgIe;
    }

    public void setRgIe(String rgIe) {
        this.rgIe = rgIe;
    }

    //@Transient
    public String getCpfCnpjString() {
        if(this.cpfCnpj == null){
            return "";
        }
        if(PessoaTipo.FISICA.equals(this.getPessoaTipo())) {
            String cpf = StringUtil.ajusta(this.cpfCnpj.toString(), 11, StringUtil.ALINHAMENTO_DIREITA, '0');
            return StringUtil.getCpfFormatado(cpf);
        } else {
            String cnpj = StringUtil.ajusta(this.cpfCnpj.toString(), 14, StringUtil.ALINHAMENTO_DIREITA, '0');
            return StringUtil.getCpfFormatado(cnpj);
        }
    }

    //@OneToMany(mappedBy = "titular")
    public List<BancoConta> getBancosContas() {
        return bancosContas;
    }

    public void setBancosContas(List<BancoConta> bancosContas) {
        this.bancosContas = bancosContas;
    }
    

    @Override
    public PessoaCadastro clone() throws CloneNotSupportedException {
        PessoaCadastro clone = (PessoaCadastro) super.clone();
        clone.cpfCnpj = this.cpfCnpj;
        clone.rgIe = this.rgIe;
        return clone;
    }
}