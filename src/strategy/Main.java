package strategy;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Padrão de projeto - Strategy");

        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        Orcamento orcamento = new Orcamento();
        orcamento.setValor(new BigDecimal("1000"));
        System.out.println(calculadora.calcular(orcamento, new ISS()));
        System.out.println(calculadora.calcular(orcamento, new INCC()));
    }
}