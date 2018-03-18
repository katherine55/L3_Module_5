import java.util.ArrayList;

public class Plane {
	public static void main(String[] args) {
		double chanceofdeath;
		double totalViciousness = 0;
		double numberOfPassengers = 400;
		Randomness randy = new Randomness();
		ArrayList<Snake> snacksonaplane = new ArrayList<Snake>();
		for (int i = 0; i < 100; i++) {
			snacksonaplane.add(new Snake(randy.randInt(), randy.randBool()));
		}
		for (int i = 0; i < snacksonaplane.size(); i++) {
			totalViciousness += snacksonaplane.get(i).getViciousness();
		}
		chanceofdeath = (totalViciousness * 10) / numberOfPassengers;
		System.out.println(chanceofdeath);
	}
}
