package controller;
import model.Bulbasaur;
import model.Charizard;
import model.Dragonite;
import model.Mew;
import model.Pikachu;
import model.Pokemon;
import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Bulbasaur;

@WebServlet(urlPatterns = { "/pokemon" })
public class PokemonController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PokemonController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String value1 = request.getParameter("card1"); 
		String value2 = request.getParameter("card2"); 
		String value3 = request.getParameter("card3"); 
		String value4 = request.getParameter("card4"); 
		String value5 = request.getParameter("card5"); 

		String msg = "";

		if (value1 != null) {
			
				
		Bulbasaur b = new Bulbasaur("Bulbasaur",001,"Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.","POISON","IVYSAUR","64");	  
			msg = "<center>";// + //getter + "  #" + //getter;
			//request.setAttribute("message1",b.getClass());
			request.setAttribute("character1",b.getCharacteristics("Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region."));
			request.setAttribute("type1", b.getType("POISON"));
			request.setAttribute("evolution1", b.getEvolution("IVYSAUR"));
			request.setAttribute("baseExp1", b.getBaseExp("64"));
		}

		if (value2 != null) {
			// Create the object for Charizard class and use getters to retrieve the values	
			
			Charizard c = new Charizard("Charizard",006,"Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.","FIRE","CHARMELEON","240");
				  
			msg = "<center>" ;//+ //getter + "  #" + //getter;
			//request.setAttribute("message2",//getter);
			request.setAttribute("character2",c.getCharacteristics("Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.")); //getter);
			request.setAttribute("type2", c.getType("FIRE"));//getter;
			request.setAttribute("evolution2",c.getEvolution("CHARMELEON")); //getter);
			request.setAttribute("baseExp2", c.getBaseExp("240"));//getter);*/
		}

		if (value3 != null) {

			// Create the object for Dragonite class and use getters to retrieve the values	
			
			Dragonite d = new Dragonite("Dragonite",149,"Dragonite is capable of flying faster than the speed of sound. It is a kindhearted Pokémon with human-like intelligence. It shows signs of altruism.","DRAGON","DRATINI","270");
			
			msg = "<center>"; //+ //getter + "  #" + //getter;
			//request.setAttribute("message3",//getter);
			request.setAttribute("character3", d.getCharacteristics("Dragonite is capable of flying faster than the speed of sound. It is a kindhearted Pokémon with human-like intelligence. It shows signs of altruism."));//getter);
			request.setAttribute("type3",d.getType("DRAGON"));//getter;
			request.setAttribute("evolution3",d.getEvolution("DRATINI"));//getter);
			request.setAttribute("baseExp3",d.getBaseExp("270")); //getter);*/
		}
		if (value4 != null) {

			// Create the object for Mew class and use getters to retrieve the values	
			
			Mew m = new Mew("Mew",151,"Mew is a Psychic-type Mythical Pokémon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.","PSYCHIC","NONE","64");
			msg = "<center>"; //+ //getter + "  #" + //getter;
			//request.setAttribute("message3",//getter);
			request.setAttribute("character4", m.getCharacteristics("Mew is a Psychic-type Mythical Pokémon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine."));
			request.setAttribute("type4",m.getType("MEW")); //getter;
			request.setAttribute("evolution4",m.getEvolution("NONE")); //getter);
			request.setAttribute("baseExp4",m.getBaseExp("64")); //getter);*/
		}

		if (value5 != null) {

			// Create the object for Pikachu class and use getters to retrieve the values	

			Pikachu pik = new Pikachu("Pikachu",25,"Pikachu is an Electric-type Pokémon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pokémon franchise mascot.","ELECTRIC","RAICHU","112");
			msg = "<center>"; //+ //getter + "  #" + //getter;
			//request.setAttribute("message5",//getter);
			request.setAttribute("character5", pik.getCharacteristics("Pikachu is an Electric-type Pokémon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pokémon franchise mascot."));//getter);
			request.setAttribute("type5", pik.getType("ELECTRIC"));//getter;
			request.setAttribute("evolution5", pik.getEvolution("RAICHU"));//getter);
			request.setAttribute("baseExp5", pik.getBaseExp("112")); //getter);*/

		}

		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);

	}

}
