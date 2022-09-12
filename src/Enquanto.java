
public class Enquanto {
	public static void main(String[] args) {
		
		int idade = 15;
		
		while(idade <= 18) {
			System.out.println("Idade" + idade);
			idade++;
		}
		
		byte i = 0;
		
		while(i <= idade) {
			System.out.println("I" + i);
			i = (byte) (i + 1);
			// why casting here? Because i (in i + 1) is promoted to int and would not be able to be assigned to byte (as in byte i = 0;) 
			
		}
		
		
	}
}
