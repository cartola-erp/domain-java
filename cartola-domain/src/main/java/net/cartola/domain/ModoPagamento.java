package net.cartola.domain;

import java.math.BigDecimal;
//import javax.persistence.Cacheable;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//import javax.persistence.Transient;
//import javax.persistence.UniqueConstraint;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//import javax.xml.bind.annotation.XmlRootElement;

/**
 * 22/07/2015 23:21:12
 *
 * //@author murilo
 */
////@Entity
////@Cacheable(true)
////@Table(name = "modo_paga", uniqueConstraints = {
//    //@UniqueConstraint(columnNames = "descricao", name = "unk_modo_pgto_desc")
//})
////@XmlRootElement
////@NamedQueries({
//    //@NamedQuery(name = "ModoPagamento.findAll", query = "SELECT f FROM ModoPagamento f")})
public class ModoPagamento extends RegistroBase {

    private static final long serialVersionUID = 24397124809321L;
    private Long id;
    private FormaRecebimento formaRecebimento = FormaRecebimento.DINHEIRO_A_VISTA;
    private String descricao;
    private int codigoPagamentoNfe = 1;
    private int codigoPagamentoSat = 1;
    private boolean ativo = true;
    private PeriodoCalculoTipo periodoCalculoTipo = PeriodoCalculoTipo.DIA;
    private String calculo = "0";
    private AcrescimoTipo acrescimoTipo = AcrescimoTipo.SEM_ACRESCIMO;
    private BigDecimal acrescimoValor = BigDecimal.ZERO;
    private BigDecimal acrescimoPorcentagem = BigDecimal.ZERO;
    private int qtdParcelas = 1;
    private BigDecimal faturamentoMinimoPermitido = BigDecimal.ZERO;
    private boolean requerCadastro = false;
    private boolean permiteGerarNota = true;
    private boolean permiteGerarSat = true;
    private boolean permiteGerarDav = true;
    private boolean permiteGerarCobranca = true;
    private boolean permiteTef = true;
    private boolean permiteCliente = true;
    private boolean permiteFornecedor = true;
    private boolean permitePagamentoCobranca = true;
    private boolean permiteGerarUtilizarCredito = true;
    private boolean exigeNomeComprador = true;

//@Id;
//    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_modo_paga_id")
//    //@SequenceGenerator(name = "seq_modo_paga_id", sequenceName = "seq_modo_paga_id", allocationSize = 1)
//    //@Column(name = "modo_paga_id")
    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * <br>Define a forma de recebimento do modo de pagamento.</br>
     * <br>O valor definido neste campo, impacta nos seguintes processos do sistema.</br>
     * <ol>
     * <li>1 Fechamento de caixa</li>
     * <li>2 Faturado do cadastro do Cliente</li>
     * <li>3 Geracao de Cobranca seja por acumulo ou nao: Uma Cobranca so e gerada, DINHEIRO_A_VISTA por padrao</li>
     * </ol>
     * //@return *
     */
//    //@Enumerated(EnumType.STRING)
//    //@Column(name = "form_rece", length = 30, nullable = false, 
//    columnDefinition = "character varying(30) default 'DINHEIRO_A_VISTA'")
    public FormaRecebimento getFormaRecebimento() {
        return formaRecebimento;
    }

    public void setFormaRecebimento(FormaRecebimento formaRecebimento) {
        this.formaRecebimento = formaRecebimento;
    }

    public String getFormaRecebimentoString() {
        switch (formaRecebimento) {
            case DINHEIRO_A_VISTA:
                return "Dinheiro a Vista";
            case DEBITO:
                return "D�bito";
            case CREDITO:
                return "Cr�dito";
            case CHEQUE:
                return "Cheque";
            case CHEQUE_A_VISTA:
                return "Cheque � Vista";
            case A_PRAZO:
                return "A Prazo";
            case ADIANTAMENTO_CLIENTE:
                return "Adiantamento Cliente";
            case DEPOSITO_EM_CONTA:
                return "A Prazo";
            case CARTAO_REFEICAO:
                return "A Prazo";
            case VALE_REFEICAO:
                return "A Prazo";
            default:
                return "-";
        }
    }

//    //@Column(name = "dscr", nullable = false)
//    //@NotNull(message = "� necess�rio informar alguma descri��o.")
//    //@Size(min=2,max=255, message = "O tamanho da descri��o deve conter entre 2 e 255 caracteres.")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * C�digo que identifica o tipo de pagamento na Nfe, que por padr�o do
     * governo �: 0 A vista, 1 A prazo, 2 Outros
     *
     * //@return
     *
     */
//    //@Column(name = "cod_paga_nfe", nullable = false)
    public int getCodigoPagamentoNfe() {
        return codigoPagamentoNfe;
    }

    public void setCodigoPagamentoNfe(int codigoPagamentoNfe) {
        this.codigoPagamentoNfe = codigoPagamentoNfe;
    }

//    //@Transient
    public String getCodigoPagamentoNfeString() {
        switch (codigoPagamentoNfe) {
            case 0:
                return "A Vista";
            case 1:
                return "A Prazo";
            default:
                return "Outros";
        }
    }

    /**
     * C�digo que identifica o tipo de pagamento no SAT, que por padr�o do
     * governo 1 Dinheiro, 2 Cheque, 3 Cart�o de Cr�dito, 4 Cart�o de D�bito, 5
     * Cart�o Refei��o/Alimenta��o, 6 Vale Refei��o/Alimenta��o em Papel, 7
     * Outros
     *
     * //@return
     *
     */
//    //@Column(name = "cod_paga_sat", nullable = false)
    public int getCodigoPagamentoSat() {
        return codigoPagamentoSat;
    }

    public void setCodigoPagamentoSat(int codigoPagamentoSat) {
        this.codigoPagamentoSat = codigoPagamentoSat;
    }

//    //@Transient
    public String getCodigoPagamentoSatString() {
        switch (codigoPagamentoSat) {

            case 1:
                return "Dinheiro";
            case 2:
                return "Cheque";
            case 3:
                return "Cart�o de Cr�dito";
            case 4:
                return "Cart�o de D�bito";
            case 5:
                return "Cart�o Refei��o/Alimenta��o";
            case 6:
                return "Vale Refei��o/Alimenta��o em Papel";
            default:
                return "Outros";
        }
    }

    /*
    *Identifica se o modo de pagamento est� dispon�vel ou n�o para ser utilizado nas transa��es
    * //@return
    */
    //@Column(name = "ativ", nullable = false)
    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    /*Define o tipo de per�odo que ser� usado, para o 
    * c�lculo dos vencimentos, por padr�o os valores s�o:Dia(s), Semana(s) e M�s(�s)
      , DIA por padr�o
    * //@return
    */
    //@Enumerated(EnumType.STRING)
    //@Column(name = "peri_calc_tipo", length = 14, nullable = false, 
 //   columnDefinition = "character varying(14) default 'DIA'")
    public PeriodoCalculoTipo getPeriodoCalculoTipo() {
        return periodoCalculoTipo;
    }

    public void setPeriodoCalculoTipo(PeriodoCalculoTipo periodoCalculoTipo) {
        this.periodoCalculoTipo = periodoCalculoTipo;
    }

    /*
        Forma com que o sistema administra os c�lculos de vencimentos das opera��es financeiras. 
        ex: Se o per�odo definido no campo C�lculo Per�odo for Dia(s) e no campo C�lculo for informado
        o n�mero 30, o sistema gerar� uma parcela com a data de vencimento 30 dias ap�s a emiss�o da
        opera��o financeira. Se desejar 30/60/90, desta forma, o sistema gerar� tr�s parcelas de pagamento,
        com vencimentos em, 30 dias, 60 dias e 90 dias ap�s a emiss�o da opera��o financeira.
    
    * //@return
     */
    //@Column(name = "calc", nullable = false)
    //@NotNull(message = "� necess�rio informar o c�lculo")
    //@Size(min = 1, max = 255, message = "tamanho do c�lculo deve conter entre 1 e 255")
    public String getCalculo() {
        return calculo;
    }

    public void setCalculo(String calculo) {
        this.calculo = calculo;
    }

    /*
    *Define o tipo de acr�scimo que o modo de pagamento pode ter, dentrodos valores padr�o: 
    *(Sem Acr�scimo, Porcentagem e Valor fixo), SEM_ACRESCIMO por padr�o
    *   //@return
    */
    //@Enumerated(EnumType.STRING)
    //@Column(name = "acre_tipo", length = 20, nullable = false, 
   // columnDefinition = "character varying(20) default 'SEM_ACRESCIMO'")
    public AcrescimoTipo getAcrescimoTipo() {
        return acrescimoTipo;
    }

    public void setAcrescimoTipo(AcrescimoTipo acrescimoTipo) {
        this.acrescimoTipo = acrescimoTipo;
    }
    
    public String getAcrescimoTipoString(){
        switch(this.acrescimoTipo){
            case PORCENTAGEM:
                return "Porcentagem";
            case VALOR_FIXO:
                return "Valore Fixo";
            default:
                return "Sem Acr�scimo";
        }
    }

    /*
    Define o valor do acr�scimo a ser dado, caso a forma de acr�scimo seja 'Valor Fixo'
    //@return
    */
    //@Column(name = "acre_valo", precision = 13, scale = 4, nullable = false, 
       //     columnDefinition = "Numeric(13,4) default '0.00'")
    public BigDecimal getAcrescimoValor() {
        if(this.acrescimoValor == null){
            this.acrescimoValor = BigDecimal.ZERO;
        }
        return acrescimoValor;
    }

    public void setAcrescimoValor(BigDecimal acrescimoValor) {
        this.acrescimoValor = acrescimoValor;
    }
    
    /*
    Define o valor do acr�scimo a ser dado, caso a forma de acr�scimo seja 'Porcentagem'
    //@return
    */
    //@Column(name = "acre_porc", precision = 5, scale = 4, nullable = false, 
  //  columnDefinition = "Numeric(5,4) default '0.00'")
    public BigDecimal getAcrescimoPorcentagem() {
        if(this.acrescimoPorcentagem == null){
            this.acrescimoPorcentagem = BigDecimal.ZERO;
        }
        return acrescimoPorcentagem;
    }

    public void setAcrescimoPorcentagem(BigDecimal acrescimoPorcentagem) {
        this.acrescimoPorcentagem = acrescimoPorcentagem;
    }


    /**
     * � o n�mero de parcelas que o campo c�lculo possui
     *
     * //@return
     *
     */
    //@Column(name = "qtd_parc")
    public int getQtdParcelas() {
        return qtdParcelas;
    }

    public void setQtdParcelas(int qtdParcelas) {
        this.qtdParcelas = qtdParcelas;
    }

    /*
        Define o valor m�nimo, aceit�vel, em uma transa��o financeira (Venda, Gera��o de cobran�a). 
        Um aviso � apresentado em tela, caso o valor total da transa��o seja menor que o definido 
        no campo ?Faturamento M�nimo Permitido?. Isso s� acontece caso a op��o ?Considera Faturamento 
        M�nimo? do cadastro do cliente estiver selecionado, caso n�o esteja, o sistema ignora o valor 
        colocado de Faturamento M�nimo.
        //@return
    */
    //@Column(name = "fatu_mini_perm", precision = 13, scale = 4, nullable = false, 
  //  columnDefinition = "Numeric(13,4) default '0.00'")
    public BigDecimal getFaturamentoMinimoPermitido() {
        return faturamentoMinimoPermitido;
    }

    public void setFaturamentoMinimoPermitido(BigDecimal faturamentoMinimoPermitido) {
        this.faturamentoMinimoPermitido = faturamentoMinimoPermitido;
    }

    /**
     * Define se o modo de pagamento poder� ou n�o ser utilizado sem o devido
     * cadastro (CPF/CNPJ) do Cliente/Fornecedor
     *
     * //@return
     *
     */
    //@Column(name = "requ_cada", nullable = false)
    public boolean isRequerCadastro() {
        return requerCadastro;
    }

    public void setRequerCadastro(boolean requerCadastro) {
        this.requerCadastro = requerCadastro;
    }

    /**
     * Define se o modo de pagamento poder� ou n�o ser utilizado em uma Nfe
     *
     * //@return
     *
     */
    //@Column(name = "perm_gera_nota", nullable = false)
    public boolean isPermiteGerarNota() {
        return permiteGerarNota;
    }

    public void setPermiteGerarNota(boolean permiteGerarNota) {
        this.permiteGerarNota = permiteGerarNota;
    }

    /**
     * Define se o modo de pagamento poder� ou n�o ser utilizado em um SAT
     *
     * //@return
     *
     */
    //@Column(name = "perm_gera_sat", nullable = false)
    public boolean isPermiteGerarSat() {
        return permiteGerarSat;
    }

    public void setPermiteGerarSat(boolean permiteGerarSat) {
        this.permiteGerarSat = permiteGerarSat;
    }

    /**
     * Define se o modo de pagamento poder� ou n�o ser utilizado em um DAV
     * (Documento Auxiliar de Venda)
     *
     * //@return
     *
     */
    //@Column(name = "perm_gera_dav", nullable = false)
    public boolean isPermiteGerarDav() {
        return permiteGerarDav;
    }

    public void setPermiteGerarDav(boolean permiteGerarDav) {
        this.permiteGerarDav = permiteGerarDav;
    }

    /**
     * Define se o modo de pagamento poder� ou n�o ser utilizado em uma
     * Cobran�a. Ex: Caso o modo de pagamento n�o esteja com o Campo Permite
     * Gerar Cobran�a selecionado, ao fazer uma opera��o que gere boleto, o
     * sistema apresentar� um aviso, informando que esse modo de pagamento n�o �
     * permitido para gerar cobran�a.
     *
     * //@return
     *
     */
    //@Column(name = "perm_gera_cobr", nullable = false)
    public boolean isPermiteGerarCobranca() {
        return permiteGerarCobranca;
    }

    public void setPermiteGerarCobranca(boolean permiteGerarCobranca) {
        this.permiteGerarCobranca = permiteGerarCobranca;
    }

    /**
     * Define se o modo de pagamento poder� ou n�o ser utilizado em uma
     * transa��o TEF ( )
     *
     * //@return
     *
     */
    //@Column(name = "perm_tef", nullable = false)
    public boolean isPermiteTef() {
        return permiteTef;
    }

    public void setPermiteTef(boolean permiteTef) {
        this.permiteTef = permiteTef;
    }

    /**
     * Define se o modo de pagamento poder� ou n�o ser utilizado com opera��es
     * que envolvem Cliente.
     *
     * //@return
     *
     */
    //@Column(name = "perm_clie", nullable = false)
    public boolean isPermiteCliente() {
        return permiteCliente;
    }

    public void setPermiteCliente(boolean permiteCliente) {
        this.permiteCliente = permiteCliente;
    }

    /**
     * Permite se o modo de pagamento poder� ou n�o ser utilizado com opera��es
     * que envolvem Fornecedor.
     *
     * //@return
     *
     */
    //@Column(name = "perm_forn", nullable = false)
    public boolean isPermiteFornecedor() {
        return permiteFornecedor;
    }

    public void setPermiteFornecedor(boolean permiteFornecedor) {
        this.permiteFornecedor = permiteFornecedor;
    }

    /**
     * Define se o modo de pagamento poder� ou n�o ser utilizado em baixas de
     * cobran�a (Contas a Receber). Ex: Um Modo de Pagamento � prazo, n�o pode
     * ser utilizado em uma baixa de boleto, pois a baixa do boleto � o
     * recebimento efetivo do mesmo, seja em dinheiro, cart�o d�bito, cart�o
     * cr�dito, etc. Sendo assim, um modo de pagamento � prazo, deve ser
     * desconsiderado pelo sistema na hora de uma baixa de cobran�a. Este campo
     * (Permite Pagamento de Cobran�a), define se o sistema deve ignorar o modo
     * de pagamento ou n�o, no cadastro de uma baixa de cobran�a.
     *
     * //@return
     *
     */
    //@Column(name = "perm_paga_cobr", nullable = false)
    public boolean isPermitePagamentoCobranca() {
        return permitePagamentoCobranca;
    }

    public void setPermitePagamentoCobranca(boolean permitePagamentoCobranca) {
        this.permitePagamentoCobranca = permitePagamentoCobranca;
    }

    /**
     * Permite se o modo de pagamento poder� ou n�o ser utilizado em gera��o de
     * cr�dito ao cliente. Ex: Um cliente faz um pagamento com cheque, de uma
     * compra que acabou de fazer, mas, o valor do cheque � maior que o valor da
     * venda. � decidido ent�o, que a diferen�a ficar� como cr�dito ao cliente,
     * para ser utilizado em uma compra futura. Sendo assim, a compra do cliente
     * ser� paga, totalmente, com o cheque e um cr�dito ser� gerado para o valor
     * restante do mesmo. Na pr�xima compra deste cliente, ao definir o
     * pagamento dela, ser� utilizado um modo de pagamento que Permite Gerar e
     * Utilizar Cr�dito, com o valor restante do cheque, da compra anterior,
     * fazendo com que o sistema entenda que o valor deste modo de pagamento n�o
     * deve ser faturado, nem entrar como recebido no fechamento de caixa.
     *
     * //@return
     *
     */
    //@Column(name = "perm_gera_util_cred", nullable = false)
    public boolean isPermiteGerarUtilizarCredito() {
        return permiteGerarUtilizarCredito;
    }

    public void setPermiteGerarUtilizarCredito(boolean permiteGerarUtilizarCredito) {
        this.permiteGerarUtilizarCredito = permiteGerarUtilizarCredito;
    }

    /**
     * Define se o modo de pagamento exige ou n�o que o nome do comprador seja
     * informado em uma venda.
     *
     * //@return
     *
     */
    //@Column(name = "exig_nome_comp", nullable = false)
    public boolean isExigeNomeComprador() {
        return exigeNomeComprador;
    }

    public void setExigeNomeComprador(boolean exigeNomeComprador) {
        this.exigeNomeComprador = exigeNomeComprador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ModoPagamento)) {
            return false;
        }
        ModoPagamento other = (ModoPagamento) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "ModoPagamento[id=" + id + ", descricao=\"" + descricao + "\"]";
    }
}
