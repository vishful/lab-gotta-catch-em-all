package model;

//PROGRESSION - 5
//Go to JAVA Resouces - src/model and create a child class called Mew inside the model package with the following arguments
//String characteristics 
//String type
//String evolution
//String baseExp
//
//Mew must extend the Pokemon class
//Generate appropriate getters and setters
//Generate a six argument constructor with the following arguments (pokemonName,pokemonNumber,characteristics,type,evolution,baseExp) and pokemonName and pokemonNumber should refer to the parent constructor in the Pokemon class.
//
//Use the predefined values given below as constructor arguments 
//pokemonName = Mew
//pokemonNumber = 151
//characteristics = "Mew is a Psychic-type Mythical Pok�mon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine."
//type = "PSYCHIC"
//evolution = "NONE"
//baseExp = "64" 
public class Mew extends Pokemon {
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

	
	public Mew(String pokemonName, int pokemonNumber, String characteristics, String type, String evolution, String baseExp){
		super(pokemonName="Mew",pokemonNumber=151);
		this.characteristics = "Mew is a Psychic-type Mythical Pok�mon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.";
		this.type="PSYCHIC";
		this.evolution="NONE";
		this.baseExp="64";
		
	}
	
}