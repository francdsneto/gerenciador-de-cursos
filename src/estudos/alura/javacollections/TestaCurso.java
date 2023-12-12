package estudos.alura.javacollections;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {
        Curso javaCollections = new Curso("Dominando as coleções do Java","Paulo Silveira");

        /*List<Aula> aulas = javaCollections.getAulas();
        System.out.println(aulas);
        aulas.add(new Aula("Trabalhando com ArrayList",21));*/

        /**
         * Deve-se programar defensivamente
         * Impedir que aconteça o que está na linha abaixo, onde o Objeto
         * retorna uma lista, e se solicita a essa lista que adicione uma aula.
         *
         * O correto é que o próprio objeto do tipo Curso adicione a aula que pertence a ele.
         *
         * O retorno de getAulas deve utilizar um Collections.unmmodifiableList(aulas), uma lista
         * que não pode ser alterada.
         *
         * Dessa forma força-se que para que se adicione um dentro da lista se chame o método específico
         * da classe para realizar está função, o "adiciona".
         */
        //javaCollections.getAulas().add(new Aula("Trabalhando com ArrayList",21));

        javaCollections.adiciona(new Aula("Trabalhando com ArrayList",21));
        javaCollections.adiciona(new Aula("Criando uma Aula",20));
        javaCollections.adiciona(new Aula("Modelando com coleções",22));

        /**
         * Ambas as chamadas abaixos apontam para a mesma lista de aulas
         */
        /*System.out.println(aulas);
        System.out.println(javaCollections.getAulas());
        System.out.println(aulas == javaCollections.getAulas());*/

        System.out.println(javaCollections.getAulas());

    }

}
