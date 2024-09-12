package estrutura_de_repeticoes;

public class ForArrayTeste {
    public static void main(String[] args) {

        String alunos [] = {"Diogo", "Leo", "Matheus", "Gabriel"};

              /*  for (int i=0; i<= alunos.length; i++){
                    System.out.println ("O aluno no indice i=" + i + "é o: " + alunos[i]);


                }
            */

        for (String aluno : alunos){
           System.out.printf("Nome do aluno é: %s%n ", aluno);
        }
    }
}
