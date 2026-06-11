package Calculatrice;

public class Log extends OperationUnaire {
	public Log(double val) {
		super(val);
	}

	public double Calculer() {
		  if (val <= 0) {
	            throw new ArithmeticException("Logarithm is only defined for positive values !");
	        }
		
	            return Math.log(val);
	}
	}
