package templatemethod;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComMaisDeCintoItens extends Desconto {

    public DescontoParaOrcamentoComMaisDeCintoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public Boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQtdItens() > 5;
    }

}
