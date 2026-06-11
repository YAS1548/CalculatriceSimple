package Calculatrice;

public class Division extends OperationBinaire {

	public Division(double val1, double val2) {
		super(val1, val2);
	}

	@Override
	public double Calculer() {
		 if (val2 == 0) {
	            throw new ArithmeticException("THE NUMBER IS ZERO!");
	        }
		return val1/val2;
	}

}
