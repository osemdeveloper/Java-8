package functionalInterface;

@FunctionalInterface
interface ForceCalculator {
	double calculateForce(double mass, double acceleration);
}

public class AppliedForce {
	public static void main(String[] args) {
		double mass = 5.0;
		double acceleration = 10.0;

		// Using lambda expression to calculate the force
		ForceCalculator forceCalculator = (m, a) -> m * a;

		double force = calculateForce(mass, acceleration, forceCalculator);
		System.out.println("Applied Force is " + force + " Newotns.");
	}

	private static double calculateForce(double mass, double acceleration, ForceCalculator calculator) {
		return calculator.calculateForce(mass, acceleration);
	}

}
