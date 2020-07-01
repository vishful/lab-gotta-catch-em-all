package model;


//PROGRESSION - 2 
//Go to JAVA Resouces - src/model and create a child class called Bulbasaur inside the model package with the following arguments
//String characteristics 
//String type
//String evolution
//String baseExp
//
//Bulbasaur must extend the Pokemon class
//Generate appropriate getters and setters
//Generate a six argument constructor with the following arguments (pokemonName,pokemonNumber,characteristics,type,evolution,baseExp) and pokemonName and pokemonNumber should refer to the parent constructor in the Pokemon class. 
//Use the predefined values given below as constructor arguments 
//pokemonName = Bulbasaur
//pokemonNumber = 001
//characteristics = "Bulbasaur is a Grass/Poison-type Pok�mon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pok�mon in the Kanto region."
//type = "POISON"
//evolution = "IVYSAUR"
//baseExp = "64" 


public class Bulbasaur extends Pokemon {
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

	
	public Bulbasaur(String pokemonName, int pokemonNumber, String characteristics, String type, String evolution, String baseExp){
		super(pokemonName="Bulbasaur",pokemonNumber=001);
		this.characteristics = "Bulbasaur is a Grass/Poison-type Pok�mon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pok�mon in the Kanto region.";
		this.type="POISON";
		this.evolution="IVYSAUR";
		this.baseExp="64";
		
	}
	
}
