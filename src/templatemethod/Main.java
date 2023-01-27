package templatemethod;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------");
        System.out.println("");
        System.out.println("Padrão de projeto - Chain Of Responsability com Template Method");

        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        Orcamento orcamento = new Orcamento(new BigDecimal("1000"), 1);
        BigDecimal desconto = calculadoraDeDescontos.calcular(orcamento);
        System.out.println(desconto);
    }
}
