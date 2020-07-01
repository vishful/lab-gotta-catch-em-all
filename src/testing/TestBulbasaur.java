package testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.Bulbasaur;
import model.Pokemon;

public class TestBulbasaur {
	
	@Test
	public void testCharacteristicsMethod() {
		Bulbasaur bulbasaur = new Bulbasaur("bulbsaur",4,"Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.","POISON","IVYSAUR","64");
		String temp = "Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.";
		assertEquals(temp,bulbasaur.getCharacteristics(temp));		
		try {
			Bulbasaur bulb = new Bulbasaur(null,0,null,null,null,null);
			temp = null;
			bulb.getCharacteristics(temp);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testTypeMethod() {
		Bulbasaur bulbasaur = new Bulbasaur("bulbsaur",4,"Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.","POISON","IVYSAUR","64");
		String temp = "POISON";
		assertEquals(temp,bulbasaur.getType(temp));		
		try {
			Bulbasaur p1 = new Bulbasaur(null,0,null,null,null,null);
			temp = null;
			p1.getType(temp);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testEvolutionMethod() {
		Bulbasaur bulbasaur = new Bulbasaur("bulbsaur",4,"Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.","POISON","IVYSAUR","64");
		String temp = "IVYSAUR";
		assertEquals(temp,bulbasaur.getEvolution(temp));		
		try {
			Bulbasaur p1 = new Bulbasaur(null,0,null,null,null,null);
			temp = null;
			p1.getEvolution(temp);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testBaseExpMethod() {
		Bulbasaur bulbasaur = new Bulbasaur("bulbsaur",4,"Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.","POISON","IVYSAUR","64");
		String temp = "64";
		assertEquals(temp,bulbasaur.getBaseExp(temp));		
		try {
			Bulbasaur p1 = new Bulbasaur(null,0,null,null,null,null);
			temp = null;
			p1.getBaseExp(temp);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}


