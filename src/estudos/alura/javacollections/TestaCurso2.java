package estudos.alura.javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {
        Curso javaCollections = new Curso("Dominando as coleções do Java","Paulo Silveira");

        javaCollections.adiciona(new Aula("Trabalhando com ArrayList",21));
        javaCollections.adiciona(new Aula("Criando uma Aula",20));
        javaCollections.adiciona(new Aula("Modelando com coleções",22));

        List<Aula> aulasImutaveis = javaCollections.getAulas();
        System.out.println(aulasImutaveis);

        /**
         * Não consigo usar o sort por que a lista quem e foi retornada pelo Objeto do tipo Curso
         * é uma lista imutável.
         */
        //Collections.sort(aulas);
        //System.out.println(aulas);

        /**
         * Ao criar uma lista passando a lista que deseja como parâmetro
         * o new irá criar uma nova lista idêntica a primeira, e essa sim pode ser alterada.
         */
        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulas);
        System.out.println(aulas);

        /**
         * Apesar de serem lista idênticas, não são a mesma lista
         */
        System.out.println(aulas == aulasImutaveis);
        System.out.println(javaCollections.getTempoTotal());

        System.out.println(javaCollections);

    }

}
