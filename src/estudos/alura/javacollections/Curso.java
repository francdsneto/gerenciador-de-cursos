package estudos.alura.javacollections;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(),aluno);
    }

    public int getTempoTotal() {
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", instrutor='" + instrutor + '\'' +
                ", tempo total='" + this.getTempoTotal() + '\'' +
                '}';
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public Aluno buscaMatriculado(int matricula) {
        /**
         * Torna-se muito mais fácil trabalhar em busca utilizando o map
         */
//        for (Aluno aluno : alunos) {
//            if (aluno.getNumeroMatricula() == matricula)
//                return aluno;
//        }
//        throw new NoSuchElementException("Matrícula não encontrada" + matricula);
        if(!matriculaParaAluno.containsKey(matricula))
            throw new NoSuchElementException("Matrícula não encontrada " + matricula);
        return this.matriculaParaAluno.get(matricula);
    }
}
