package estrutura_de_repeticoes;

import java.util.Random;

public class DoWhileTest {
    public static void main(String[] args) {
do {
    System.out.println("Telefone tocando...");
}while(tocando());

System.out.println("Alô!!!");

    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);

        return ! atendeu;


    }
}
