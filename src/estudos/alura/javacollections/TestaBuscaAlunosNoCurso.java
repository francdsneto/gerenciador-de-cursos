package estudos.alura.javacollections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestaBuscaAlunosNoCurso {

    public static void main(String[] args) {

        Curso javaCollections = new Curso("Dominando as coleções do Java","Paulo Silveira");

        javaCollections.adiciona(new Aula("Trabalhando com ArrayList",21));
        javaCollections.adiciona(new Aula("Criando uma Aula",20));
        javaCollections.adiciona(new Aula("Modelando com coleções",22));

        Aluno a1 = new Aluno("Andre Valadares",34321);
        Aluno a2 = new Aluno("Paula Maria", 34981);
        Aluno a3 = new Aluno("Mauricio Fernandes", 83984);

        javaCollections.matricula(a1);
        javaCollections.matricula(a2);
        javaCollections.matricula(a3);

        System.out.println("Quem é o aluno com matrícula 34981?");
        Aluno aluno = javaCollections.buscaMatriculado(34981);
        System.out.println("Aluno: "+aluno);

        /**
         * Iterando um map
         */

        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");

        pessoas.keySet().forEach(idade -> {
            System.out.println(pessoas.get(idade));
        });

        /**
         * Obtendo as keys
         */
        Set<Integer> chaves = pessoas.keySet();
        for (Integer idade : chaves) {
            System.out.println(idade);
        }

        /**
         * Obtendo os valores
         */
        Collection<String> nomes = pessoas.values();
        for (String nome : nomes) {
            System.out.println(nome);
        }

        /**
         * Onbtendo as associações
         */
        Set<Map.Entry<Integer,String>> associacoes = pessoas.entrySet();

        for (Map.Entry<Integer, String> associacao : associacoes) {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }

    }

}
