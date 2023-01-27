package strategy;

import java.math.BigDecimal;

public class Orcamento {

    public Orcamento() {}

    public Orcamento(BigDecimal valor) {
        this.valor = valor;
    }

    private BigDecimal valor;

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
