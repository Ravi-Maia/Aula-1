import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira o ano desejado");
		int anoUsuario = scanner.nextInt();
		
		//A boa do professor para ser didatico e debugar
		boolean logica = anoUsuario % 400 == 0 || anoUsuario % 4 == 0 && anoUsuario % 100 != 0;
		
		if(logica) {
			System.out.println(anoUsuario + " é bissexto");
		} else {
			System.out.println(anoUsuario + " não é bissexto");
		}
		
		/*
		if(anoUsuario % 400 == 0 || anoUsuario % 4 == 0 && anoUsuario % 100 != 0) {
			System.out.println("Ano bissexto");
		} else {
			System.out.println("Ano não é bissexto");
		} */
		scanner.close();
	}

}
