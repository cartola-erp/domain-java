package net.cartola.domain;

import java.math.BigDecimal;

/**
 * 09/04/2016 23:45:38
 * @author murilo
 */
public class CurvaABC {
    private String classificacao;
    private BigDecimal percentual;

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public BigDecimal getPercentual() {
        return percentual;
    }

    public void setPercentual(BigDecimal percentual) {
        this.percentual = percentual;
    }


}
