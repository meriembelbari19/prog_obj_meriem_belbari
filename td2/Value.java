package fr.dauphine.javaavance.td2;


public class Value implements Expr {
	private double val;

	public Value(double nb) {
		this.val = nb;
	}

	public Value(Expr expr) {
		this.val = expr.eval();
	}

	@Override
	public double eval() {
		return val;
	}

	@Override
	public String toString() {
		return "La valeur est : " + this.val;
	}
}