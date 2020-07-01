package model;

//PROGRESSION - 1 
//Go to JAVA Resouces - src/model and create a parent class called Pokemon inside the model package - with the following arguments
//String pokemonName
//Int pokemonNumber
//
//Generate appropriate getters and setters.
//Generate a two-argument constructor in the Pokemon class
public class Pokemon {
int pokemonNumber;
String pokemonName;

public void getPokemon(int pNum, String p) {
	pokemonNumber=pNum;
	pokemonName=p;
}


public Pokemon(String pokemonName, int pokemonNumber) {
	this.pokemonName=pokemonName;
	this.pokemonNumber=pokemonNumber;
}
}