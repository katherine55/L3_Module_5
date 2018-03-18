import java.util.Random;

public class Randomness {

	Randomness(){}
	
	static boolean randBool() {
		Random rand = new Random();
		Boolean answer = rand.nextBoolean();
		return answer;
	}

	static int randInt() {
		Random rand = new Random();
		int answer = rand.nextInt(10) + 1;
		return answer;
	}

}
