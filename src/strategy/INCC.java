package strategy;

import java.math.BigDecimal;

public class INCC implements Imposto {

    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.5"));
    }
}
