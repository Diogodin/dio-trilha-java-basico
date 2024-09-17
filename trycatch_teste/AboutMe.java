package trycatch_teste;


import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class AboutMe {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);


try {
    System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
    System.out.println("Digite sua idade:");
        int idade = sc.nextInt();
    System.out.println();

    System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();
        sc.nextLine();
    System.out.println("Digite seu CPF: ");
        String cpf = sc.nextLine();

        System.out.printf("Nome: %s%nIdade: %d%nAltura: %.2f%nCPF: %s", nome, idade, altura, cpf);

} catch (InputMismatchException e){

System.out.println("O campo de idade deve ser numérico.");

}


    }
}
