package net.cartola.domain;

import java.util.ArrayList;
import java.util.List;
//import javax.persistence.Cacheable;
//import javax.persistence.CascadeType;
//import javax.persistence.DiscriminatorValue;
//import javax.persistence.Entity;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//import javax.xml.bind.annotation.XmlRootElement;
//import javax.xml.bind.annotation.XmlTransient;

/**
 * 26/10/2015 16:45:30
 * //@author murilo
 */
//@Entity
//@Cacheable(true)
//@DiscriminatorValue("UNIDADE_EMPRESA")
//@Table(name = "empr_unid")
//@XmlRootElement
//@NamedQueries({
    //@NamedQuery(name = "EmpresaUnidade.findAll", query = "SELECT empr FROM EmpresaUnidade empr"),
    //@//NamedQuery(name = "EmpresaUnidade.findById", 
         //   query = "SELECT empr FROM EmpresaUnidade empr WHERE empr.id = :id")
//})
public class EmpresaUnidade extends PessoaCadastro {
    private static final long serialVersionUID = 2134124525438881L;
    
    private List<CompraCotacao> compraCotacao;
    private List<Armazem> armazens;
    
    public EmpresaUnidade() {
        super();
        setCadastroTipo(CadastroTipo.EMPRESA_UNIDADE);
    }
    
    //@OneToMany(mappedBy = "empresaUnidadeParaCotacao", cascade = CascadeType.ALL)
    public List<CompraCotacao> getCompraCotacao() {
        return compraCotacao;
    }
    
    public void setCompraCotacao(List<CompraCotacao> compraCotacao) {
        this.compraCotacao = compraCotacao;
    }

    //@OneToMany(mappedBy = "empresaUnidade", cascade = CascadeType.ALL)
    public List<Armazem> getArmazens() {
        return armazens;
    }
    
    public void setArmazens(List<Armazem> armazens) {
        this.armazens = armazens;
    }
    
    public boolean add(Armazem armazem) {
        if (this.armazens == null) {
            this.armazens = new ArrayList<>();
        }
        armazem.setEmpresaUnidade(this);
        return this.armazens.add(armazem);
    }
    
    private List<PessoaFuncionario> pessoaFuncionarioList;
    
    //@JoinTable(name = "empr_unid_pess_func", joinColumns = {
        //@JoinColumn(name = "empr_unid_id")}, inverseJoinColumns = {
            //@JoinColumn(name = "pess_func_id")})
    //@ManyToMany
    //@XmlTransient
    public List<PessoaFuncionario> getPessoaFuncionarioList() {
        return pessoaFuncionarioList;
    }
    
    public void setPessoaFuncionarioList(List<PessoaFuncionario> pessoaFuncionarioList) {
        this.pessoaFuncionarioList = pessoaFuncionarioList;
    }
    
    //@Override
    public EmpresaUnidade clone() throws CloneNotSupportedException {
        EmpresaUnidade clone = (EmpresaUnidade) super.clone();
        return clone;
    }
}