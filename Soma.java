public class Soma{
	public static void main(String[] args){
		double soma = 0;
		for (String aux: args){
			soma += Integer.parseInt(aux); 
		}
		System.out.println(soma);
	}
	
	// Antônio Ferreira Junior
	
}