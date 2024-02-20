import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Numeros {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
        
		int[] numerosadicionados = {25,14,12,74,53,69,85,24,47,13,10,41,50,87,15};
		
		for (int num : numerosadicionados) {
            set.add(num);
        }

        List<Integer> numeros = new ArrayList<>(set);
        Collections.sort(numeros);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número que deseja buscar: ");
        int numeroBusca = scanner.nextInt(); 
        
        int posicaoSequencial = -1;
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == numeroBusca) {
                posicaoSequencial = i;
                break;
            }
        }

        int posicaoBinaria = Collections.binarySearch(numeros, numeroBusca);

        System.out.println("Número de busca: " + numeroBusca);
        if (posicaoSequencial != -1) {
            System.out.println("Busca sequencial: Encontrado na posição " + posicaoSequencial + " (" + (posicaoSequencial % 2 == 0 ? "par" : "ímpar") + ")");
        } else {
            System.out.println("Busca sequencial: Não encontrado");
        }
        if (posicaoBinaria >= 0) {
            System.out.println("Busca binária: Encontrado na posição " + posicaoBinaria + " (" + (posicaoBinaria % 2 == 0 ? "par" : "ímpar") + ")");
        } else {
            System.out.println("Busca binária: Não encontrado");
        }
	}

}
