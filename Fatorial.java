public class Fatorial{
	
	public static int fator(int a){
		return (a == 0) ? 1: a * fator( a - 1);
	}
	
	public static void main(String[] args){	
		System.out.println(fator(Integer.parseInt(args[0])));
	}
	
	// Antônio Ferreira Junior
	
}