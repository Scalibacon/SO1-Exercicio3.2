package controller;

import java.util.concurrent.Semaphore;

import javax.swing.JLabel;

public class Transito {
	JLabel car1;
	JLabel car2;
	JLabel car3;
	JLabel car4;
	int permissao = 1;
	Semaphore semaforo = new Semaphore(permissao);
	
	public Transito(JLabel car1, JLabel car2, JLabel car3, JLabel car4) {
		this.car1 = car1;
		this.car2 = car2;
		this.car3 = car3;
		this.car4 = car4;
	}
	
	public void invocaCarros() {
		Carro carro1 = new Carro(car1, "baixo", semaforo);
		Carro carro2 = new Carro(car2, "cima", semaforo);
		Carro carro3 = new Carro(car3, "direita", semaforo);
		Carro carro4 = new Carro(car4, "esquerda", semaforo);
		
		carro1.start();
		carro2.start();
		carro3.start();
		carro4.start();
		
	}
}
