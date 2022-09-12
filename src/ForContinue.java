
public class ForContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 100; i++) {
			if(i > 50 && i < 60) { // numbers between 50 and 60 not printed. Criterio que agente exclui na logica de programacao
				continue;
			}
			//syso control + space bar
			System.out.println(i);
		}
		
	}

}
