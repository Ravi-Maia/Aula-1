
public class TypePromotionRules {
	public static void main(String[] args) {
		byte b = 4;
		char c = 'a';
		short s = 1024;
		int i = 214483647;
		float f = 5.72f;
		//double d = .19231;
		float f1 = (b * c) + (s / i) + f;
		System.out.println(f1); //Because of the type promotion rules, the expression ends up being a float. Of course the type has to be float
		int i1 = (b + c) - (s + i);  
		System.out.println(i1); //Expression's int
	}
}
