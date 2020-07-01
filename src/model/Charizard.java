package model;


//PROGRESSION - 3
//Go to JAVA Resouces - src/model and create a child class called Charizard inside the model package with the following arguments
//String characteristics 
//String type
//String evolution
//String baseExp
//
//Charizard must extend the Pokemon class
//Generate appropriate getters and setters
//Generate a six argument constructor with the following arguments (pokemonName,pokemonNumber,characteristics,type,evolution,baseExp) and pokemonName and pokemonNumber should refer to the parent constructor in the Pokemon class. 
//
//Use the predefined values given below as constructor arguments 
//pokemonName = Charizard
//pokemonNumber = 006
//characteristics = "Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers."
//type = "FIRE"
//evolution = "CHARMELEON"
//baseExp = "240" 
public class Charizard extends Pokemon {
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

	public Charizard(String pokemonName, int pokemonNumber, String characteristics, String type, String evolution, String baseExp){
		super(pokemonName="Charizard",pokemonNumber=006);
		this.characteristics = "Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.";
		this.type="FIRE";
		this.evolution="CHARMELEON";
		this.baseExp="240";
		
	}
	
}
