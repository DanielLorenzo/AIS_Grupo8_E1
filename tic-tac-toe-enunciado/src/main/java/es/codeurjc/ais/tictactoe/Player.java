package es.codeurjc.ais.tictactoe;

import org.springframework.stereotype.Component;


public class Player {
	
	//Atributos
	private int id;
	private String name;
	private String label;
	//agregamos estos atributos para guardar las estadisticas
	private int partidasGanadas;
	private int partidasPerdidas;
	private int partidasEmpatadas;
	

	//Constructor
	public Player(int id, String label, String name) {
		this.id = id;
		this.label = label;
		this.name = name;
		//Los inicializamos a 0 al crear el objeto
		this.partidasGanadas = 0;
		this.partidasPerdidas = 0;
		this.partidasEmpatadas = 0;
		System.out.println("He creado un jugador" + this.name);
	}
	
	
	//Métodos
	
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", partidasGanadas=" + partidasGanadas + ", partidasPerdidas="
				+ partidasPerdidas + ", partidasEmpatadas=" + partidasEmpatadas + "]";
	}
	
	//Dos jugadores son iguales cuando tiene el mismo nombre
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(this == null) {
			return false;
		}
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		
		Player player  = (Player) obj;
		return this.getName().equalsIgnoreCase(player.getName());		
	}	
	
	
	//getters
	public int getId() {return id;}
	public String getLabel() {return label;}	
	public String getName() {return name;}
	
	public int getPartidasGanadas() {return partidasGanadas;}
	public int getPartidasPerdidas() {return partidasPerdidas;}
	public int getPartidasEmpatadas() {return partidasEmpatadas;}	
	
	//Setters
	public void setPartidasGanadas(int partidasGanadas) {this.partidasGanadas = partidasGanadas;}
	public void setPartidasPerdidas(int partidasPerdidas) {this.partidasPerdidas = partidasPerdidas;}
	public void setPartidasEmpatadas(int partidasEmpatadas) {this.partidasEmpatadas = partidasEmpatadas;}	
}