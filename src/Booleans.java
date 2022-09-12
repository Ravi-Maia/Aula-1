
public class Booleans {

	public static void main(String[] args) {
		int number = 10;
		
		boolean test1 = number > 5;
		boolean test2 = number < 5;
		boolean test3 = number >= 5;
		boolean test4 = number <= 5;
		boolean test5 = number == 5;
		boolean test6 = number != 10;
		
		boolean test7 = number > 1 || 11 < number;
		
		boolean test8 = number > 1 || 11 < number; // Se a primeira verificacao é verdadeiro, o programa nao vai checar a segunda
		
		boolean test9 = number > 11 || 9 > number || number > 122 || number > 7; // true, because of last verification. Best to place the one its believed to be true first so as to save processing
		
		System.out.println("Teste 1: " + test1);
		System.out.println("Teste 2: " + test2);
		System.out.println("Teste 3: " + test3);
		System.out.println("Teste 4: " + test4);
		System.out.println("Teste 5: " + test5);
		System.out.println("Teste 6: " + test6);
		System.out.println("Teste 7: " + test7);
		System.out.println("Teste 8: " + test8);
		System.out.println("Teste 8: " + test9);
	}

}
