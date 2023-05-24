import java.util.Scanner;

// Faça um programa que receba 4 notas bimestrais e mostre a média aritmética
public class ExercicioDois {
  public static void main(String[] args) {
    Scanner notaUsuario = new Scanner(System.in);

    System.out.println("Insira as 4 notas: ");
    float n1 = notaUsuario.nextFloat();
    float n2 = notaUsuario.nextFloat();
    float n3 = notaUsuario.nextFloat();
    float n4 = notaUsuario.nextFloat();

    float media = (n1 + n2 + n3 + n4) / 4;

    if(media < 5) {
      System.out.println("Média do aluno: " + media);
      System.out.println("REPROVADO!!");
    } else {
      System.out.println("Media do aluno: " + media);
      System.out.println("APROVADO!!");
    }


  }
}
