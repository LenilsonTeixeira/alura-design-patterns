package chainofresponsability;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComMaisDeCintoItens extends Desconto{

    public DescontoParaOrcamentoComMaisDeCintoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if(orcamento.getQtdItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return proximo.calcular(orcamento);
    }
}
