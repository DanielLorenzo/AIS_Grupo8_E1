package es.codeurjc.ais.tictactoe;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class StatisticsService {
	
	//Atributos
	private ArrayList<Player> listaJugadores;
	
	//Constructores
	public StatisticsService() {
		
		this.listaJugadores = new ArrayList<Player>();		
	}
	
	//Métodos
	public boolean anadirJugador(Player jugador) {
		if(!this.listaJugadores.contains(jugador)) {
			return this.listaJugadores.add(jugador);
		}
		return false;
	}
	public void actualizarEmpatesJugador(Player jugador) {
		
		for(Player j: listaJugadores) {
			if(j.equals(jugador)) {
				j.setPartidasEmpatadas(j.getPartidasEmpatadas()+1);
			}			
		}		
	}
	
	public void actualizarGanadasJugador(Player jugador) {
		for(Player j: listaJugadores) {
			if(j.equals(jugador)) {
				j.setPartidasGanadas(j.getPartidasGanadas()+1);
			}
		}
	}
	public void actualizarPerdidasJugador(Player jugador) {
		for(Player j: listaJugadores) {
			if(j.equals(jugador)) {
				j.setPartidasPerdidas(j.getPartidasPerdidas()+1);
			}
		}
	}
	@Override
	public String toString() {
		return "StatisticsService [ListaJugadores=" + listaJugadores + "]";
	}	
	
	//Getters y Setters
	public ArrayList<Player> getListaJugadores() {return listaJugadores;}
	public void setListaJugadores(ArrayList<Player> listaJugadores) {this.listaJugadores = listaJugadores;}
}