package net.cartola.domain;

import java.math.BigDecimal;
import java.util.Date;
//import javax.persistence.Column;
//import javax.persistence.DiscriminatorValue;
//import javax.persistence.Entity;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;

/**
 *
 * //@author DAVID.DIAS
 */
//@Entity
//@DiscriminatorValue("FUNCIONARIO")
//@Table(name = "pess_func")
//@NamedQueries({
    //@NamedQuery(name = "PessoaFuncionario.findAll", query = "SELECT p FROM PessoaFuncionario p")
//})
////@Audited //Hibernate Envers
public class PessoaFuncionario extends PessoaCadastro {

    private static final long serialVersionUID = 6465461321654L;

    private Date dataEmissRg;
    private String cnh;
    private Date dataAdmissao;
    private BigDecimal salarioMensal = BigDecimal.ZERO;
    private BigDecimal horasDiario = BigDecimal.ZERO;
    private BigDecimal horasSemanal = BigDecimal.ZERO;
    private boolean gestor = false;

    //@Temporal(TemporalType.DATE)
    //@Column(name="emis_rg")
    public Date getDataEmissRg() {
        return dataEmissRg;
    }

    public void setDataEmissRg(Date dataEmissRg) {
        this.dataEmissRg = dataEmissRg;
    }

    //@Column(name = "cnh")
    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    //@Temporal(TemporalType.DATE)
    //@Column(name="data_admi")
    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    //@Column(name = "sala_mens", precision = 13, scale = 6, nullable = false, 
  //  columnDefinition = "Numeric(13,4) default '0.00'")
    public BigDecimal getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(BigDecimal salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    //quantidade de horas diarias trabalhadas pelo funcionario
    //@Column(name = "hora_diar", precision = 13, scale = 6, nullable = false, 
 //   columnDefinition = "Numeric(13,4) default '0.00'")
    public BigDecimal getHorasDiario() {
        return horasDiario;
    }

    public void setHorasDiario(BigDecimal horasDiario) {
        this.horasDiario = horasDiario;
    }

    //quantidade de horas mensais trabalhadas pelo funcionario
    //@Column(name = "hora_mens", precision = 13, scale = 6, nullable = false, 
   // columnDefinition = "Numeric(13,4) default '0.00'")
    public BigDecimal getHorasSemanal() {
        return horasSemanal;
    }

    public void setHorasSemanal(BigDecimal horasSemanal) {
        this.horasSemanal = horasSemanal;
    }
    
    //@Column(name="gest")
    public boolean isGestor() {
        return gestor;
    }

    public void setGestor(boolean gestor) {
        this.gestor = gestor;
    }
}