/**
 * 
 * 
 * @see System#out
 * @author Ravi
 * @version 1.1
 */


public class ParOuImpar {
	
	static final int NUM_P_TESTE = 1400;
	
	/**
	 * Este mmedoto é o metodo inicial do programmar par ou impar. Tambem estamos verificando a
	 * divisibilidade de outros numeros.
	 * Foi-se aprensendato o MOD
	 * 
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		
		if(NUM_P_TESTE % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
		
		
		if(NUM_P_TESTE % 3 == 0) {
			System.out.println("Divisivel por 3");
		} else {
			System.out.println("Não divisivel por 3");
		}
	}
}
