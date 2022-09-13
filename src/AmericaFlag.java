
public class AmericaFlag {
	public static void main(String[] args) {
		String estrela6 = "* "; //length 12 because of spaces
		String catchEstrela6 = "";
		String estrela5 = " *"; 
		String catchEstrela5 = "";
		String stripes = "=";
		String catchStripes = "";
		String catchStripesBottom = "";
		
		for(int i = 0; i < 31; i++) {
			catchStripes += stripes;			
		}
		for(int x = 0; x < 5; x++) {
			catchEstrela5 += estrela5;	
		}
		for(int i = 0; i < 6; i++) {
			catchEstrela6 += estrela6; //How do I print 6 stars in a row 5 times? 
			if(catchEstrela6.length() == 12) {
				for(int j = 0; j < 5; j++) {
					System.out.println(catchEstrela6 + "" + catchStripes);
					System.out.println(catchEstrela5 + "  " + catchStripes);
				}
				for(int o = 0; o < 43; o++) {
					catchStripesBottom += stripes;
					if(catchStripesBottom.length() == 43) {
						for(int j = 0; j < 5; j++) {
							System.out.println(catchStripesBottom);
						}// j 5			
					}//length == 43
				}//o 43 				
			}//length == 12			
		}//i 6 */
	}
}
