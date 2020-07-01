package model;

/*
 * PROGRESSION - 6 
 * Go to JAVA Resouces - src/model and create a child class
 * called Pikachu inside the model package with the following arguments 
 * String characteristics 
 * String type 
 * String evolution 
 * String baseExp
 * 
 * Pikachu must extend the Pokemon class
 * Generate appropriate getters and setters 
 * Generate a six argument constructor with the following arguments
 * (pokemonName,pokemonNumber,characteristics,type,evolution,baseExp) and
 * pokemonName and pokemonNumber should refer to the parent constructor in the
 * Pokemon class.
 * 
 * pokemonName = Pikachu 
 * pokemonNumber = 25 
 * characteristics = Pikachu is an Electric-type Pokémon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pokémon franchise
 * mascot." 
 * type = "ELECTRIC" 
 * evolution = "RAICHU" 
 * baseExp = "112"
 */
public class Pikachu extends Pokemon {
	String characteristics;
	String type;
	String evolution;
	String baseExp;
	
	public String getCharacteristics(String characteristics) {
		return this.characteristics;
	}
	
	 public void setCharacteristics(String characteristics) {
		 this.characteristics=characteristics;
	 }
	
	public String getType(String type) {
		return this.type;
	}
	
	 public void setType(String type) {
		this.type=type;
	 }
	
	public String getEvolution(String evolution) {
		return this.evolution;
	}
	
	 public void setEvolution(String Evolution) {
			this.evolution=evolution;
		 }
	
	public String getBaseExp(String baseExp) {
		return this.baseExp;
	}
	
	 public void setBaseExp(String baseExp) {
			this.baseExp=baseExp;
		 }

	public Pikachu(String pokemonName, int pokemonNumber, String characteristics, String type, String evolution, String baseExp){
		super(pokemonName="Pikachu",pokemonNumber=25);
		this.characteristics = "Pikachu is an Electric-type Pokémon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pokémon franchise mascot.";
		this.type="ELECTRIC";
		this.evolution="RAICHU";
		this.baseExp="112";
		
	}
	
}