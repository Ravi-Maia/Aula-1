
import java.util.Scanner;

/**
 * calcular a multa da velociade do usuario em vias com velocidades maximas distintas
 * 
 * Acima 10km: multa: 50 reais
 * Entre 11 e 30km: multa: 100 reais
 * Acima de 30km: 300 reais
 * @author Ravi
 *
 */
public class VelocidadeMaxima {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual foi sua velociade");
		int suaVelociade = scanner.nextInt();
		
		System.out.println("Qual foi sua velociade maxima da via?");
		int velociadeVia = scanner.nextInt();
		
		int resultado =  suaVelociade - velociadeVia;
		
		double multa = 0;
		
		if(resultado <= 10) {
			multa = 50;
			System.out.println("Você estava a " + "" + resultado + "km" + " acima do limite. Multa de " + multa + " reais ");
		} else if(resultado >= 11 && resultado <=30) {
			multa = 100;
			System.out.println("Você estava a " + "" + resultado + "km" + " acima do limite. Multa de " + multa + " reais ");
		} else {
			multa = 300;
			System.out.println("Você estava a " + "" + resultado + "km" + " acima do limite. Multa de " + multa + " reais ");
		}
	
		scanner.close();
	} //O cliente nao fala a regra explicitamente para voce entao tem que ter o feeling
}
