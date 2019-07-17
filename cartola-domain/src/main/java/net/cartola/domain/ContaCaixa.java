package net.cartola.domain;

import java.math.BigDecimal;

/**
 * 26/04/2016 20:00:58
 * //@author murilo
 */
//@Entity
//@Table(name = "cont_caix")
//@XmlRootElement
//@NamedQueries({//@NamedQuery(name = "ContaCaixa.findAll", query = "SELECT c FROM ContaCaixa c")})
public class ContaCaixa extends RegistroBase {
    
    private static final long serialVersionUID = 257232425163612L;
    private Long id;
    private boolean sintetica;
    private ContaCaixaTipo contaCaixaTipo = ContaCaixaTipo.RECEITA;
    private ContaCaixa contaCaixa;
    private int codigo;
    private int nivel;
    private String descricao;
    private CaixaEstacao caixaEstacao;
    private BigDecimal valor;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cont_caix_id")
    //@SequenceGenerator(name = "seq_cont_caix_id", sequenceName = "seq_cont_caix_id", allocationSize = 1)
    //@Column(name = "cont_caix_id")
    //@Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@Column(name="sint", nullable = false)
    public boolean isSintetica() {
        return sintetica;
    }

    public void setSintetica(boolean sintetica) {
        this.sintetica = sintetica;
    }

    //@Enumerated(EnumType.STRING)
    //@Column(name="cont_caix_tipo", nullable = false)
    public ContaCaixaTipo getContaCaixaTipo() {
        return contaCaixaTipo;
    }

    public void setContaCaixaTipo(ContaCaixaTipo contaCaixaTipo) {
        this.contaCaixaTipo = contaCaixaTipo;
    }

    //@ManyToOne
    //@JoinColumn(name = "caix_esta_id", nullable = false)
    public CaixaEstacao getCaixaEstacao() {
        return caixaEstacao;
    }

    public void setCaixaEstacao(CaixaEstacao caixaEstacao) {
        this.caixaEstacao = caixaEstacao;
    }

    //@ManyToOne
    //@JoinColumn(name = "cont_caix_sint_id")
    public ContaCaixa getContaCaixa() {
        return contaCaixa;
    }

    public void setContaCaixa(ContaCaixa contaCaixa) {
        this.contaCaixa = contaCaixa;
    }

    //@Column(name="codi", nullable = false)
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    //@Column(name="nive", nullable = false)
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    //@Column(name = "dscr", nullable = false)
    //@NotNull(message = "� necess�rio informar alguma descri��o")
    //@Size(min = 1, max = 255, message = "tamanho da descri��o deve conter entre 1 e 255")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //@Column(name="valo", precision = 13, scale = 4)
    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

}
