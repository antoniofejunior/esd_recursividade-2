public class Fibonacci{
	public static int fibo(int a){
		return (a < 2) ? a : fibo( a - 1 ) + fibo( a - 2 );
	}
	
	public static void main(String[] args){		
		System.out.println(fibo(Integer.parseInt(args[0])));
	}
	
	// Antônio Ferreira Junior
	
}