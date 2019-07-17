package net.cartola.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.cartola.util.StringUtil;
import net.cartola.util.StringUtil;
//import org.apache.solr.client.solrj.beans.*;

/**
 * Eh uma classe que representa todos os itens<br/>
 * que podem ser comericalizados, comprados<br/>
 * alugado ou mesmo imobilizado, isto �, <br/>
 * que possam figuar como itens de uma negociao<br/>
 * //@see http://cartola.net/doc/itensComerciais/index.htm
 * 22/07/2015 20:05:48
 * //@author murilo
 */
////@Entity
////@Table(name = "item")
////Deixando de utilizar heranda por enquanto ate que se comprove que a performance nao seja afetada
//////@DiscriminatorColumn(name="item_tipo", discriminatorType = DiscriminatorType.STRING)
//////@DiscriminatorValue("MERCADORIA")
////@XmlRootElement
////@NamedQueries({
//    //@NamedQuery(name = "Item.findAll", query = "SELECT i FROM Item i JOIN FETCH i.marca JOIN FETCH i.unidade JOIN FETCH i.categorias JOIN FETCH i.codigos")
//   ,//@NamedQuery(name = "Item.findById", query = "SELECT i FROM Item i JOIN FETCH i.marca JOIN FETCH i.unidade JOIN FETCH i.categorias JOIN FETCH i.codigos WHERE i.id=:id")
//   ,//@NamedQuery(name = "Item.findByDescricao", query = "SELECT i FROM Item i JOIN FETCH i.marca JOIN FETCH i.unidade JOIN FETCH i.categorias JOIN FETCH i.codigos WHERE i.descricao=:descricao")
//   ,//@NamedQuery(name = "Item.findBySimilaridade", query = "SELECT i FROM Item i JOIN FETCH i.marca JOIN FETCH i.unidade JOIN FETCH i.categorias JOIN FETCH i.codigos WHERE i.similaridade=:similaridade")
//})
////@Audited //Hibernate Envers
public class Item extends RegistroBase {

    private static final long serialVersionUID = 31083418231L;
    private Long id;
    private Long similaridade;
    private String qualificador;
    private boolean composto = false;
    private boolean ativo = true;
    private ItemTipo itemTipo = ItemTipo.MERCADORIA;
    private String descricao;
    private Unidade unidade;
    private Marca marca;
    private PessoaCadastro fornecedor;
    private BigDecimal precoCusto = BigDecimal.ZERO;
    private BigDecimal precoVenda = BigDecimal.ZERO;
    private BigDecimal margemBruta = BigDecimal.ZERO;
    private BigDecimal descontoMaximo = BigDecimal.ZERO;
    private BigDecimal precoLocacao = BigDecimal.ZERO;
    private BigDecimal precoReposicao = BigDecimal.ZERO;
    private LocacaoPeriodo locacaoPeriodo = LocacaoPeriodo.DIA;
    private EstoqueMovimentacaoTipo estoqueMovimentacaoTipo = EstoqueMovimentacaoTipo.FAST;
    private boolean movimentaFracao;
    private MercadoriaOrigem mercadoriaOrigem = MercadoriaOrigem.NACIONAL;
    private boolean altoValor;
    private boolean inflamavel;
    private Double cmd;
    private Unidade unidadePadrao;
    private Double pesoLiquido;
    private Double pesoBruto;
    private Integer alturaProduto;
    private Integer larguraProduto;
    private Integer profundidadeProduto;
    private Integer alturaEmbalagem;
    private Integer larguraEmbalagem;
    private Integer profundidadeEmbalagem;
    private Embalagem embalagem;
    private Integer fornecedorQuantidadeEmbalagem;
    private Integer empresaQuantidadeEmbalagem;
    private String obs;
    private List<Categoria> categorias;
    private List<ItemCodigo> codigos;
    private List<Estoque> estoques;
    private List<ItemEndereco> itemEnderecos;
    private List<ItemFoto> fotos;
    private transient Integer indicePesquisa;
    private Double devolucaoIndice;
    private Integer devolucaoQuantidade;
    private List<ItemDevolucaoOfensor> itemDevolucoesOfensores;
    private List<Comentario> comentarios;
    private List<ItemAvaliacao> avaliacoes;
    
    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_item_id")
    //@SequenceGenerator(name = "seq_item_id", sequenceName = "seq_item_id", allocationSize = 1)
    //@Column(name = "item_id")
    //@Override
    public Long getId() {
        return id;
    }
    
    //@Field("id")
    public void setId(Long id) {
        this.id = id;
    }

    public List<ItemAvaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<ItemAvaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
    
    //@Column(name="simi")
    public Long getSimilaridade() {
        return similaridade;
    }
    
    //@Field("simi")
    public void setSimilaridade(Long similaridade) {
        this.similaridade = similaridade;
    }

    //@Column(name="qual")
    public String getQualificador() {
        return qualificador;
    }

    //@Field("qual")
    public void setQualificador(String qualificador) {
        this.qualificador = qualificador;
    }
    
    //@Transient
    public String getSimilaridadeQualificador() {
        return similaridade + (StringUtil.isNotNull(qualificador) ? "-" + qualificador : "");
    }

    /*
    Define se o item � composto por outros itens
    //@return
    */
    //@Column(name="comp", nullable = false)
    public boolean getComposto() {
        return composto;
    }

    //@Field("comp")
    public void setComposto(boolean composto) {
        this.composto = composto;
    }
    
    /*
    Identifica se o modo de item est� dispon�vel ou n�o para ser utilizado nas transaaoes
    //@return
    */
    //@Column(name="ativ", nullable = false)
    public boolean getAtivo() {
        return ativo;
    }

    //@Field("ativ")
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    /**
     * Valor que define se o item � mercadoria, servi�o, locacao ou terceiro.
     * MERCADORIA por padrao
     * <br>Provavelmente este atributo seja quebrado em outros</br>
     * <br>Uma vez que o tipo eh uma coisa e a finalidade seja outra</br>
     * //@return 
     */
    //@Enumerated(EnumType.STRING)
    //@Column(name="item_tipo", length = 14, nullable = false, 
    //columnDefinition = "character varying(14) default 'MERCADORIA'")
    public ItemTipo getItemTipo() {
        return itemTipo;
    }

    //@Field("item_tipo")
    public void setItemTipo(String itemTipo){
        try{
            this.itemTipo = ItemTipo.valueOf(itemTipo);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void setItemTipo(ItemTipo itemTipo) {
        this.itemTipo = itemTipo;
    }

//    //@Column(name = "ean13", unique = true, length = 13, nullable = true)
//    public Long getEan13() {
//        return ean13;
//    }
//
//    public void setEan13(Long ean13) {
//        this.ean13 = ean13;
//    }
//

    //@Column(name = "dscr", nullable = false)
    //@NotNull(message = "E necessario informar alguma descricao.")
    //@Size(min=2,max=255, message = "O tamanho da descricao deve conter entre 2 e 255 caracteres.")
    public String getDescricao() {
        return descricao;
    }

    //@Field("dscr")
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Tipo de unidade de medida.
     * //@return
    */
    //@ManyToOne
    //@NotNull(message = "Informe a unidade.")
    //@JoinColumn(name = "unid_id", nullable = false)
    public Unidade getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }
    
    /**
     * Tipo de marca do item
     * //@return
     */
    //@ManyToOne
    //@NotNull(message = "Informe a marca.")
    //@JoinColumn(name = "marc_id", nullable = false)
    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
    /**
     * Pessoa cadastrada que corresponde a quem fornece o item
     * //@return
     */
    //@ManyToOne
    //@JoinColumn(name = "forn_id")
    public PessoaCadastro getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(PessoaCadastro fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    //@Column(name = "prec_cust", precision = 13, scale = 4, nullable = false)
    //@NotNull(message = "E necessario informar algum preco de custo.")
    public BigDecimal getPrecoCusto() {
        return precoCusto;
    }
    
    //@Field("prec_cust")
    public void setPrecoCusto(double precoCusto){
        this.precoCusto = new BigDecimal(precoCusto);
    }

    public void setPrecoCusto(BigDecimal precoCusto) {
        this.precoCusto = precoCusto;
    }

    //@Column(name = "prec_vend", precision = 13, scale = 4, nullable = false)
    //@NotNull(message = "E necessario informar algum preco de venda")
    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }
    
    //@Field("prec_vend")
    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = new BigDecimal(precoVenda);
    }
    
    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda;
    }

    /**
     * Lucro que recebe depois de pagar os custos de producao diretos e indiretos 
     * necessarios para obter o item.
     * //@return
     */
    //@Column(name = "marg_brut", precision = 5, scale = 4, nullable = false, 
    //columnDefinition = "Numeric(5,4) default '0.00'")
    //@NotNull(message = "E necessario informar o valor de margem bruta.")
    public BigDecimal getMargemBruta() {
        return margemBruta;
    }
    
    //@Field("marg_brut")
    public void setMargemBruta(double margemBruta){
        this.margemBruta = new BigDecimal(margemBruta);
    }
    
    public void setMargemBruta(BigDecimal margemBruta) {
        this.margemBruta = margemBruta;
    }

    /**
     * Porcentagem de Desconto maximo que pode ser dado no item
     * 0.50 == 50%
     * //@return 
     */
    //@Column(name = "desc_maxi", precision = 5, scale = 4, nullable = false, 
    //columnDefinition = "Numeric(5,4) default '0.00'")
    //@NotNull(message = "E necessario informar algum desconto maximo.")
    public BigDecimal getDescontoMaximo() {
        return descontoMaximo;
    }

    //@Field("desc_maxi")
    public void setDescontoMaximo(double descontoMaximo){
        this.descontoMaximo = new BigDecimal(descontoMaximo);
    }
    
    public void setDescontoMaximo(BigDecimal descontoMaximo) {
        this.descontoMaximo = descontoMaximo;
    }
    
    /**
     * Valor cobrado baseado em periodo de locacao definido
     * //@return
    */
    //@Column(name = "prec_loca", precision = 13, scale = 4, nullable = false, 
    //columnDefinition = "Numeric(13,4) default '0.00'")
    public BigDecimal getPrecoLocacao() {
        return precoLocacao;
    }

    //@Field("prec_loca")
    public void setPrecoLocacao(double precoLocacao){
        this.precoLocacao = new BigDecimal(precoLocacao);
    }
    
    public void setPrecoLocacao(BigDecimal precoLocacao) {
        this.precoLocacao = precoLocacao;
    }

    /**
     * Qual unidade de tempo que sera utilizada para definir o custo de uma locacao, DIA por padrao
     * //@return
     */
    //@Column(name = "prec_repo", precision = 13, scale = 4, nullable = false, 
    //columnDefinition = "Numeric(13,4) default '0.00'")
    public BigDecimal getPrecoReposicao() {
        return precoReposicao;
    }

    //@Field("prec_repo")
    public void setPrecoReposicao(double precoReposicao){
        this.precoReposicao = new BigDecimal(precoReposicao);
    }
    
    public void setPrecoReposicao(BigDecimal precoReposicao) {
        this.precoReposicao = precoReposicao;
    }

    //@Enumerated(EnumType.STRING)
    //@Column(name = "loca_peri", length = 7, nullable = false, 
    //columnDefinition = "character varying(7) default 'DIA'")
    public LocacaoPeriodo getLocacaoPeriodo() {
        return locacaoPeriodo;
    }

    //@Field("loca_peri")
    public void setLocacaoPeriodo(String locacaoPeriodo){
        try{
            this.locacaoPeriodo = LocacaoPeriodo.valueOf(locacaoPeriodo);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void setLocacaoPeriodo(LocacaoPeriodo locacaoPeriodo) {
        this.locacaoPeriodo = locacaoPeriodo;
    }

    /**
     * 
     * Como o estoque ir� se comportar perante este item:
     * FAST("Mais Rapido"), 
     * FIFO("Primeiro que Entra � o Primeiro que Sai"), 
     * FEFO("Primeiro que Vence � o Primeiro que Sai"), 
     * LIFO("�ltimo que Entra � o Primeiro que Sai");
     * FAST por padr�o.
     * 
     * //@return 
     */
    //@Enumerated(EnumType.STRING)
    //@Column(name = "esto_movi_tipo", nullable = false, 
    //columnDefinition = "character varying(7) default 'FAST'")
    public EstoqueMovimentacaoTipo getEstoqueMovimentacaoTipo() {
        return estoqueMovimentacaoTipo;
    }

    //@Field("esto_movi_tipo")
    public void setEstoqueMovimentacaoTipo(String estoqueMovimentacaoTipo){
        try{
            this.estoqueMovimentacaoTipo = EstoqueMovimentacaoTipo.valueOf(estoqueMovimentacaoTipo);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void setEstoqueMovimentacaoTipo(EstoqueMovimentacaoTipo estoqueMovimentacaoTipo) {
        this.estoqueMovimentacaoTipo = estoqueMovimentacaoTipo;
    }

    //@Column(name = "movi_frac", nullable = false)
    public boolean getMovimentaFracao() {
        return movimentaFracao;
    }

    public void setMovimentaFracao(boolean movimentaFracao) {
        this.movimentaFracao = movimentaFracao;
    }
   
    public String getEstoqueMovimentacaoTipoString(){
        switch (this.estoqueMovimentacaoTipo) {
            case FAST:
                return "FAST (Mais R�pido)";
            case FIFO:
                return "FIFO (Primeiro que Entra � o Primeiro que Sai)";
            case FEFO:
                return "FEFO (Primeiro que Vence � o Primeiro que Sai)";
            case LIFO:
                return "LIFO (�ltimo que Entra � o Primeiro que Sai)";
            default:
                return "-";
        }
    }

    /*
    Local de origem do item, NACIONAL por padr�o
    //@return
    */
    //@Enumerated(EnumType.STRING)
    //@Column(name = "merc_orig", length = 45, nullable = false, 
    //columnDefinition = "character varying(45) default 'NACIONAL'")
    public MercadoriaOrigem getMercadoriaOrigem() {
        return mercadoriaOrigem;
    }

    public void setMercadoriaOrigem(String mercadoriaOrigem){
        try{
            this.mercadoriaOrigem = MercadoriaOrigem.valueOf(mercadoriaOrigem);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void setMercadoriaOrigem(MercadoriaOrigem mercadoriaOrigem) {
        this.mercadoriaOrigem = mercadoriaOrigem;
    }
    
    public String getMercadoriaOrigemString() {
        switch (this.mercadoriaOrigem) {
            case NACIONAL:
                return "Nacional";
//            case MercadoriaOrigem:
//                return "Estrangeira - Importaaoo Direta";
//            case ESTRANGEIRA_ADQUIRIDO_MERCADO_INTERNO:
//                return "Estrangeira - Adquirido em Mercado Interno";
//            case NACIONAL_CONTEUDO_IMPORTADO_MAIOR_40:
//                return "Nacional - Conte�do Importado Maior 40";
//            case NACIONAL_CONFORMIDADE_PROCESSOS:
//                return "Nacional - Comformidade de Processos";
//            case NACIONAL_CONTEUDO_IMPORTADO_MENOR_40:
//                return "Nacional - Conte�do Importado Menor 40";
//            case ESTRANGEIRA_IMPORTACAO_DIRETA_CAMEX:
//                return "Estrangeira - Importaaoo Direta Camex";
//            case ESTRANGEIRA_ADQUIRIDO_MERCADO_INTERNO_CAMEX:
//                return "Estrangeira - Adquirido em Mercado Interno Camex";
//            case NACIONAL_CONTEUDO_IMPORTADO_MAIOR_70:
//                return "Nacional - Conte�do Importando Maior 70";  
            default:
                return "-";
        }
    }

    //@Column(name = "alto_valo", nullable = false)
    public boolean getAltoValor() {
        return altoValor;
    }
    
    //@Field("alto_valo")
    public void setAltoValor(boolean altoValor) {
        this.altoValor = altoValor;
    }

    //@Column(name = "infl", nullable = false)
    public boolean getInflamavel() {
        return inflamavel;
    }

    //@Field("infl")
    public void setInflamavel(boolean inflamavel) {
        this.inflamavel = inflamavel;
    }

    /**
     * Circulacao media diaria do item,
     * corresponde a soma de todas as VENDAS
     * do item em todas as unidades
     * //@return 
     */
    //@Column(name = "cmd", precision = 15, scale = 6, insertable = false, updatable = false)
    public Double getCmd() {
        return cmd;
    }
    
    //@Field("cmd")
    public void setCmd(Double cmd) {
        this.cmd = cmd;
    }
    
   //@ManyToOne
   //@JoinColumn(name = "item_unid_id")
    public Unidade getUnidadePadrao() {
        return unidadePadrao;
    }

    public void setUnidadePadrao(Unidade unidadePadrao) {
        this.unidadePadrao = unidadePadrao;
    }

    /**
     * Peso do liquido do produtosem embalagem
     * //@return pesoLiquido
     */
    //@Column(name = "peso_liqu", precision = 13, scale = 4, nullable = false)
    public Double getPesoLiquido() {
        return pesoLiquido;
    }

    //@Field("peso_liqu")
    public void setPesoLiquido(Double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }

    /**
     * <br>Peso do produto com embalagem</br>
     * <br>Normalmente utilizado para o calculo de frete</br>
     * //@return
     */
    //@Column(name = "peso_brut", precision = 13, scale = 4, nullable = false)
    public Double getPesoBruto() {
        return pesoBruto;
    }

    //@Field("peso_brut")
    public void setPesoBruto(Double pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    /**
     * Altura do item em milimetros
     * //@return
     */
    //@Column(name = "altu_prod")
    public Integer getAlturaProduto() {
        return alturaProduto;
    }

    //@Field("altu_prod")
    public void setAlturaProduto(Integer alturaProduto) {
        this.alturaProduto = alturaProduto;
    }

    /**
     * Largura do item em milimetros
     * //@return
     */
    //@Column(name = "larg_prod")
    public Integer getLarguraProduto() {
        return larguraProduto;
    }

    //@Field("larg_prod")
    public void setLarguraProduto(Integer larguraProduto) {
        this.larguraProduto = larguraProduto;
    }

    /**
     * Profundidade do item em milimetros
     * //@return
     */
    //@Column(name = "prof_prod")
    public Integer getProfundidadeProduto() {
        return profundidadeProduto;
    }

    //@Field("prof_prod")
    public void setProfundidadeProduto(Integer profundidadeProduto) {
        this.profundidadeProduto = profundidadeProduto;
    }

    /**
     * Altura da embalagem do produto em milimetros
     * //@return
     */
    //@Column(name = "altu_emba")
    public Integer getAlturaEmbalagem() {
        return alturaEmbalagem;
    }

    //@Field("altu_emba")
    public void setAlturaEmbalagem(Integer alturaEmbalagem) {
        this.alturaEmbalagem = alturaEmbalagem;
    }

    /**
     * Largura em milimetros da embalagem
     * //@return
     */
    //@Column(name = "larg_emba")
    public Integer getLarguraEmbalagem() {
        return larguraEmbalagem;
    }

    //@Field("larg_emba")
    public void setLarguraEmbalagem(Integer larguraEmbalagem) {
        this.larguraEmbalagem = larguraEmbalagem;
    }

    /**
     * Profunidade em milimetros da embalagem
     * //@return
     */
    //@Column(name = "prof_emba")
    public Integer getProfundidadeEmbalagem() {
        return profundidadeEmbalagem;
    }

    //@Field("prof_emba")
    public void setProfundidadeEmbalagem(Integer profundidadeEmbalagem) {
        this.profundidadeEmbalagem = profundidadeEmbalagem;
    }

    //@ManyToOne
    //@JoinColumn(name = "emba_id")
    public Embalagem getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(Embalagem embalagem) {
        this.embalagem = embalagem;
    }

    //@Column(name = "forn_quan_emba")
    public Integer getFornecedorQuantidadeEmbalagem() {
        return fornecedorQuantidadeEmbalagem;
    }

    public void setFornecedorQuantidadeEmbalagem(Integer fornecedorQuantidadeEmbalagem) {
        this.fornecedorQuantidadeEmbalagem = fornecedorQuantidadeEmbalagem;
    }

    //@Column(name = "empr_quan_emba")
    public Integer getEmpresaQuantidadeEmbalagem() {
        return empresaQuantidadeEmbalagem;
    }

    public void setEmpresaQuantidadeEmbalagem(Integer empresaQuantidadeEmbalagem) {
        this.empresaQuantidadeEmbalagem = empresaQuantidadeEmbalagem;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    
    /**
     * FIXME colocar as fks para funcionarem
     * //@return 
     */
    //@ManyToMany
    //@JoinTable(name = "item_cate"
        //    , joinColumns = //@JoinColumn(name = "item_id")
            //, foreignKey = //@ForeignKey(name = "fky_item_item_cate")
        //    , inverseJoinColumns = //@JoinColumn(name = "cate_id")
            //, inverseForeignKey = //@ForeignKey(name = "fky_cate_item_cate")
 //   )
    public List<Categoria> getCategorias() {
        return categorias;
    }
    
    public boolean add(Categoria categoria) {
        if (this.categorias == null) {
            this.categorias = new ArrayList<>();
        }
        return this.categorias.add(categoria);
    }
    
    public boolean remove(Categoria categoria) {
        
        if (this.categorias != null) {
            if(this.categorias.contains(categoria)){
                boolean resposta = this.categorias.remove(categoria);
                return resposta;
            }
        }
        return false;
    }
    
    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    //@OneToMany(mappedBy = "item", cascade = CascadeType.ALL)
    public List<ItemCodigo> getCodigos() {
        if(this.codigos == null){
            codigos = new ArrayList<>();
        }
        return codigos;
    }

    public boolean add(ItemCodigo codigo) {
        if (this.codigos == null) {
            this.codigos = new ArrayList<>();
        }
        codigo.setItem(this);
        return this.codigos.add(codigo);
    }

    public void setCodigos(List<ItemCodigo> codigos) {
        this.codigos = codigos;
    }

    //@OneToMany(mappedBy = "item", cascade = CascadeType.ALL)
    public List<Estoque> getEstoques() {
        return estoques;
    }
    
    public boolean add(Estoque estoque) {
        if (this.estoques == null) {
            this.estoques = new ArrayList<>();
        }
        estoque.setItem(this);
        return this.estoques.add(estoque);
    }

    public void setEstoques(List<Estoque> estoques) {
        this.estoques = estoques;
    }

    //@OneToMany(mappedBy = "item", cascade = CascadeType.ALL)
    public List<ItemEndereco> getItemEnderecos() {
        return itemEnderecos;
    }

    public boolean add(ItemEndereco itemEndereco) {
        if (this.itemEnderecos == null) {
            this.itemEnderecos = new ArrayList<>();
        }
        itemEndereco.setItem(this);
        return this.itemEnderecos.add(itemEndereco);
    }
    
    public void setItemEnderecos(List<ItemEndereco> itemEnderecos) {
        this.itemEnderecos = itemEnderecos;
    }

    //@Transient
    public List<ItemFoto> getFotos() {
        return fotos;
    }

    public void setFotos(List<ItemFoto> fotos) {
        this.fotos = fotos;
    }
    
    //@Transient
    public String getUnidadeString(){
        if (this.unidade == null){
            return "";
        } else {
            return this.unidade.getDescricao();
        }
    }
    
    //@Transient
    public String getMarcaString(){
        if (this.marca == null){
            return "";
        } else {
            return this.marca.getNome();
        }
    }
    
    //@Transient
    public Integer getIndicePesquisa() {
        return indicePesquisa;
    }

    public void setIndicePesquisa(Integer indicePesquisa) {
        this.indicePesquisa = indicePesquisa;
    }

    /**
     * Porcentagem do itens devolvidos<br/>
     * Se o item nao tem venda entao nao tem devolucao<br/>
     * As devolucoes sao calculada para o periodo da configuracao<br/>
     * //@return 
     */
    //@Column(name = "devo_indi", precision = 1, scale = 4)
    public Double getDevolucaoIndice() {
        return devolucaoIndice;
    }

    public void setDevolucaoIndice(Double devolucaoIndice) {
        this.devolucaoIndice = devolucaoIndice;
    }

    /**
     * Quantidade de itens devoluvidos no periodo de calculo<br/>
     * //@return 
     */
    //@Column(name = "devo_quan")
    public Integer getDevolucaoQuantidade() {
        return devolucaoQuantidade;
    }

    public void setDevolucaoQuantidade(Integer devolucaoQuantidade) {
        this.devolucaoQuantidade = devolucaoQuantidade;
    }

    //@OneToMany(mappedBy = "item")
    public List<ItemDevolucaoOfensor> getItemDevolucoesOfensores() {
        return itemDevolucoesOfensores;
    }

    public void setItemDevolucoesOfensores(List<ItemDevolucaoOfensor> itemDevolucoesOfensores) {
        this.itemDevolucoesOfensores = itemDevolucoesOfensores;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Item)) {
            return false;
        }
        Item other = (Item) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "Item[id=" + id + ", descricao=\"" + descricao + "\", sim=" + similaridade + 
                (this.qualificador != null && this.qualificador.length() > 0 ? "/" + qualificador : "") +"]";
    }
    
    public List<ItemAvaliacao> getAvaliacoes(ItemAvaliacaoTipo tipo){
        List<ItemAvaliacao> aux = new ArrayList<>();
        
        for(ItemAvaliacao aval : this.getAvaliacoes())
            if(aval.getAvaliacao().equals(tipo))
                aux.add(aval);
     
        return aux;
    }
    
    public Map<String, List<ItemAvaliacao>> getMapAvaliacoes(ItemAvaliacaoTipo...avaliacoesTipo ){
        Map<String, List<ItemAvaliacao>> aux = new HashMap<>();
        List<ItemAvaliacao> avaliacoes = this.getAvaliacoes();
        
        for(ItemAvaliacaoTipo tipo : avaliacoesTipo){
            List<ItemAvaliacao> auxTipo = new ArrayList<>();
            
            for(ItemAvaliacao aval : avaliacoes){
                if(aval.getAvaliacao().equals(tipo))
                    auxTipo.add(aval);
            }
            
            aux.put(tipo.toString().toLowerCase(), auxTipo);
        }
        
        return aux;
    }

    public float mediaAvaliacoes(){
        float media = 0;
        
        for(ItemAvaliacao ia : this.avaliacoes){
            media += ItemAvaliacaoTipo.getPontuacaoAvaliacao(ia.getAvaliacao());
        }
        
        if(this.avaliacoes.size() > 0){
            media /= this.avaliacoes.size();
        }
        
        return media;
    }
    
    @Override
    public Item clone() throws CloneNotSupportedException {
        Item clone = (Item) super.clone();
        clone.similaridade = this.similaridade;
        clone.qualificador = this.qualificador;
        clone.composto = this.composto;
        clone.ativo = this.ativo;
        clone.itemTipo = this.itemTipo;
        clone.descricao = this.descricao;
        if (this.unidade != null) {
            clone.unidade = this.unidade.clone();
        }
        if (this.marca != null) {
            clone.marca = this.marca.clone();
        }
        
        //clone.fornecedor =;
        clone.precoCusto = this.precoCusto;
        clone.precoVenda = this.precoVenda;
        clone.margemBruta = this.margemBruta;
        clone.descontoMaximo = this.descontoMaximo;
        clone.precoLocacao = this.precoLocacao;
        clone.precoReposicao = this.precoReposicao;
        clone.locacaoPeriodo = this.locacaoPeriodo;
        clone.estoqueMovimentacaoTipo = this.estoqueMovimentacaoTipo;
        clone.mercadoriaOrigem = this.mercadoriaOrigem;
        clone.altoValor = this.altoValor;
        clone.inflamavel = this.inflamavel;
        clone.cmd = this.cmd;
        clone.pesoLiquido = this.pesoLiquido;
        clone.pesoBruto = this.pesoBruto;
        clone.alturaProduto = this.alturaProduto;
        clone.larguraProduto = this.larguraProduto;
        clone.profundidadeProduto = this.profundidadeProduto;
        clone.alturaEmbalagem = this.alturaEmbalagem;
        clone.larguraEmbalagem = this.larguraEmbalagem;
        clone.profundidadeEmbalagem = this.profundidadeEmbalagem;
//    private List<Categoria> categorias;
//    private List<ItemCodigo> codigos;
//    private List<Estoque> estoques;
//    private List<ItemEndereco> itemEnderecos;
//    private List<ItemFoto> fotos;
        return clone;
    }


}
