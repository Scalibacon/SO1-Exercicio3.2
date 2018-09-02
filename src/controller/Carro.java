package controller;

import java.awt.Rectangle;
import java.util.concurrent.Semaphore;

import javax.swing.JLabel;

public class Carro extends Thread{

	public JLabel lblCarro;
	public String sentido;
	public Semaphore semaforo;
	public Rectangle shape;
	
	public Carro(JLabel lblCarro, String sentido, Semaphore semaforo) {
		this.lblCarro = lblCarro;
		this.sentido = sentido;
		this.semaforo = semaforo;
		shape = lblCarro.getBounds();
	}
	
	public void run() {
		try {
			sleep(1000);
			semaforo.acquire();
			horaDeCruzar();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaforo.release();
		}
	}
	
	public void horaDeCruzar() {		
		switch(sentido) {
			case "baixo":
				cruzando(false, 1);
				break;
			case "cima":
				cruzando(false, -1);
				break;
			case "esquerda":
				cruzando(true, -1);
				break;
			case "direita":
				cruzando(true, 1);
				break;
		}
	}
	
	public void cruzando(boolean isX, int posOuNeg) {
		int percorrido;
		
		if(isX)		
			percorrido = shape.x;
		else
			percorrido = shape.y;
		
		for(int i = 0; i < 7; i++) {
			percorrido += 20 * posOuNeg;
			if(isX)
				shape.x = percorrido;
			else
				shape.y = percorrido;
			lblCarro.setBounds(shape);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
