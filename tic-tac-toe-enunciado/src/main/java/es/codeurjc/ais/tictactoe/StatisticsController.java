package es.codeurjc.ais.tictactoe;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StatisticsController {
	
	@Autowired
	StatisticsService statisticsService;
	
	@RequestMapping(value= "/stats")
	public String estadisticas(Model model) {
		
		ArrayList<Player> listaJugadores = new ArrayList<>(statisticsService.getListaJugadores());
		model.addAttribute("stats",jugadores);
		return "stadisticas";
	}
}