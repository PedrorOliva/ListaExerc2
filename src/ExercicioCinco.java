import java.util.Scanner;

/*
* Faça um programa que peça a temperatura em graus Fahrenheit,
* transforme e mostre a temperatura em graus Celsius.
* */
public class ExercicioCinco {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);

    System.out.println("informe a temperatura em graus Fahrenheit: ");
    double fahrenheit = inputUsuario.nextDouble();

    double celcius = (fahrenheit - 32) /1.8;

    System.out.println(fahrenheit + " °F em Celcius: " + celcius + " °C");
  }
}
