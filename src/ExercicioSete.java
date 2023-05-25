import java.util.Scanner;

/*
 * Faça um Programa que receba o quanto você ganha por hora e o número de
 * horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido
 * mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o
 * INSS e 5% para o sindicato, faça um programa que nos dê respectivamente:
 * a) Salário bruto.
 * b) Quanto pagou ao INSS.
 * c) Quanto pagou ao sindicato.
 * d) Qual o salário líquido do funcionário.
 * */

public class ExercicioSete {
  public static void main(String[] args) {
    Scanner inputUsusario = new Scanner(System.in);

    double percImposto = 11.0;
    double percInss = 8.0;
    double percSindicato = 5.0;

    System.out.println("Informe o valor da hora trabalhada: ");
    double valorHora = inputUsusario.nextFloat();
    System.out.println("Informe quantas horas você trabalhou: ");
    double horaTrabalhada = inputUsusario.nextFloat();

    double salarioBruto = horaTrabalhada * valorHora;

    double descontoImposto = salarioBruto * (percImposto / 100);
    double inss = salarioBruto * (percInss / 100);
    double sindicato = salarioBruto * (percSindicato / 100);

    double descontos = descontoImposto + inss + sindicato;
    double salarioLiquido = salarioBruto - descontos;

    System.out.printf("Salario bruto: R$%,.2f %n", salarioBruto);
    System.out.println("Pagou ao imposto de renda: R$" + descontoImposto);
    System.out.println("Pagou ao INSS: R$" + inss);
    System.out.println("Pagou ao sindicato: R$" + sindicato);
    System.out.printf("Salário líquido do funcionário: R$%,.2f" , salarioLiquido);

  }
}
