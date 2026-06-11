package Calculatrice;

public class Sqrt extends OperationUnaire {

	public Sqrt(double val) {
		super(val);
	}

	public double Calculer() {
		   if (val < 0) {
	            throw new ArithmeticException("Sqrt is only defined for positive numbers!");
	        }

		return Math.sqrt(val);
	}

}
