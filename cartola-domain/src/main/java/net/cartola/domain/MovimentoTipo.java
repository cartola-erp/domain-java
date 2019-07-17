package net.cartola.domain;

/**
 * 22/07/2015 20:19:33
 * @author murilo
 */
public enum MovimentoTipo {

    /**
     * Aquisi��o de mercadorias ou servi�os<br/>
     * Esta opera��o deve ser utilizada com fornecedores.
     */
    AQUISICAO(false),
    
    /**
     * Comercializa��o de produtos e/ou servi�os.<br/>
     * Opera��o utilizada para concretizar uma venda.
     */
    VENDA(true),
    
    /**
     * Opera��o de devolu��o realizada pelo cliente<br/>
     * Pode ser utilizado para a devolu��o<br/>
     * de uma mercadoria adquirida pelo cliente<br/>
     * Recomenda-se que obrigue o preenchimento da<br/>
     * informa��o da sa�da que originou a devolu��o.<br/>
     * Tamb�m pode ser utilizada para a devolu��o da CONSIGNACAO_CLIENTE.
     */
    DEVOLUCAO_CLIENTE(false),
    
    /**
     * Opera��o de devolu��o realizada pela empresa<br/>
     * para o fornecedor, deve ser obrigat�rio o<br/>
     * preenchimento das informa��es da entrada que<br/>
     * originou a respectiva sa�da.<br/>
     * Tamb�m deve ser utilziada para a devolu��o<br/>
     * da mercadoria para o fornecedor.
     */
    DEVOLUCAO_FORNECEDOR(true),
    
    /**
     * Opera��o de envio de mercadorias da empresa para o cliente<br/>
     * Esta opera��o executar� baixa da mercadoria em estoque<br/>
     * mas n�o ir� gerar nenhum cr�dito ou d�bito e ficar� em aberto<br/>
     * at� que a devolu��o da mercadoria seja realizada..
     */
    CONSIGNACAO_CLIENTE(false),
    
    /**
     * Opera��o aonde o fornecedor cede a empresa mercadorias<br/>
     * No momento de devolver esta mercadoria deve-se utilizar DEVOLUCAO_FORNECEDOR.
     */
    CONSIGNACAO_FORNECEDOR(true),
    
    /**
     * Opera��o utilizada para:<br/>
     * <ol>
     * <li>Dar brindes aos clientes</li>
     * <li>Realizar doa��es a qualquer<br/>
     * pessoa ou entidade aonde haja<br/>
     * remessa de mercadorias</li>
     * <li>Entrega de material publicit�rio</li>
     * </ol>
     */
    CESSAO_CLIENTE(true),

    /**
     * Opera��o utilizada para receber brindes dos fornecedores
     */
    CESSAO_FORNECEDOR(false),
    
    PAGAMENTO_SALARIO(true);
    
    private final boolean saida;
    
    private MovimentoTipo(boolean saida) {
        this.saida = saida;
    }

    public boolean isSaida() {
        return saida;
    }
}
