package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logic {

	 PApplet app1;
	 ArrayList<Figura> figus;
	 String [] info;
	
	public Logic(PApplet app1) {
		this.app1=app1;
		cargarArchivo();
		crearObj();
	}
	
	public void cargarArchivo() {
		info = app1.loadStrings("infoFigu.txt");
		
		 figus = new ArrayList<Figura>();
		
		for(int i=0; i<info.length;i++) {
			String[] infFig = info[i].split(" ");
			
			int tama = Integer.parseInt(infFig[1]);
			int py = Integer.parseInt(infFig[2]);
			int px = Integer.parseInt(infFig[3]);
			int direc = Integer.parseInt(infFig[4]);
			
			if(infFig[i].equals("Circulo")) {
				figus[i] = new Cuadrado(tama,py,px,direc,app1);
			}
			
			
		}
		//System.out.println(info.length);
	}
	
	public void crearObj() {
		figus = new ArrayList<Figura>();
	}
	
	public void crearFiguras() {
		for(int i = 0; i < info.length; i++) {
			//figus.add(new Figura (info[i],app1));
			//System.out.println(figus.get(i).getPalabrita());
	}
	}
}
