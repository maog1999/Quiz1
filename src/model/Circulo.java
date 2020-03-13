package model;

import processing.core.PApplet;

public class Circulo extends Figura{

	PApplet appCircu;
	
	public Circulo(int tamannno,int posx,int posy, int dir,PApplet appCircu) {
		super(tamannno,posx,posy,dir);
		
		this.appCircu=appCircu;
	}
	public void dibujar() {
		appCircu.fill(getColor());		
		appCircu.ellipse(getPosX(),getPosY(),getTamanoo(),getTamanoo());
	}

}
