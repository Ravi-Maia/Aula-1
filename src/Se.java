import java.util.Scanner;


public class Se {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		String nome = scanner.nextLine();
		
		//System.out.println(nome);
		
		System.out.println("Informe a data que você nasceu");
		int dataNascimento = scanner.nextInt();
		
		System.out.println("Seu nome é " + nome + " e sua data de nascimento é " + dataNascimento);
		
		int resultado = 2022 - dataNascimento;
		
		
		//resultado > 18 ? System.out.println("Pode dirigir") : 
		
		if(resultado > 18) {
			System.out.println("Pode dirigir");
		} else {
			System.out.println("Não pode dirigir");
		}
		
		/*
		if(something) {
			do x
		} else {
			do y
		}
		*/
		scanner.close();
	}

}
