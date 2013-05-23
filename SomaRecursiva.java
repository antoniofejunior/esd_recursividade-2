public class SomaRecursiva{
	
	private static int soma(int vetor[] , int tamanho){
		return (tamanho > 0) ? vetor[tamanho - 1] + soma(vetor, tamanho - 1): 0;
	}

	private static int somaVetor(String v[]){
		int aux[] = new int[v.length];
		for (int i = 0; i < v.length; i++){
			aux[i] = Integer.parseInt(v[i]);
			}
		return (soma(aux , aux.length));
	}
	
	public static void main(String[] args){
		System.out.println(somaVetor(args));
	}

	// Antônio Ferreira Junior
}