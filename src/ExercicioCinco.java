import java.text.DecimalFormat;
import java.util.Scanner;

/*
* Faça um programa que peça a temperatura em graus Fahrenheit,
* transforme e mostre a temperatura em graus Celsius.
* */
public class ExercicioCinco {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);
    DecimalFormat formatter = new DecimalFormat("0.00");

    System.out.println("informe a temperatura em graus Fahrenheit: ");
    double fahrenheit = inputUsuario.nextDouble();

    double celcius = (fahrenheit - 32) /1.8;

    System.out.printf(fahrenheit + " °F em Celcius: "+ formatter.format(celcius) + " °C");
  }
}
