package net.cartola.domain;

import java.util.ArrayList;
import java.util.List;
//import javax.persistence.Cacheable;
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.OneToMany;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//import javax.xml.bind.annotation.XmlAccessType;
//import javax.xml.bind.annotation.XmlAccessorType;
//import javax.xml.bind.annotation.XmlRootElement;

/**
 * 26/10/2015 22:56:50
 * //@author murilo
 */
//@Entity
//@Cacheable(true)
//@Table(name = "arma")
//@XmlRootElement
//@XmlAccessorType(XmlAccessType.PROPERTY)
//@NamedQueries({
    //@NamedQuery(name = "Armazem.findAll", query = "SELECT a FROM Armazem a")
   //,//@NamedQuery(name = "Armazem.findByEmpresaUnidadeId", query = "SELECT a FROM Armazem a WHERE a.empresaUnidade.id=:id")})
public class Armazem extends RegistroBase implements Comparable<Armazem> {
    private static final long serialVersionUID = 7778888871L;

    private Long id;
    private EmpresaUnidade empresaUnidade;
    private ArmazemTipo armazemTipo = ArmazemTipo.VAREJO;
    private String descricao;
    private Armazem centroDistribuicao;
    private Integer diasCicloAbastecimento;
    private List<ArmazemZona> zonas;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_arma_id")
    //@SequenceGenerator(name = "seq_arma_id", sequenceName = "seq_arma_id", allocationSize = 1)
    //@Column(name = "arma_id")
    public Long getId() {
        return id;
    }    
        

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "empr_unid_id", nullable = false)
    public EmpresaUnidade getEmpresaUnidade() {
        return empresaUnidade;
    }

    public void setEmpresaUnidade(EmpresaUnidade empresaUnidade) {
        this.empresaUnidade = empresaUnidade;
    }

    //@Enumerated(EnumType.STRING)
    //@Column(name = "arma_tipo", length = 20, nullable = false)
    public ArmazemTipo getArmazemTipo() {
        return armazemTipo;
    }

    public void setArmazemTipo(ArmazemTipo armazemTipo) {
        this.armazemTipo = armazemTipo;
    }

    //@Column(name = "dscr", nullable = false)
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Refer�ncia para o armaz�n do CD que abastece esta unidade
     * //@return 
     */
    //@ManyToOne
    //@JoinColumn(name = "cent_dist_id")
    public Armazem getCentroDistribuicao() {
        return centroDistribuicao;
    }

    public void setCentroDistribuicao(Armazem centroDistribuicao) {
        this.centroDistribuicao = centroDistribuicao;
    }

    /**
     * <br>A cada quantos dias o armazem de varejo</br>
     * <br>deve ser abastecido pelo centro de distribui��o</br>
     * <br>Armazens to tipo DISTRIBUICAO n�o utilizam esta informa��o</br>
     * //@return dias emtre os ciclos de abastecimento
     **/
    //@Column(name = "dias_cicl_abas", nullable = true)
    public Integer getDiasCicloAbastecimento() {
        return diasCicloAbastecimento;
    }

    public void setDiasCicloAbastecimento(Integer diasCicloAbastecimento) {
        this.diasCicloAbastecimento = diasCicloAbastecimento;
    }

    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "armazem")
    public List<ArmazemZona> getZonas() {
        return zonas;
    }

    public void setZonas(List<ArmazemZona> zonas) {
        this.zonas = zonas;
    }
    
    public boolean addZona(ArmazemZona zona) {
        if (this.zonas == null) {
            zonas = new ArrayList<>();
        }
        boolean b = zonas.add(zona);
        if (b) {
            zona.setArmazem(this);
        }
        return b;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Armazem)) {
            return false;
        }
        Armazem other = (Armazem) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return "Armazem[id=" + id + ", descricao=\"" + descricao + "\"]";
    }

    @Override
    public int compareTo(Armazem o) {
        if (o == null || o.descricao == null) {
            return 1;
        }
        if (this.descricao == null) {
            return -1;
        }
        return this.descricao.compareTo(o.descricao);
    }
    
    @Override
    public Armazem clone() throws CloneNotSupportedException {
        Armazem clone = (Armazem) super.clone();
        clone.id = this.id;
        if (empresaUnidade != null) {
            clone.empresaUnidade = this.empresaUnidade.clone();
        }
        clone.armazemTipo = this.armazemTipo;
        clone.descricao = this.descricao;
        if (this.centroDistribuicao != null) {
            clone.centroDistribuicao = this.centroDistribuicao.clone();
        }
        clone.diasCicloAbastecimento = diasCicloAbastecimento;
        if (this.zonas != null) {
            List<ArmazemZona> dzona = new ArrayList<>();
            for (ArmazemZona ozona : this.zonas) {
                dzona.add(ozona.clone());
            }
            clone.zonas = dzona;
        }
        
        return clone;
    }

}
