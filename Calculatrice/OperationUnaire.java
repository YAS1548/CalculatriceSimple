package Calculatrice;

public abstract class OperationUnaire implements CalculMath {
	protected double val;

	public OperationUnaire(double val) {
		this.val = val;
	}

}
