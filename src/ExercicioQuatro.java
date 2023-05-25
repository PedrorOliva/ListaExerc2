import java.util.Scanner;

/*
* Faça um Programa que recebe o quanto você ganha por hora e o número de horas trabalhadas no mês.
* Calcule e mostre o total do seu salário no referido mês.
* */
public class ExercicioQuatro {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);

    System.out.println("informe o valor da hora trabalhada: ");
    float valorHora = inputUsuario.nextFloat();
    System.out.println("informe a quantidade de horas que você trabalhou: ");
    float horaTrabalhada = inputUsuario.nextFloat();

    float salarioMes = valorHora * horaTrabalhada;

    System.out.printf("Total a receber no referido mês: R$%,.2f " , salarioMes);
  }
}
