import java.util.Arrays;

public class questao2 {
	public static void main(String[] args) {
		int[] numeros = {25, 48, 71, 20, 5, 36, 22, 98, 3};
		Arrays.sort(numeros);
		
		int menor = numeros[0];
		int maior = numeros[numeros.length - 1];
		
		int contmenor = 0;
		int contmaior = 0;
		
		for (int num:numeros) {
			if (num == menor) {
				contmenor++;
			}
			if (num == maior) {
				contmaior++;
			}
		}
		System.out.println("O menor número é: " + menor +" e aparece: "+contmenor + " vez(es).");
		System.out.println("O maior número é: " + maior +" e aparece: "+contmaior + " vez(es).");
	}

}
