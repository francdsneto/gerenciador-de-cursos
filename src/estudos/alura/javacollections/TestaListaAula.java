package estudos.alura.javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaListaAula {

    public static void main(String[] args) {
        Aula a1 = new Aula("Revisitando as ArrayList", 21);
        Aula a2 = new Aula("Lista de objetos", 20);
        Aula a3 = new Aula("Relacionamento de lista e objetos", 15);

        List<Aula> aulas = new ArrayList<>();

        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);

        Collections.sort(aulas);

        System.out.println(aulas);

        //Collections.sort(aulas, Comparator.comparing(Aula::getTempo));

        aulas.sort(Comparator.comparing(Aula::getTempo));

        System.out.println(aulas);



    }

}
