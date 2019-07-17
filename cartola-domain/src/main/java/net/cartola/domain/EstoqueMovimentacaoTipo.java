package net.cartola.domain;

/**
 *
 * @author DAVID.DIAS
 */
public enum EstoqueMovimentacaoTipo {
    
    FAST("Mais Rapido"), 
    FIFO("First In First Out"), 
    FEFO("First Expired First Out"), 
    LIFO("First In First Out");
    
    private final String descriao;
    
    private EstoqueMovimentacaoTipo(String descricao) {
        this.descriao = descricao;
    }

    public String getDescriao() {
        return descriao;
    }
    
}
