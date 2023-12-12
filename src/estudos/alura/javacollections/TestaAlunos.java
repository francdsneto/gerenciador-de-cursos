package estudos.alura.javacollections;

import java.util.*;

public class TestaAlunos {

    public static void main(String[] args) {

        /**
         * Set não permite entradas repetidas
         */
        //Set<String> alunos = new HashSet<>();

        /**
         * Em vez de usar Set<String> como acima, podemos usar uma interface ainda mais generica,
         * a Collection, e assim aproveitar a capacidade de navegar entre as interface filhas
         */

        Set<String> alunos = new HashSet<>();

        alunos.add("Fulano");
        alunos.add("Sicrano");
        alunos.add("Beltrano");
        alunos.add("José");
        alunos.add("Pedro");
        alunos.add("Lucas");
        alunos.add("José");

        System.out.println(alunos);

        for (String aluno:
             alunos) {
            System.out.println(aluno);
        }

        boolean franciscoEstaMatriculado = alunos.contains("Francisco");
        System.out.println(franciscoEstaMatriculado);

        /**
         * Se precisarmos de uma funcionalidade de uma lista, como sort
         * para manipular os dados de alunos, podemos simplesmente implementar o código abaixo
         * pois a List também implementa uma collection
         */
        List<String> listaDeAlunos = new ArrayList<>(alunos);

        Collections.sort(listaDeAlunos);
        System.out.println(listaDeAlunos);

    }

}
