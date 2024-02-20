public class Produto {
	int codigo;
    String descricao;
    double preco;

    Produto(int codigo, String descricao, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparacoes {
	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            produtos.add(new Produto(i, "Produto " + i, i * 10.0));
        }

        Collections.sort(produtos, Comparator.comparingInt(p -> p.codigo));

        int codigoBusca = 5; 
        int comparacoesSequencial = 0;
        for (Produto p : produtos) {
            comparacoesSequencial++;
            if (p.codigo == codigoBusca) {
                break;
            }
        }

        int inicio = 0;
        int fim = produtos.size() - 1;
        int comparacoesBinaria = 0;
        while (inicio <= fim) {
            comparacoesBinaria++;
            int meio = (inicio + fim) / 2;
            if (produtos.get(meio).codigo == codigoBusca) {
                break;
            } else if (produtos.get(meio).codigo < codigoBusca) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        System.out.println("Número de comparações na busca sequencial: " + comparacoesSequencial);
        System.out.println("Número de comparações na busca binária: " + comparacoesBinaria);
	}

}
