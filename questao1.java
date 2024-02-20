import java.util.*;
public class Funcionario {
	String nome;
    double salario;

    Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String toString() {
        return "Nome: " + this.nome + ", Salário: " + this.salario;
    }
}


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Funcionario> funcionarios = new ArrayList<>();
       
		funcionarios.add(new Funcionario("Guilherme", 5500));
		funcionarios.add(new Funcionario("Pedro", 3000));
		funcionarios.add(new Funcionario("Luiara", 2500));
		funcionarios.add(new Funcionario("Luana", 3500));
		funcionarios.add(new Funcionario("Maria Eduarda", 4000));

		Collections.sort(funcionarios, Comparator.comparingDouble(f -> f.salario));
        System.out.println("Em ordem crescente de salário:");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
        /*
        Collections.sort(funcionarios, Comparator.comparingDouble(f -> f.salario).reversed());
        System.out.println("\nEm ordem decrescente de salário:");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }*/

        Collections.sort(funcionarios, Comparator.comparing(f -> f.nome));
        System.out.println("\nEm ordem alfabética:");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }

	}

}

