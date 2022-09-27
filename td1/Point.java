package fr.dauphine.javaavance.td1.Exercice_2;

public class Point {

	//Attributs
private int x;
private int y;
private static int cpt;

	/*
	 * Constructor
	 * prends en entrée x et y des entiers
	 */
public Point(int x, int y) {
	this.x = x;
	this.y = y;
	this.cpt = 0;
}

/*
 * Constructor
 * prends en entrée un point p2
 */
public Point (Point p2 ) {
	this.x= p2.getX();
	this.y=p2.getY();
	this.cpt=0;
}
/*
 * renvoie la valeur de x
 */
public int getX() {
	return this.x;
}
/*
 * renvoie la valeur de y
 */
public int getY() {
	return this.y;
}
/*
 * permet d afficher les coordonnées d'un point (x,y)
 */
public String toString() {
	return "("+this.x+","+this.y+")";
}
/*
 * compare les coordonnées de deux points 
 */
public boolean isSameAs(Point p1) {
	if(this.x== p1.getX() && this.y==p1.getY())return true;
	else return false;
}

public void affichage () {
	Point p = new Point(1,2);
	cpt++;
	System.out.println(p);
}

public boolean equals(Object obj) {
	  if (obj instanceof Point)
		  return this.isSameAs((Point)obj);
	  else return false;
	}

public void translate(int dx,int dy) {
	this.x+=dx;
	this.y+=dy;
}

public Point translate1 (int dx,int dy) {
	return new Point(this.x+dx,this.y+dy);
}
}
