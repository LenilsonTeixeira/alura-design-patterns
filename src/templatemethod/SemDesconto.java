package templatemethod;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {
    public SemDesconto() {
        super(null);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    public Boolean deveAplicar(Orcamento orcamento) {
        return true;
    }
}
