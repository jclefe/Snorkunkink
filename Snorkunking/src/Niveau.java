import java.util.Random;

public class Niveau {

	public static int niveau (int cave) {
		
		int b = 0;
		
		if (cave == 1) {
			 b = 9;
		}
		
		if (cave == 2) {
			 b = 6;
		}
		
		if (cave == 3) {
			 b = 3;
		}
		
		Random rand = new Random();
		int niveau = rand.nextInt(4) + b;
		return niveau;
	}
}
