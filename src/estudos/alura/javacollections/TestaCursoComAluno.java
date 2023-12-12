package estudos.alura.javacollections;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {
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

        System.out.println("Todos os alunos matriculados neste curso:");
        javaCollections.getAlunos().forEach(System.out::println);

        System.out.println("O aluno "+ a1 +" está matriculado?");
        System.out.println(javaCollections.estaMatriculado(a1));

        /**
         * Comparando com equals
         */
        Aluno andre = new Aluno("Andre Valadares",34321);
        System.out.println("Este andré está matriculado?");
        System.out.println(javaCollections.estaMatriculado(andre));

        System.out.println("O aluno a1 é equals andre?");
        System.out.println(a1.equals(andre));

        /**
         * Obrigatoriamente quando implementamos o hashcode na classe, os objetos precisam ter
         * hashcodes iguais
          */
        System.out.println(a1.hashCode() == andre.hashCode());

        /**
         * Usando Iterator
         */
        System.out.println("Usando iterador para percorrer a coleção");

        Set<Aluno> alunos = javaCollections.getAlunos();
        Iterator<Aluno> iterator = alunos.iterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
