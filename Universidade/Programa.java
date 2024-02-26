public class Programa {
    public static void main(String[] args) {
        Professor prof = new Professor();
        Universidade facul = new Universidade();
        Disciplina materia = new Disciplina();
        Aluno aluno = new Aluno();

        aluno.setNome("Weslley");
        aluno.setId(4238);
        aluno.setNotaAtual(30.00);
        
        prof.setNome("Daniel");
        prof.setTurno("Noite");
        prof.setNota(29);
    

        materia.setNome("Ciências da computação");
        materia.setPeriodo(3);

        facul.setNome("UNA de CONTAGEM");
        facul.setEndereco("Avenida João Cesár de Oliveira");

        

        double notaFinal = prof.lancarNota(45);

        System.out.println("DADOS DO ALUNO:");
        System.out.println(aluno.getNome());
        System.out.println("ID do aluno: " + aluno.getId());
        System.out.println(facul.getNome());
        System.out.println(materia.getNome());
        System.out.println("Periodo: " + materia.getPeriodo());
        

        System.out.println("\n INFORMAÇÃO DO PROFESSOR:");
        System.out.println(prof.getNome());
        System.out.println("Turno: " + prof.getTurno());
        System.out.println("Nota a ser lançada para o aluno "+ aluno.getNome() +": "+ prof.getNota()+ " pontos.");
        System.out.println("Nota atual do aluno: " + aluno.getNotaAtual());
        System.out.println("Nota final do aluno: " + notaFinal);
    }
}

