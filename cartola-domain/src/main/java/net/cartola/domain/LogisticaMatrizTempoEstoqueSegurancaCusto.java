package net.cartola.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.Set;

/**
 * 28/10/2015 16:47:53
 * //@author murilo
 */
//@Entity
//@Cacheable(true)
//@Table(name="logi_mtes_cust")
//@XmlRootElement
public class LogisticaMatrizTempoEstoqueSegurancaCusto extends RegistroBase implements Serializable {
    private static final long serialVersionUID = 1234921803481L;
    private Long id;
    private LogisticaMatrizTempoEstoqueSeguranca matriz;
    private BigDecimal custo = BigDecimal.ZERO;
    private Set<LogisticaMatrizTempoEstoqueSegurancaValor> valores;
    private transient BigDecimal novoValor;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_logi_mtc_custo_id")
    //@SequenceGenerator(name = "seq_logi_mtc_custo_id", sequenceName = "seq_logi_mtc_custo_id", allocationSize = 1)
    //@Column(name = "logi_mtc_custo_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name="logi_mtes_id")
    public LogisticaMatrizTempoEstoqueSeguranca getMatriz() {
        return matriz;
    }

    public void setMatriz(LogisticaMatrizTempoEstoqueSeguranca matriz) {
        this.matriz = matriz;
    }

    //@Column(name="cust", precision = 13, scale = 4, nullable = false)
    public BigDecimal getCusto() {
        return custo;
    }

    public void setCusto(BigDecimal custo) {
        this.custo = custo;
    }

    //@OneToMany(mappedBy = "custo")
    public Set<LogisticaMatrizTempoEstoqueSegurancaValor> getValores() {
        return valores;
    }

    public void setValores(Set<LogisticaMatrizTempoEstoqueSegurancaValor> valores) {
        this.valores = valores;
    }
    
    //@Transient
    public BigDecimal getNovoValor() {
        return novoValor;
    }

    public void setNovoValor(BigDecimal novoValor) {
        this.novoValor = novoValor;
        System.out.println("recebi valor:"+novoValor);
    }
    
    public BigDecimal getValorCurva(String curva){
        
        BigDecimal valorEncontrado = BigDecimal.ZERO;
        
        for(LogisticaMatrizTempoEstoqueSegurancaValor valor : this.valores){
            if(valor.getCurva().equals(curva)){
                valorEncontrado = valor.getValor();
                break;
            }
        }
        System.out.println("Para o "+this.custo+"/"+curva+" =:"+valorEncontrado);
        return valorEncontrado;
    }

    public void setValorCurva(String curva){
        
        for(LogisticaMatrizTempoEstoqueSegurancaValor valor : this.valores){
            if(valor.getCurva().equals(curva)){
                
                System.out.println("Antes: Para o "+this.custo+"/"+curva+" =:"+valor.getValor());
                
                valor.setValor(this.novoValor);
                
                System.out.println("Depois: Para o "+this.custo+"/"+curva+" =:"+this.novoValor);
                
                break;
            }
        }
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LogisticaMatrizTempoEstoqueSegurancaCusto other = (LogisticaMatrizTempoEstoqueSegurancaCusto) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.matriz, other.matriz)) {
            return false;
        }
        if (!Objects.equals(this.custo, other.custo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LogisticaMatrizTempoEstoqueSegurancaValor[id=" + id + ", custo='" + custo + "']";
    }

}
