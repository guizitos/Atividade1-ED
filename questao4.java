public class Aluno {
	String nome;
	double nota1;
	double nota2;
	
	Aluno(String nome, double nota1, double nota2){
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	double mediaponderada() {
		return (nota1 * 2 + nota2 * 3)/5;
	}
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Diario {
	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<>();
		
		alunos.add(new Aluno("Guilherme", 8.0, 8.5));
		alunos.add(new Aluno("Pedro", 7.0, 8.5));
		alunos.add(new Aluno("Luana", 8.0, 7.5));
		alunos.add(new Aluno("Luiara", 6.0, 8.5));
		alunos.add(new Aluno("Maria Eduarda", 5.0, 3.5));
		alunos.add(new Aluno("Kenyton", 6.0, 4.5));
		alunos.add(new Aluno("Marielle", 7.0, 7.5));
		alunos.add(new Aluno("Lana", 9.0, 8.5));
		
		Collections.sort(alunos, Comparator.comparingDouble(Aluno::mediaponderada).reversed());
		System.out.println("Alunos ordenados pela média ponderada das notas: ");
		for (Aluno a : alunos) {
			System.out.println(a.nome + " - Média: " + a.mediaponderada());
		}
		Collections.sort(alunos, Comparator.comparingDouble(a -> a.nota1));
        System.out.println("\nAlunos ordenados pela nota 1:");
        for (Aluno a : alunos) {
            System.out.println(a.nome + " - Nota 1: " + a.nota1);
        }
        List<Aluno> reprovados = new ArrayList<>();
        for (Aluno a : alunos) {
            if (a.mediaponderada() < 7) {
                reprovados.add(a);
            }
        }
        Collections.sort(reprovados, Comparator.comparing(a -> a.nome));
        System.out.println("\nAlunos reprovados em ordem alfabética:");
        for (Aluno a : reprovados) {
            System.out.println(a.nome + " - Média: " + a.mediaponderada());
        }
	}
}
