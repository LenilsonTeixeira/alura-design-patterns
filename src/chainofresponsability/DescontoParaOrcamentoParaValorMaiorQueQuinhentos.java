package chainofresponsability;

import java.math.BigDecimal;

public class DescontoParaOrcamentoParaValorMaiorQueQuinhentos extends Desconto{
    public DescontoParaOrcamentoParaValorMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if(orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
            return orcamento.getValor().multiply(new BigDecimal("0.2"));
        }
        return proximo.calcular(orcamento);
    }
}
