package fr.dauphine.javaavance.td2;
public class Main {
	public static void main(String[] args) {
		Expr val = new Value(1337.0);
		System.out.println(val.eval()); // affiche 1337.0
		Expr add = new Add(new Value(327.0), val);
		System.out.println(add.eval()); // affiche 1664.0
		Expr e = new Add(new Value(350.0), add);
		System.out.println(e.eval()); // affiche 2014.0

		// 2)
		System.out.println(val); // affiche : "la valeur est 1337.0"
		System.out.println(e); // affiche :"La valeur additionnée : 2014.0"

		// 3)
		System.out.println(new Multiplication(new Value(2.0), val)); // affiche le résulat de la multiplication est :
																		// 2674.0

		// 4)
		Expr racine = new Racine(val);
		System.out.println(racine); // affiche : "le résultat de le racine carrée est : 36.565010597564445"

	}
}

