package fr.dauphine.javaavance.td1.Exercice_2;

import java.util.ArrayList;
import java.util.LinkedList;

public class PolyLine_LinkedList {
	
private int maxPoints;
private LinkedList<Point> points ;

public PolyLine_LinkedList(int maxPoints) {
	this.points =  new LinkedList<Point>();
	this.maxPoints=maxPoints;
}

/*
 * ajoute un point au tableau points s'il a pas atteint sa limite maxPoints
 */
public boolean add(Point p) {
	if(this.points.size()<this.maxPoints) {
		this.points.add(p);
		return true;
	}
	else {
		return false;
	}
}

/*
 * retourne la capacité maximale du tableau 
 */
public int pointCapacity() {
	return this.maxPoints;
}

/*
 * retourne le nombre de points figurant dans le tableau
 */
public int nbPoints() {
	return this.points.size();
}

/*
 * retourne vrai si le point figure dans le polyline
 */
public boolean contains(Point p) {
for(Point p1 :this.points) {
	if (p1.isSameAs(p))return true;
}
	return false;
}
}
