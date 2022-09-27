package fr.dauphine.javaavance.td2;

public class Add implements Expr {
	private Expr expr1;
	private Expr expr2;

	public Add(Expr expr1, Expr expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	@Override
	public double eval() {
		return (expr1.eval() + expr2.eval());
	}

	@Override
	public String toString() {
		return "La valeur additionnée : " + this.eval();
	}
}