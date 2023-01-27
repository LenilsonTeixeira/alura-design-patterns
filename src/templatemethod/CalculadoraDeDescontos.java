package templatemethod;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto regra3 = new SemDesconto();
        Desconto regra2 = new DescontoParaOrcamentoParaValorMaiorQueQuinhentos(regra3);
        Desconto regra = new DescontoParaOrcamentoComMaisDeCintoItens(regra2);

        return regra.efetuarCalculo(orcamento);
    }
}
