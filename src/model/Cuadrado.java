package model;

import processing.core.PApplet;

public class Cuadrado extends Figura {

	PApplet appCua;
	
	public Cuadrado(int tamannno,int posx,int posy, int dir, PApplet appCua) {
		super(tamannno,posx,posy,dir);
		
		this.appCua=appCua;
	}
	
	public void dibujar() {
		appCua.fill(getColor());		
		appCua.rect(getPosX(),getPosY(),getTamanoo(),getTamanoo());
	}

}
