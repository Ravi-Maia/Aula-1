import java.util.Scanner;
//import java.util.Random;

/**
 * 
 * Nesse código, estou praticando o que foi ensiando e o que praticamos na tercaira aula do Java Xpert 9/9/2022
 * @author Ravi
 *
 */


public class PraticarAula3 {
	public static void main(String[] args) {
		/*
		for(int cont = 0; cont < 100; cont++) {
			if(cont >= 10 && cont < 25)
				continue;
			System.out.println(cont);
		}*/
		/*
		int value = 1;		
		int valueCond = 100;
		
		for(int brk = value; brk < valueCond; ++brk) { //Se começar no zero, ele fica no zero
			if(brk % 17 == 0) {
				System.out.println("Break " + brk);
				break;
				
			}
		}*/
		/*
		Random rand = new Random();		
		int numeroSorteado = rand.nextInt(11);
		
		Scanner scan = new Scanner(System.in);
		int numeroEscolhido = scan.nextInt();
		
		System.out.println("Insira um número");
				
		if(numeroSorteado == numeroEscolhido) {   
			System.out.println("Igual");
		}
		while(numeroSorteado != numeroEscolhido) {
			if(numeroSorteado > numeroEscolhido) {
				System.out.println("Menor");
			} else if (numeroSorteado < numeroEscolhido){
				System.out.println("Maior");
			} 
			System.out.println("Insira um número");
			numeroEscolhido = scan.nextInt();
			if(numeroSorteado == numeroEscolhido) {   
				System.out.println("Igual");
			}
		}
		scan.close(); */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual foi sua velociade?");
		int suaVelociade = scan.nextInt();
		System.out.println("Qual é o limite da via?");
		int velociadeDaVia = scan.nextInt();
		
		int diferencaVelocidade = suaVelociade - velociadeDaVia;
		
		double multa = 0;
		
		int acimaVelocidadeAlta = 50;
		int acimaVelocidademedia = 11;
		
		if(diferencaVelocidade > acimaVelocidadeAlta) {
			multa = 200;
		} else if (diferencaVelocidade >= acimaVelocidademedia) {
			multa = 100;
		} else {
			multa = 50;
		}
		if(diferencaVelocidade < 8) {
			System.out.println("Sem multa");
		} else if(diferencaVelocidade > acimaVelocidadeAlta) {
			System.out.println("Sua velocidade: " + suaVelociade + ". Velocidade da via: " + velociadeDaVia + ". Você estava " + diferencaVelocidade + " acima do limite. A multa é de: " + multa);
		} else if (diferencaVelocidade >= acimaVelocidademedia) {
			System.out.println("Sua velocidade: " + suaVelociade + ". Velocidade da via: " + velociadeDaVia + ". Você estava " + diferencaVelocidade + " acima do limite. A multa é de: " + multa);
		} else {
			System.out.println("Sua velocidade: " + suaVelociade + ". Velocidade da via: " + velociadeDaVia + ". Você estava " + diferencaVelocidade + " acima do limite. A multa é de: " + multa);
		}
		
		
	}//main




}//class
