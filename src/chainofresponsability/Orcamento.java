package chainofresponsability;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private Integer qtdItens;
    public Orcamento() {}

    public Orcamento(BigDecimal valor, Integer qtdItens) {
        this.valor = valor;
        this.qtdItens = qtdItens;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Integer getQtdItens() {
        return qtdItens;
    }

    public void setQtdItens(Integer qtdItens) {
        this.qtdItens = qtdItens;
    }
}
