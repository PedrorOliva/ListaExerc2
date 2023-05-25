import java.util.Scanner;

// Faça um programa que converta metros para centímetros.
public class ExercicioTres {
  public static void main(String[] args) {
    Scanner inputUser = new Scanner(System.in);

    System.out.println("Informe a quantidade de metros que deseja converter: ");
    float metros  = inputUser.nextFloat();

    float centimetros = metros * 100;

    System.out.println("A conversão de " + metros + " para centímetros é: " + centimetros);
  }
}
