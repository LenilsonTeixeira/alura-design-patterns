package templatemethod;

import java.math.BigDecimal;

public class DescontoParaOrcamentoParaValorMaiorQueQuinhentos extends Desconto {
    public DescontoParaOrcamentoParaValorMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.2"));
    }

    @Override
    public Boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
