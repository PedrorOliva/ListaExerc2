import java.util.Scanner;

//  Faça um programa que leia um número inteiro e imprima o seu antecessor e seu sucessor.
public class ExercicioSeis {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);

    System.out.println("Digite um número inteiro qualquer: ");
    int numero = inputUsuario.nextInt();

    int antecessor = numero - 1;
    int sucessor = numero + 1;

    System.out.println("Numero digitado: " + numero);
    System.out.println("Antecessor: " + antecessor);
    System.out.println("Sucessor: " + sucessor);
  }
}
