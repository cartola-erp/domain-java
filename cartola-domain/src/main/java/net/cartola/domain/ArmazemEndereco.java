package net.cartola.domain;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//import javax.persistence.UniqueConstraint;
//import javax.xml.bind.annotation.XmlRootElement;

/**
 * A unidade de armazem eh a posicao a qual se vinculam os itens disponiveis para comercializacao
 * Esta unidade tem uma largura e profunidade em milimetros de maneira a que o sistema calcula a area disponivel
 * tambem deve-se registrar a carga maxima suportada para o correto dimensionamento da carga sobre a area.
 * Esta unidade eh o endereco ao qual a rooteirizacao encaminhara para guarda e coleta de material entao 
 * faz-se necessario tambem o registro da sua posicao em distancia de X, Y e Z do ponto zero do armazem.
 * 
 * 08/02/2016 00:06:12
 * //@author murilo
 */
//@Entity
//@Table(name = "arma_ende", uniqueConstraints = {//@UniqueConstraint(name = "unk_arma_ende_prio_baix", columnNames = "arma_id, prio_baix")})
//@XmlRootElement
//@NamedQueries({
    //@NamedQuery(name = "ArmazemEndereco.findAll", query = "SELECT ae FROM ArmazemEndereco ae"),
    //@NamedQuery(name = "ArmazemEndereco.findPorArmazemId", query = "SELECT ae FROM ArmazemEndereco ae WHERE ae.armazem.id=:arma_id")})
public class ArmazemEndereco extends RegistroBase {
    
    private static final long serialVersionUID = 4343424342442421L;
    private Long id;
    private Armazem armazem;
    private ArmazemZona armazemZona;
    private ArmazemEnderecoTipo armazemEnderecoTipo;
    private String curva;
    private boolean bloqueado;
    private boolean altoValor;
    private boolean permiteEntrada;
    private boolean permiteTransferencia;
    private boolean permiteExpedicao;
    private boolean permiteInflamavel;
    private Integer bloco;
    private String rua;
    private Integer nivel;
    private Integer subdivisao;
    private String etiqueta;
    private Integer prioridadeBaixa;
    private int ocupacaoVolume;
    private int ocupacaoCarga;
    private Integer x;
    private Integer y;
    private Integer z;
    
    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_arma_ende_id")
    //@SequenceGenerator(name = "seq_arma_ende_id", sequenceName = "seq_arma_ende_id", allocationSize = 1)
    //@Column(name = "arma_ende_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "arma_id", nullable = false)
    public Armazem getArmazem() {
        return armazem;
    }

    public void setArmazem(Armazem armazem) {
        this.armazem = armazem;
    }

    //@ManyToOne
    //@JoinColumn(name = "arma_zona_id", nullable = false)
    public ArmazemZona getArmazemZona() {
        return armazemZona;
    }

    public void setArmazemZona(ArmazemZona armazemZona) {
        this.armazemZona = armazemZona;
    }

    //@ManyToOne
    //@JoinColumn(name = "arma_ende_tipo_id", nullable = false)
    public ArmazemEnderecoTipo getArmazemEnderecoTipo() {
        return armazemEnderecoTipo;
    }

    public void setArmazemEnderecoTipo(ArmazemEnderecoTipo armazemEnderecoTipo) {
        this.armazemEnderecoTipo = armazemEnderecoTipo;
    }

    //@Column(name = "curv", length = 1)
    public String getCurva() {
        return curva;
    }

    public void setCurva(String curva) {
        this.curva = curva;
    }
    
    //@Column(name = "bloq", nullable = false)
    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    //@Column(name = "alto_valo", nullable = false)
    public boolean isAltoValor() {
        return altoValor;
    }

    public void setAltoValor(boolean altoValor) {
        this.altoValor = altoValor;
    }

    //@Column(name = "perm_entr", nullable = false)
    public boolean isPermiteEntrada() {
        return permiteEntrada;
    }

    public void setPermiteEntrada(boolean permiteEntrada) {
        this.permiteEntrada = permiteEntrada;
    }

    //@Column(name = "perm_tran", nullable = false)
    public boolean isPermiteTransferencia() {
        return permiteTransferencia;
    }

    public void setPermiteTransferencia(boolean permiteTransferencia) {
        this.permiteTransferencia = permiteTransferencia;
    }

    //@Column(name = "perm_expe", nullable = false)
    public boolean isPermiteExpedicao() {
        return permiteExpedicao;
    }

    public void setPermiteExpedicao(boolean permiteExpedicao) {
        this.permiteExpedicao = permiteExpedicao;
    }

    //@Column(name = "perm_infl", nullable = false)
    public boolean isPermiteInflamavel() {
        return permiteInflamavel;
    }

    public void setPermiteInflamavel(boolean permiteInflamavel) {
        this.permiteInflamavel = permiteInflamavel;
    }

    //@Column(name="bloc", nullable = false)
    public Integer getBloco() {
        return bloco;
    }

    public void setBloco(Integer bloco) {
        this.bloco = bloco;
    }

    //@Column(name="rua", nullable = false)
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    //@Column(name="nive", nullable = false)
    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    //@Column(name="subd", nullable = false)
    public Integer getSubdivisao() {
        return subdivisao;
    }

    public void setSubdivisao(Integer subdivisao) {
        this.subdivisao = subdivisao;
    }

    //@Column(name="etiq", nullable = false)
    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    /**
     * Definicao da ordem de separacao, o menor primeiro e o maior por ultimo
     * //@return 
     */
    //@Column(name = "prio_baix", nullable = false)
    public Integer getPrioridadeBaixa() {
        return prioridadeBaixa;
    }

    public void setPrioridadeBaixa(Integer prioridadeBaixa) {
        this.prioridadeBaixa = prioridadeBaixa;
    }

    //@Column(name = "ocup_volu", nullable = false)
    public int getOcupacaoVolume() {
        return ocupacaoVolume;
    }

    public void setOcupacaoVolume(int ocupacaoVolume) {
        this.ocupacaoVolume = ocupacaoVolume;
    }
    
    //@Column(name = "ocup_carg", nullable = false)
    public int getOcupacaoCarga() {
        return ocupacaoCarga;
    }

    public void setOcupacaoCarga(int ocupacaoCarga) {
        this.ocupacaoCarga = ocupacaoCarga;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ArmazemEndereco)) {
            return false;
        }
        ArmazemEndereco other = (ArmazemEndereco) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "ArmazemEndereco[ id=" + id + " ]";
    }

}
