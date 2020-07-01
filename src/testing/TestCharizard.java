package testing;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.Bulbasaur;
import model.Charizard;

public class TestCharizard {
	@Test
	public void testCharacteristicsMethod() {
		Charizard p = new Charizard("AAA",4,"Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.","FIRE","CHARMELEON","240");
		String temp = "Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.";
		assertEquals(temp,p.getCharacteristics(temp));		
		try {
			Charizard p1 = new Charizard(null,0,null,null,null,null);
			temp = null;
			p1.getCharacteristics(temp);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testTypeMethod() {
		Charizard p = new Charizard("AAA",4,"Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.","FIRE","CHARMELEON","240");
		String temp = "FIRE";
		assertEquals(temp,p.getType(temp));		
		try {
			Charizard p1 = new Charizard(null,0,null,null,null,null);
			temp = null;
			p1.getType(temp);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testEvolutionMethod() {
		Charizard p = new Charizard("AAA",4,"Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.","FIRE","CHARMELEON","240");
		String temp = "CHARMELEON";
		assertEquals(temp,p.getEvolution(temp));		
		try {
			Charizard p1 = new Charizard(null,0,null,null,null,null);
			temp = null;
			p1.getEvolution(temp);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testBaseExpMethod() {
		Charizard p = new Charizard("AAA",4,"Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.","FIRE","CHARMELEON","240");
		String temp = "240";
		assertEquals(temp,p.getBaseExp(temp));		
		try {
			Charizard p1 = new Charizard(null,0,null,null,null,null);
			temp = null;
			p1.getBaseExp(temp);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

